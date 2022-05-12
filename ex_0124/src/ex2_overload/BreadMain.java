package ex2_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//빵을 만들었습니다 --makeBread() 호출시 한 줄만 출력	
		bread.makeBread();
		
		System.out.println("----------------");
		
		//빵을 만들었습니다
		//빵을 만들었습니다
		//요청하신 2개의 빵을 완성
		bread.makeBread(3);
		
		System.out.println("----------------");
		
		//팥빵을 만들었습니다
		//요청하신 1개의 팥빵을 완성
		bread.makeBread(5, "팥빵");
		
	}//main

}
