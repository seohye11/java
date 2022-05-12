/**
* <pre>
* com.pcwk.ex01.reader
* Class Name : FileReaderEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex01.reader;

import java.io.FileReader;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class FileReaderEx01 implements LoggerManager{


	public static void main(String[] args) {
		
		//LOG.debug("Log4j");
		//C:\DCOM_20220127\01_JAVA\workspace\J20\src\com\pcwk\ex01\reader\reader.txt
		
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex01\\reader\\reader.txt";
		
		//2byte로 읽어서 한글, 한자 등 깨지지 않음
		try(FileReader fr = new FileReader(filePath);) {
			
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e){
			LOG.debug("--------------");
			LOG.debug(e.getMessage());
			LOG.debug("--------------");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		

	}

}
