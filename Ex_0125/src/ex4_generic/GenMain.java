package ex4_generic;

public class GenMain {
	public static void main(String[] args) {
		
		//Gen<제네릭타입>
		//제너릭타입은 반드시 클래스 형태의 데이터가 들어가야 한다(기본자료형으로 지정X)
		//int -> Integer
		//char -> Character
		//boolean -> Boolean
		//byte -> Byte
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
		
		Gen<String> g1 = new Gen<String>();
		g1.setValue("hi");
		String res = g1.getValue();
		System.out.println(res);
		
		Gen<Character> g2 = new Gen<Character>();
		g2.setValue('홍');
		char result = g2.getValue();
		System.out.println(result);	
		
		
	}//main

}
