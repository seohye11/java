package ex1_string;

public class Ex4_work {
	public static void main(String[] args) {
		
		//회문수 : 앞이나 뒤에서 일어도 똑같이 읽히는 숫자 (121, 131, 12321)
		//str의 값이 회문수인지를 판단하시오
		
		//토마토는(은) 회문수 입니다. length, charAt, equals
		
		String str = "토마토";
		String revers = "";
		
		//원본 str의 값을 뒤집어서 revers변수에 저장
		for(int i = str.length()-1; i >= 0; i--) {
			
			revers += str.charAt(i);
		}
		
		System.out.println(revers);
		
		if(str.equals(revers)) {
			
			System.out.println(str + "은(는) 회문수입니다.");
			
		}else {
			
			System.out.println(str + "은(는) 회문수가 아닙니다");
		}
		
		
		
	}//main

}
