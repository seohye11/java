package ex1_operator;

public class Ex2_opeator {
	 public static void main(String[] args) {
			
		   //논리연산자(&& || !): 비교연산자를 통한 연산이 두 개 이상 필요할 때 사용
		   int age = 22;
		   int limit = 25;
		   //&&(and) : 앞 쪽 연산이 거짓일 경우 뒤 쪽 연산을 수행하지 않는다.
		   //참 && 참 = 참
		   //참 && 거짓 = 거짓
		   //거짓 && 참 = 거짓
		   //거짓 && 거짓 = 거짓
		   boolean res = (limit - age) >= 3 && (age += 2) > 20;
		   System.out.println("res:"+ res);
		   
		     System.out.println("----------------------------");
		   
		   int n1 = 10;
		   int n2 = 20;
		   //||(or) : 앞 쪽 연산이 참일 경우 뒤 쪽 연산을 수행하지 않는다.
		   //참 || 참 = 참 
		   //참 || 거짓 = 참
		   //거짓 || 참 = 참
		   //거짓 || 거짓 = 거짓
		   res = (n1 += 10) > 20 || n1 - 10 == 10;
		   System.out.println(res);

		   res = true;
		   //!(not) : 참은 거짓으로, 거짓은 참으로 변경해주는 연산자(boolean에서만 쓸 수 있음)
		   System.out.println(!res);
		   
		   System.out.println(res);
		   
		     System.out.println("----------------------------");
		     
		   //증감연산자(++ --): 1씩 증가시키거나 1씩 감소시키는 연산자
		   //선행증감과 후행증감의 차이점을 알아두자.
		   int a = 10;
		   System.out.println("a:"+ ++a); //선행증감
		   
		   int b = 10;
		   System.out.println("b:"+ b++); //후행증감
		   System.out.println(b);
		   
		   b--; //11
		   b++; //10
		   --b; //10
		   b++; //10
		   ++b; //12
		   ++b; //13
		   --b; //12
		   b--; //12
		   System.out.println(b--);
		   System.out.println(b);
		   
		   System.out.println(b+=2);
		   
		 
	}//main

}
