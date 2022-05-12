package ex2_inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		
		//상속 : 부모가 보유한 자원의 전부 or 일부를 자식이 물려 받아 사용하는 것
		
		Child c = new Child();
		
		//자식클래스는 부모가 허용하는 범위 내의 모든 자원을 마음대로 가져다가 사용할 수 있다.
		System.out.println(c.car);
		System.out.println(c.money);
		System.out.println(c.str);
		
		Parent p = new Parent();
		//상속관계의 객체여도 부모는 자식클래스의 속성을 마음대로 가져다가 사용할 수 없다.
		//p.car;
		
		String ss = ((Child)p).car;
		System.out.println(ss);//옛버전에선 가능, 현재 불가능
		
	}//main

}
