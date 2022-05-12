package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class JDBCUtil {
	
	final static Logger LOG = Logger.getLogger(JDBCUtil.class);
	
	public static void close(Connection conn) {
		if(null != conn) {
			try {
				LOG.debug("Connection ÀÚ¿ø¹Ý³³");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ResultSet ÀÚ¿ø¹Ý³³
	 * @param rs
	 */
	public static void close(ResultSet rs) {
		if(null != rs) {
			try {
				LOG.debug("ResultSet ÀÚ¿ø¹Ý³³");
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * PreparedStatement ÀÚ¿ø¹Ý³³
	 * @param pstmt
	 */
	public static void close(PreparedStatement pstmt) {
		if(null != pstmt) {
			try {
				LOG.debug("PreparedStatement ÀÚ¿ø¹Ý³³");
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
