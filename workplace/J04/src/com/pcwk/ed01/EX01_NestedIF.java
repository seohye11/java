package com.pcwk.ed01;
import java.util.Scanner;

public class EX01_NestedIF {

	public static void main(String[] args) {
		
		// 중첩 if문 : if문 내에 if문이 있는 문장
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요>");
		String userId = scanner.nextLine();
		System.out.println("userId : "+ userId);
		
		//userId : java, passwd : 1234
		if(userId.equals("java")) {
			System.out.println("id일치");
			System.out.print("비밀번호를 입력하세요");
			String passwd = scanner.nextLine();
			
			if(passwd.equals("1234")) {
				System.out.println("비번 일치");
			}else {
				System.out.println("비번을 확인하세요");
			}
			
		}else{
			System.out.println("아이디을 확인하세요");
		}
		

	}

}
