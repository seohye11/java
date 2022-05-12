package com.pcwk.board;

import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.cmn.SawonVO;
import com.pcwk.cmn.SearchVO;

public class BoardMain {
	
	final Logger LOG = Logger.getLogger(getClass());
	private BoardDao dao;
	private BoardVO board01;
	private SearchVO search01;
	
	public BoardMain() {
		dao = new BoardDao();
		board01 = new BoardVO(900001, "����_900001", "����_90001", 0, "", "pcwk", "","pcwk");
		
		search01 = new SearchVO("", "", 10, 1);
	}
	
	public void doSave() {
		int flag = dao.doSave(board01);
		if(1 == flag) {
			LOG.debug("-----------------------------------");
			LOG.debug("              ��� ����               ");
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("              ��� ����               ");
			LOG.debug("-----------------------------------");
			
		}
	}
	
	public void doDelete() {
		int flag = dao.doDelete(board01);
		if(1 == flag) {
			LOG.debug("-----------------------------------");
			LOG.debug("              ���� ����               ");
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("              ���� ����               ");
			LOG.debug("-----------------------------------");
		}
	}
	
	public boolean isSameVO(BoardVO orgVO, BoardVO vsVO) {
		
		boolean isSame = false;
		
		if(orgVO.getSeq() == vsVO.getSeq()
		&& orgVO.getTitle().equals(vsVO.getTitle())
		&& orgVO.getContents().equals(vsVO.getContents())
		&& orgVO.getRead_cnt() == (vsVO.getRead_cnt())
		&& orgVO.getReg_id().equals(vsVO.getReg_id())
		&& orgVO.getMod_id().equals(vsVO.getMod_id())) {
			isSame = true;
		}
		
		return isSame;
	}
	
	
	public void doSelectOne() {
		BoardVO outVO = dao.doSelectOne(board01);
		if(null != outVO) {
			LOG.debug("-----------------------------------");
			LOG.debug("              ��ȸ ����               ");
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("              ��ȸ ����               ");
			LOG.debug("-----------------------------------");
		}
	}	
	
	public void doUpdate() {
		BoardVO outVO = dao.doSelectOne(board01);//�ܰ� ��ȸ
		
		//��ȸ ������ ����
		outVO.setTitle(outVO.getTitle()+ "_u");
		outVO.setContents(outVO.getContents()+ "_u");
		outVO.setMod_id(outVO.getMod_id()+ "_u");
		
		//update����
		int flag = dao.doUpdate(outVO);
		
		//update������ ��ȸ
		BoardVO vsVO = dao.doSelectOne(outVO);
		
		if(1 == flag && isSameVO(outVO, vsVO)) {
			LOG.debug("-----------------------------------");
			LOG.debug("              ���� ����               ");
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("              ���� ����               ");
			LOG.debug("-----------------------------------");
		}
	}
	
	public void updateReadCnt() {
		//update����
		int flag = dao.updateReadCnt(board01);
		BoardVO vsVO = dao.doSelectOne(board01);
		
		if(flag == 1 && vsVO.getRead_cnt() == 1) {
			LOG.debug("-----------------------------------");
			LOG.debug("         ��ȸ count ���� ����          ");
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("         ��ȸ count ���� ����          ");
			LOG.debug("-----------------------------------");
		}
	}
	
	public void doRetrieve() {
		
		search01.setPageSize(20);
		search01.setPageNum(1);
		search01.setSearchDiv("40");
		search01.setSearchWord("����8");
		
		List<BoardVO> list = dao.doRetrieve(search01);
		if(list.size() > 0) {
			for(BoardVO vo :list) {
				LOG.debug("vo : "+ vo);
			}
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("            ��� ��ȸ ����             ");
			LOG.debug("-----------------------------------");
		}
	}
	
	public void totalCount() {
		int totalCnt = dao.totalCount(search01);
		if(totalCnt > 0) {
			LOG.debug("-----------------------------------");
			LOG.debug("            �� �ۼ�(����)"+ totalCnt   );
			LOG.debug("-----------------------------------");
		}else {
			LOG.debug("-----------------------------------");
			LOG.debug("            �� �ۼ�(����)"+ totalCnt   );
			LOG.debug("-----------------------------------");
		}
	}	

	public static void main(String[] args) {
		
		BoardMain main = new BoardMain();
		
		//����
		main.doDelete();
		
		//���
		main.doSave();
		
		//�ܰ� ��ȸ
		main.doSelectOne();
		
		//����
		main.doUpdate();
		
		//��ȸ �Ǽ� ����
		main.updateReadCnt();
		
		//��� ��ȸ
		main.doRetrieve();

		//�� ���� �� ��ȸ
		main.totalCount();	

	}

}