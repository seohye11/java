package ex1_singleArray;

public class Ex2_array {
	public static void main(String[] args) {
		
		//선언과 생성을 동시에
		char[]c_arr = new char[4];
		c_arr[0] = 'ㅅ';
		c_arr[1] = 'ㅓ';
		c_arr[2] = 'ㅎ';
		c_arr[3] = 'ㅖ';
		
		for(int i = 0; i < c_arr.length; i++) {
			
			System.out.print(c_arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("-------------------");
		
		//배열의 선언, 생성, 초기화를 한 번에
		String[] sArr = { "홍길동", "김길동", "오길동" };
		char[] cArr = { 'J', 'A', 'V', 'A' };
		int[] iArr = { 10, 20, 30 };
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
			
		}
		
	}//main

}
