package ex1_method;

public class MethodTest {
	
	public void test() {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
	}
	
	
	public void valueTest( int n ) {
		n += 100;
		System.out.println("n : " + n);	
	}
	
	//    반환형
	public int valueTest2( int n ) {
		n += 100;
		System.out.println("n : "+ n);
		
		//반환형(int)이 있다면 반드시 return을 통해 반환형과 일치하는 타입(int)을
		//원래 있던 곳으로 돌려줘야 한다.
		
		return n;//return을 만나는 순간 자신을 호출했던 곳으로 값을 가지고 돌아간다.
		//그러므로 return 아래에는 어떤 코드도 추가할 수 없다.
	}

}
