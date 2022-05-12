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
				LOG.debug("Connection �ڿ��ݳ�");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ResultSet �ڿ��ݳ�
	 * @param rs
	 */
	public static void close(ResultSet rs) {
		if(null != rs) {
			try {
				LOG.debug("ResultSet �ڿ��ݳ�");
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * PreparedStatement �ڿ��ݳ�
	 * @param pstmt
	 */
	public static void close(PreparedStatement pstmt) {
		if(null != pstmt) {
			try {
				LOG.debug("PreparedStatement �ڿ��ݳ�");
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
