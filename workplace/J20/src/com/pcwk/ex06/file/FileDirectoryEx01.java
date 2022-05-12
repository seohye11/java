/**
* <pre>
* com.pcwk.ex06.file
* Class Name : FileDirectoryEx01.java
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
package com.pcwk.ex06.file;

import java.io.File;
import java.io.IOException;

public class FileDirectoryEx01 {
	
	/**
	 * File API
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file\\FileDirectoryEx01.bak";
		
		//파일객체 생성
		//1) File file = new File(filePath);
		//2) File file = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file","FileDirectoryEx01.bak");
		//3)
		File dir = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file");
		File file = new File(dir, "FileDirectoryEx01.bak");
		
		//신규파일 생성
		boolean flag = file.createNewFile();
		System.out.println("신규파일 생성 : "+ flag);
		
		//File객체는 파일과 디렉토리를 처리
		System.out.println("파일 여부 : "+ file.isFile());
		System.out.println("디렉토리 여부 : "+ file.isDirectory());
		
		System.out.println("경로를 제외한 파일명 : "+ file.getName());
		System.out.println("파일이 속해있는 디렉토리 : "+ file.getParent());
		
		System.out.println("파일의 절대 경로 : "+ file.getAbsolutePath());
		
		//OS별 path Separator
		System.out.println("path Separator : "+ file.pathSeparator);
		System.out.println("path separator : "+ file.separator);
		System.out.println("=========================");
		
		System.out.println("파일의 read : "+ file.canRead());
		System.out.println("파일 write : "+ file.canWrite());
		System.out.println("파일 실행 : "+ file.canExecute());

	}

}
