package ex1_contral_statement;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else : 조건이 참일 때와 거짓일 때에 대한 결과를 모두 수행할 수 있는 제어문
		//if( 조건식 ){
		//   조건식이 참일 때 실행되는 영역
		//}else{
		//   조건식이 거짓일 때 반드시 실행되는 영역
		//}
		
		int n = 40;
		String str = "";
				
		if( ++n >= 50 ) {
			//if문이 실행됐다면 else 영역은 실행하지 않는다.
			str = "50이상의 수";
		}else {
			//if문이 실행되지 않았을 경우 else 영역이 반드시 호출
			str = "50미만의 수";
		}
		
		System.out.println(str);
		
		  System.out.println("--------------------------");
		
		//변수 age에 나이를 대입하고 30세 이상이면
		//드실만큼 드셨군요를, 그렇지 않다면 조금 더 드셔도 될 둣을 출력하는
		//if-else문을 만들어보자
		
		int age = 28;
		String sta = "";
	    if( age >= 30 ) {
	    	sta = "드실만큼 드셨군요";
	    }else{
	    	sta = "조금 더 드셔도 될 듯";
	    }
	    System.out.println(sta);
	   
	    //또는
	    
	    if( age >= 30 ) {
	    	System.out.println("드실만큼 드셨네요");
	    }else {
	    	System.out.println("조금 더 드셔도 될 듯");
	    }
	    
	}//main


}
