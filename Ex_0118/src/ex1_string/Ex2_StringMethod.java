package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//메서드 : 어떠한 작업을 수행하기 위한 명령문들의 집합
		//자주 사용되는 기능을 미리 만들어 두고 필요할 때만 가져다 쓸 수 있도록 제공
		String name = "Hong Gil Dong";
		
		//name 객체가 가진 문장의 길이를 알려준다.
	    int index = name.length();
	    System.out.println("name의 길이 : "+ index);
	    
	    index = name.indexOf('o');
	    System.out.println("맨 처음 발견한 o의 위치 : "+ index);
	    
	    index = name.lastIndexOf('o');
	    System.out.println("맨 뒤에 있는 o의 위치 : "+ index);
	    
	    char r = name.charAt(3);
	    System.out.println("추출한 문자 : " + r);
	    
	    String s1 = "apple";
	    if(s1.equals("apple")) {
	    	System.out.println("s1의 값은 apple");
	    }
	    
	    s1 = " apple ";
	    s1 = s1.trim();//문장 앞 뒤의 의미없는 공백을 제거
	    
	    if(s1.equals("apple")) {
	    	System.out.println("값이 같습니다");
	    }
	    
	    String exam = "apple";
	    String answer = "Apple";
	    
	    //문장의 대소문자를 구별하지 않고 값만을 비교하는 메서드
	    if(exam.equalsIgnoreCase(answer)) {
	    	System.out.println("정답 사과. 맞추셨습니다");    	
	    }
		
	}//main

}











