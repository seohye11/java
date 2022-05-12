package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//디모션 캐스팅
		// - 작은 자료형에 큰 자료형이 대입되는 것(자동으로 이루어지지 않음)
		char c = 'D'; //2byte
		int n = c + 1; //4byte
		c = (char)n;
		System.out.println("c:"+c);

		float f = 5.5f; //4.?byte
		int i = 0; //4byte
		
		i = (int)f;
		System.out.println("i:"+i);
	
	}//main

}
