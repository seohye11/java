package com.pcwk.oop01;

public class Student {
		
		// 메서드 : 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
		//        멤버 함수(member function)라고도 함 
		
		//속성
		int studentId; //학번
		String name;   //이름
		int grade;     //학년
		String address;//주소
		
		//메서드
		void showStudentInfo(){
			System.out.println(studentId+ ","+ name);
			System.out.println(grade+ ","+ address);
		}
}
