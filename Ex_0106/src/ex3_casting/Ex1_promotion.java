package ex3_casting;

public class Ex1_promotion {
    public static void main(String[] args) {
		
		//캐스팅(형변환)
		//1. 프로모션 캐스팅
		// - 큰 자료형에 작은 자료형을 대입하는 것(자동)
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n;
		System.out.println("d:" + d);
		
		char c = 'A'; //2byte 
		n = c;
		System.out.println("n:" + n);
		
	}//main	

}
