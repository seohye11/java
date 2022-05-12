package com.pcwk.api.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.log4j.*;

public class StringEcoding {
	
	final static Logger LOG = Logger.getLogger(StringEcoding.class);

	public static void main(String[] args) {
		
		String str = "가";
		
		try {
			byte[] bArr = str.getBytes("UTF-8");
			byte[] bArrMS = str.getBytes("CP949");
			
			//한글 : 3byte
			LOG.debug("UTF-8 bArr : "+ Arrays.toString(bArr));
			LOG.debug("UTF-8 : "+ new String(bArr, "UTF-8"));
			
			//한글 : 2byte
			LOG.debug("CP949 bArrMS : "+ Arrays.toString(bArrMS));
			LOG.debug("CP949 : "+ new String(bArrMS,"CP949"));
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		

	}

}
