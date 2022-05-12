package com.pcwk.cmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class PConnection {
	
	final Logger LOG = Logger.getLogger(getClass());
	
	public Connection connect() {
		
		Connection connection = null;//DB���� ����
		
		//jdbc:oracle:thin:@IP:PORT:����DB��Ī
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";//URL
		String dbUSER = "scott";//ID
		String dbPASS = "pcwk";//���
		
		try {
			//jdbc oracld driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//db����
			connection = DriverManager.getConnection(dbURL, dbUSER, dbPASS);
			LOG.debug("connection : " + connection);
			
		} catch (ClassNotFoundException e) {
			LOG.debug("ClassNotFoundException : "+ e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			LOG.debug("SQLException : "+ e.getMessage());
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
