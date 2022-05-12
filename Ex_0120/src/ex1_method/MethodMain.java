package ex1_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		mt.test();
		
		int su = 100;
		mt.valueTest(su);
		
		System.out.println("su : "+ su);
		
		System.out.println("-----------------");
		
		int su2 = 100;
		su2 = mt.valueTest2(su2);
		System.out.println(su2);
		
		
	}//main

}
