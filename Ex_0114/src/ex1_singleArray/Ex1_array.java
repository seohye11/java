package ex1_singleArray;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : '같은 자료형끼리 모아두는 하나의 묶음'
		//효율적인 자원 관리를 위해 반드시 필요
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언
		int[] arr; 
		
		//2) 배열 생성
		arr = new int[5];
		
		//3) 배열의 index초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500; <-- 없는 index에는 데이터를 추가할 수 없다
		
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = 10 * ( i + 1 );
			System.out.println( arr[i] );
		}
		
	}//main

}
