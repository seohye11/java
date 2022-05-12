package com.pcwk.array;

public class EX01_Array01 {

	public static void main(String[] args) {
		
		// 배열(array) : 같은 타입의 변수를 하나의 묶음으로 관리할 때 사용 
		//             자료를 순차적으로 관리
		
		// 배열 초기화시 배열의 갯수를 명시하지 않음
		// ex)int[] studentId = new int[3] {101,102,103};
		
		int[] studentId = {101,102,102};
		
		System.out.println("studentId[0] : "+ studentId[0]);
		System.out.println("studentId[1] : "+ studentId[1]);
		
		int add = studentId[0] + studentId[1];
		System.out.println("add = "+ add);
		
		System.out.println("배열의 길이 : "+ studentId.length);
		
		//배열에 있는 모든 값 출력하기
		for(int i = 0; i < 3; i++) {
			System.out.println(studentId[i]);
		}
		System.out.println("---------------------------------");
		
		studentId[0] = studentId[0] + 100;
		studentId[1] = studentId[1] + 100;
		System.out.println("studentId[0] : "+ studentId[0]);
		System.out.println("studentId[1] : "+ studentId[1]);		

	}

}
