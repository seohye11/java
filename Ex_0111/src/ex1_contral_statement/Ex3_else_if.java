package ex1_contral_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if : 여러개의 조건비교가 필요할 때 사용
		
		int num = 75;
		String str = "";
		
		if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ){
			str = "B";
		}else if( num >= 70 ) {
			str = "C";
		}else if( num >= 60 ) {
			str = "D";
		}else if( num <= 59 ) {
			str = "F";
		}
		
		System.out.println(str);
		
		/*
		 * if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ){
			str = "B";
		}else if( num >= 70 ) {
			str = "C";
		}else if( num >= 60 ) {
			str = "D";
		}else {
			//위의 모든 조건이 거짓일 때 마지막에 반드시 수행되는영역 
		}
        */
		
	}//main


}
