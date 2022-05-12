package ex2_method;

public class Ex1_method {
	
	public String yourName(String n1, String n2, int n3, char n4) {
	
		String result = "저의 이름은 " + n1 + n2 +
				        "이고, 나이는 "+ n3 + 
				        "이고,혈액형은 "+ n4 + "형 입니다";
		
		return result;
		
	}
	
	//구구단 출력 메서드
	public void showTable(int dan) {
		
		System.out.println(dan+ "단");
		
		for(int i = 1; i <= 9; i++) {
			
			System.out.println(dan +" * "+ i +" = "+ (dan * i));
			
		}//for
		
	}

}
