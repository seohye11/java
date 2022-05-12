package com.pcwk.cmn;

import java.util.Scanner;

public class Movieif {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("종류를 입력하세요");
		
		String kind = scanner.next();
		
		if(kind.equals("영화")) {
			
			System.out.println("스파이더맨");
			System.out.println("킹스맨");
			System.out.println("제목을 입력하세요");
			
			String title = scanner.next();
			
			if(title.equals("스파이더맨")|title.equals("킹스맨")) {
				
				System.out.println("5000포인트입니다");
			}
		}else if(kind.equals("드라마")){
			
			System.out.println("기상청사람들");
			System.out.println("2521");
			System.out.println("제목을 입력하세요");
			
			String title = scanner.next();
			
			if(title.equals("기상청사람들")|title.equals("2521")) {
				
				System.out.println("3000포인트입니다");
			}
			
		}else
		System.out.println("잘못 입력하셨습니다");
		

	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
