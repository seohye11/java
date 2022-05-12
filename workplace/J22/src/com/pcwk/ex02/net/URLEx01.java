package com.pcwk.ex02.net;

import java.net.*;

public class URLEx01 {

	public static void main(String[] args) {
		
		//URL: 인터넷에 존재하는 여러 서버들이 제공하는 지원에 접근할 수 있는 주소를 표현하기 위한 것    
		//     (= 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조)
		
		try {
			URL url = new URL("http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022");
			
			//호스트명과 포트번호
			System.out.println("호스트명과 포트번호 : "+ url.getAuthority());
			System.out.println("포트번호 : "+ url.getDefaultPort());
			System.out.println("프로토콜 : "+ url.getProtocol());
			System.out.println("쿼리 : "+ url.getQuery());
			System.out.println("전체 주소 : "+ url.toURI());
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
