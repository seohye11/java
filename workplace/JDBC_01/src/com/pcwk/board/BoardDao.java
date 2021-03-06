package com.pcwk.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.JDBCUtil;
import com.pcwk.cmn.PConnection;
import com.pcwk.cmn.SawonVO;
import com.pcwk.cmn.SearchVO;
import com.pcwk.cmn.WorkDiv;

public class BoardDao implements WorkDiv<BoardVO> {
	
	final Logger LOG = Logger.getLogger(getClass());
	
	private PConnection pConnection;
	
	public BoardDao() {
		pConnection = new PConnection();
	}
	
	/**
	 * 총글수
	 * @param dto
	 * @return 총건수
	 */
	public int totalCount(DTO dto) {
		int totalCnt = 0;
		
		SearchVO inVO = (SearchVO) dto;
		
		//------------------------------------------------
		// JDBC 연결
		//1. JDBC DRIVER LOADING
		//2. CONNECTION 생성
		//3. PreparedStatement 생성
		//4. 쿼리 실행
		//5. 뭘리 실행 결과 처리
		//6. 자원반납 (CLOSE)
		//   -ResultSet
		//   -PreparedStatement
		//   -Connection
		//------------------------------------------------
		
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//SQL + data
		ResultSet rs = null;//DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(50);
		
		//검색 조건 처리
		StringBuilder sbWhere = new StringBuilder(50);
		
		//1. DB연결
		conn = pConnection.connect();
		
		if(null != inVO) {
			
			if(inVO.getSearchDiv().equals("30")) {//WHERE deptno LIKE 'searchWord%'
				sbWhere.append("WHERE contents LIKE ? || '%' ");
				
			}else if(inVO.getSearchDiv().equals("20")) {//WHERE ename LIKE 'searchWord%'
				sbWhere.append("WHERE title LIKE ? || '%' ");

			}else if(inVO.getSearchDiv().equals("10")) {//WHERE depno LIKE 'searchWord%'
				sbWhere.append("WHERE seq LIKE ? || '%' ");
				
			}else if(inVO.getSearchDiv().equals("40")) {//WHERE depno LIKE 'searchWord%'
				sbWhere.append("WHERE title LIKE ? || '%' ");
				sbWhere.append("OR contents LIKE ? || '%' ");
				
			}
			
		}
		//2. SQL작성
		sb.append(" SELECT COUNT (*) totalCnt          \n");
		sb.append(" FROM board                         \n");
		
		//조건절
		sb.append(" " + sbWhere.toString());
		
		LOG.debug("query : \n"+ sb.toString());
		LOG.debug("param : "+ inVO.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			if(null != inVO && !inVO.getSearchDiv().equals("")) {//검색조건이 있으면
				if(inVO.getSearchDiv().equals("10")) {
					pstmt.setString(1, inVO.getSearchWord());
				}else if(inVO.getSearchDiv().equals("20")) {
					pstmt.setString(1, inVO.getSearchWord());
				}else if(inVO.getSearchDiv().equals("30")) {
					pstmt.setString(1, inVO.getSearchWord());
				}else if(inVO.getSearchDiv().equals("40")) {
					pstmt.setString(1, inVO.getSearchWord());
					pstmt.setString(2, inVO.getSearchWord());
				}
			}
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalCnt = rs.getInt("totalCnt");
			}
			
			LOG.debug("totalCnt : "+ totalCnt);
		}catch(SQLException e) {
			LOG.debug("SQLException : "+ e.getMessage());
			e.printStackTrace();
		}finally {
			
			JDBCUtil.close(rs);
			
	           //pstmt 자원반납
	        JDBCUtil.close(pstmt);
	           
	           //conn 자원반납
	        JDBCUtil.close(conn);	
					
		}

		return totalCnt;
	}
	
	
	/**
	 * 조회 count 증가
	 * @param dto
	 * @return 1(성공)/0(실패)
	 */
	public int updateReadCnt(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		//1. DB연결
		conn = pConnection.connect();
		
		//2. SQL작성
		sb.append(" UPDATE board                  \n");
		sb.append(" SET read_cnt = read_cnt + 1   \n");
		sb.append(" WHERE seq = ?                 \n");
		
	    LOG.debug("query : \n"+ sb.toString());
	    LOG.debug("param : "+ dto.toString());
	    
	    try {
	    	
	    	pstmt = conn.prepareStatement(sb.toString());
	    	
	    	pstmt.setInt(1, dto.getSeq());
	    	
	    //4. SQL실행
	    	flag = pstmt.executeUpdate();
	    
	    //5. SQL실행결과
	    	LOG.debug("flag : "+ flag);
	    	
	    	
	    }catch(SQLException e) {
	    	
	    	LOG.debug("SQLException : "+ e.getMessage());
	    	e.printStackTrace();
	    	
	    }finally {
	    	
	    	//pstmt 자원반납
	    	JDBCUtil.close(pstmt);
	    	
	    	//conn자원반납
	    	JDBCUtil.close(conn);
	    }
	    
		return flag;
	}
	
	
	@Override
	public List<BoardVO> doRetrieve(DTO dto) {
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		SearchVO inVO = (SearchVO) dto;
		
		//------------------------------------------------
		// JDBC 연결
		//1. JDBC DRIVER LOADING
		//2. CONNECTION 생성
		//3. PreparedStatement 생성
		//4. 쿼리 실행
		//5. 뭘리 실행 결과 처리
		//6. 자원반납 (CLOSE)
		//   -ResultSet
		//   -PreparedStatement
		//   -Connection
		//------------------------------------------------
		
		
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//sql+data
		ResultSet rs = null; //DB에서 전달된 정보 추출
		StringBuilder sb = new StringBuilder(300);
		
		//검색 조건 처리
		StringBuilder sbWhere = new StringBuilder(100);
		
		//1. DB연결
		conn = pConnection.connect();
		
		//검색조건 : searchDiv(검색조건),searchWord(검색어)
		//seq = 10
		//title = 20
		//contents = 30
		//title + contents
		if(null != inVO){
				
			if(inVO.getSearchDiv().equals("30")) {//WHERE deptno LIKE 'searchWord%'
				sbWhere.append("WHERE contents LIKE ? || '%' ");
				
			}else if(inVO.getSearchDiv().equals("20")) {//WHERE ename LIKE 'searchWord%'
				sbWhere.append("WHERE title LIKE ? || '%' ");

			}else if(inVO.getSearchDiv().equals("10")) {//WHERE depno LIKE 'searchWord%'
				sbWhere.append("WHERE seq LIKE ? || '%' ");
				
			}else if(inVO.getSearchDiv().equals("40")) {//WHERE depno LIKE 'searchWord%'
				sbWhere.append("WHERE title LIKE ? || '%' ");
				sbWhere.append("OR contents LIKE ? || '%' ");
				
			}
		}
			
		
		
		//2. SQL작성
		sb.append(" SELECT A.seq,                                    \n");
		sb.append("        A.rnum AS num,                            \n");
		sb.append("        A.title AS title,                         \n");
		sb.append("        A.read_cnt,                               \n");
		sb.append("        TO_CHAR(a.mod_dt,'YYYY/MM/DD') AS mod_dt, \n");
		sb.append("        A.mod_id                                  \n");
		sb.append(" FROM(                                            \n");
		sb.append("     SELECT ROWNUM AS rnum, t1.*                  \n");
		sb.append("     FROM(                                        \n");
		sb.append("         SELECT*                                  \n");
		sb.append("         FROM board                               \n");
	   
	    //조건절
	    sb.append("\t\t\t"+ sbWhere.toString());
	    
		sb.append("         ORDER BY mod_dt DESC)t1                  \n");
		sb.append("     WHERE ROWNUM <= (?*(?-1)+?)                  \n");
		sb.append(" )A                                               \n");
		sb.append(" WHERE rnum >= (?*(?-1)+1)                        \n");
	    
	    LOG.debug("query : \n"+ sb.toString());
	    LOG.debug("param : "+ inVO.toString());
	
		
		try {
			
			pstmt = conn.prepareStatement(sb.toString());
			
			if(null != inVO && !inVO.getSearchDiv().equals("")) {//검색조건이 있으면
				if(inVO.getSearchDiv().equals("10")) {
					pstmt.setString(1, inVO.getSearchWord());
					pstmt.setInt(2, inVO.getPageSize());
					pstmt.setInt(3, inVO.getPageNum());
					pstmt.setInt(4, inVO.getPageSize());
					pstmt.setInt(5, inVO.getPageSize());
					pstmt.setInt(6, inVO.getPageNum());
				}else if(inVO.getSearchDiv().equals("20")){
					pstmt.setString(1, inVO.getSearchWord());
					pstmt.setInt(2, inVO.getPageSize());
					pstmt.setInt(3, inVO.getPageNum());
					pstmt.setInt(4, inVO.getPageSize());
					pstmt.setInt(5, inVO.getPageSize());
					pstmt.setInt(6, inVO.getPageNum());					
				}else if(inVO.getSearchDiv().equals("30")){
					pstmt.setString(1, inVO.getSearchWord());
					pstmt.setInt(2, inVO.getPageSize());
					pstmt.setInt(3, inVO.getPageNum());
					pstmt.setInt(4, inVO.getPageSize());
					pstmt.setInt(5, inVO.getPageSize());
					pstmt.setInt(6, inVO.getPageNum());					
				}else if(inVO.getSearchDiv().equals("40")){
					pstmt.setString(1, inVO.getSearchWord());
					pstmt.setString(2, inVO.getSearchWord());
					pstmt.setInt(3, inVO.getPageSize());
					pstmt.setInt(4, inVO.getPageNum());
					pstmt.setInt(5, inVO.getPageSize());
					pstmt.setInt(6, inVO.getPageSize());
					pstmt.setInt(7, inVO.getPageNum());					
				}

			}else {//검색조건 전체		
				pstmt.setInt(1, inVO.getPageSize());
				pstmt.setInt(2, inVO.getPageNum());
				pstmt.setInt(3, inVO.getPageSize());
				pstmt.setInt(4, inVO.getPageSize());
				pstmt.setInt(5, inVO.getPageNum());
			}
			
		//4. SQL실행 : ResultSet
			rs = pstmt.executeQuery();
			
		//5. return 받은 ResultSet에서 DB에서 전달된 데이터 추출
			while(rs.next()) {
				BoardVO outVO = new BoardVO();
				
				outVO.setSeq(rs.getInt("SEQ"));
				outVO.setNo(rs.getInt("NUM"));
				outVO.setTitle(rs.getString("TITLE"));
				outVO.setRead_cnt(rs.getInt("read_cnt"));
				outVO.setMod_dt(rs.getString("mod_dt"));	
				outVO.setMod_id(rs.getString("mod_id"));
				
				boardList.add(outVO);
			}
			
			
		}catch(SQLException e) {
			LOG.debug("SQLException : "+ e.getMessage());
			e.printStackTrace();
			
		}finally {
			
			//rs 자원반납
			JDBCUtil.close(rs);
			
			//pstmt 자원반납
			JDBCUtil.close(pstmt);
			
			//conn 자원반납
			JDBCUtil.close(conn);				
		}
		
		return boardList;
	}

	@Override
	public int doSave(BoardVO dto) {
		
		int flag = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder(100);
		
		//1. DB연결
		conn = pConnection.connect();
		
		//seq = 10
		//title = 20
		//contents = 30
		//title + contents
		
		//2. SQL 작성
		sb.append("INSERT INTO board (   \n");
		sb.append("    seq,              \n");
		sb.append("    title,            \n");
		sb.append("    contents,         \n");
		sb.append("    read_cnt,         \n");
		sb.append("    reg_id,           \n");
		sb.append("    mod_id            \n");
		sb.append(") VALUES (            \n");
		sb.append("    ?,              \n");
		sb.append("    ?,              \n");
		sb.append("    ?,              \n");
		sb.append("    ?,              \n");
		sb.append("    ?,              \n");
		sb.append("    ?               \n");
		sb.append(")                     \n");
		
		LOG.debug("query : \n"+sb.toString());
		LOG.debug("param : "+ dto.toString());
		
		try {
		//3. param전달
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContents());
			pstmt.setInt(4, 0);
			pstmt.setString(5, dto.getReg_id());
			pstmt.setString(6, dto.getMod_id());
			
		//4. SQL 실행
			flag = pstmt.executeUpdate();
		
		//5. SQL실행결과	
			LOG.debug("flag : "+ flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : "+ e.getMessage());
			e.printStackTrace();
		//6. 자원반납
		}finally {
			
			JDBCUtil.close(pstmt);
			
			JDBCUtil.close(conn);
			
		}
		
		return flag;
	}

	@Override
	public int doDelete(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//sql+데이터
		StringBuilder sb = new StringBuilder(100);		
		
		//1. DB연결
		conn = pConnection.connect();
				
		//2. SQL작성
		sb.append(" DELETE FROM board   \n");
		sb.append(" WHERE SEQ = ?     \n");

		LOG.debug("query : \n"+ sb.toString());
		LOG.debug("param : \n"+ dto.toString());	
		
		try {
			//트렌젝션 처리
			//conn.setAutoCommit(true);트랜젝션 자동 commit
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, dto.getSeq());
			
		//4. SQL실행
			flag = pstmt.executeUpdate();
			
		//5. SQL실행결과
			LOG.debug("flag : "+ flag);
			
		}catch(SQLException e) {
			LOG.debug("SQLException : "+ e.getMessage());
			e.printStackTrace();
			
		//6. 자원반납
		}finally {
				
			//pstmt 자원반납
			JDBCUtil.close(pstmt);
				
			//conn 자원반납
			JDBCUtil.close(conn);
		}		
		
		return flag;
	}

	@Override
	public BoardVO doSelectOne(BoardVO dto) {
		BoardVO outVO = null; //return
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//SQL + 데이터
		ResultSet rs = null;//DB에서 전달된 정보 수축
		StringBuilder sb = new StringBuilder(50);
		
		//1. DB연결
		conn = pConnection.connect();
				
		//2. SQL작성		
		sb.append(" SELECT                                                   \n");
		sb.append("     seq,                                                 \n");
		sb.append("     title,                                               \n");
		sb.append("     contents,                                            \n");
		sb.append("     read_cnt,                                            \n");
		sb.append("     TO_CHAR(reg_dt,'YYYY/MM/DD HH24:MI:SS') AS reg_dt,   \n");
		sb.append("     reg_id,                                              \n");
		sb.append("     TO_CHAR(mod_dt,'YYYY/MM/DD HH24:MI:SS') AS mod_dt,   \n");
		sb.append("     mod_id                                               \n");
		sb.append(" FROM board                                               \n");
		sb.append(" WHERE seq = ?                                            \n");
			
	    LOG.debug("query: \n "+ sb.toString());
		LOG.debug("param : "+ dto.toString());	
			
		try {
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1,dto.getSeq());
			
		//4. SQL실행 : ResultSet
			rs = pstmt.executeQuery();
			
		//5. return 받은 ResultSet에서 DB에서 전달된 데이터 추출	
			if(rs.next()) {
				outVO = new BoardVO();
				
				outVO.setSeq(rs.getInt("seq"));
				outVO.setTitle(rs.getString("title"));
				outVO.setContents(rs.getString("contents"));
				outVO.setRead_cnt(rs.getInt("read_cnt"));
				outVO.setReg_dt(rs.getString("reg_dt"));	
				outVO.setReg_id(rs.getString("reg_id"));	
				outVO.setMod_dt(rs.getString("mod_dt"));	
				outVO.setMod_id(rs.getString("mod_id"));	
			}
			LOG.debug("outVO: "+outVO);
			
		}catch(SQLException e) {
			
			LOG.debug("SQLException : "+ e.getMessage());
			
		}finally {
			
			//rs 자원반납
			JDBCUtil.close(rs);
			
			//pstmt 자원반납
			JDBCUtil.close(pstmt);
			
			//conn 자원반납
			JDBCUtil.close(conn);
		}		
		
		return outVO;
	}

	@Override
	public int doUpdate(BoardVO dto) {
		int flag = 0;
		
		Connection conn = null;//DB연결 정보
		PreparedStatement pstmt = null;//SQL + 데이터
		StringBuilder sb = new StringBuilder(100);
		
		//1. DB연결
		conn = pConnection.connect();
		
		//2. SQL작성
		sb.append(" UPDATE board            \n");
		sb.append(" SET title = ?,          \n");
		sb.append("     contents = ?,       \n");
		sb.append("     mod_dt = SYSDATE,   \n");
		sb.append("     mod_id = ?          \n");
		sb.append(" WHERE seq = ?           \n");
		
	    LOG.debug("query : \n"+ sb.toString());
	    LOG.debug("param : "+ dto.toString());
	    
	    try {
	    	
	    	pstmt = conn.prepareStatement(sb.toString());
	    	
	    	pstmt.setString(1,dto.getTitle());
	    	pstmt.setString(2, dto.getContents());
	    	pstmt.setString(3, dto.getMod_id());
	    	pstmt.setInt(4, dto.getSeq());
	    	
	    //4. SQL실행
	    	flag = pstmt.executeUpdate();
	    
	    //5. SQL실행결과
	    	LOG.debug("flag : "+ flag);
	    	
	    	
	    }catch(SQLException e) {
	    	
	    	LOG.debug("SQLException : "+ e.getMessage());
	    	e.printStackTrace();
	    	
	    }finally {
	    	
	    	//pstmt 자원반납
	    	JDBCUtil.close(pstmt);
	    	
	    	//conn자원반납
	    	JDBCUtil.close(conn);
	    }
	    
		return flag;		
		
	}
}
