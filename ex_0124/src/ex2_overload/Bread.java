package ex2_overload;

public class Bread {
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	}
	
	public void makeBread(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.println("빵을 만들었습니다");
		}	
		System.out.println(cnt+ "개의 빵을 완성함");
	}
	
	public void makeBread(int cnt, String name) {
		for(int i = 0; i < cnt; i++) {
			System.out.println(name + "을 만들었습니다");
		}
		System.out.println(cnt+"개의 "+ name + "을 완성함");
	}

}
