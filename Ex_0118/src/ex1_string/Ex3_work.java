package ex1_string;

public class Ex3_work {
	public static void main(String[] args) {
		
		//문자열 str에 소문자 a가 몇 개 있는지를 출력
		//소문자 a : 1
		
		String str = "ADafkjldof9ojdf";
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 갯 수 : "+ count);	
		
	}//main

}
