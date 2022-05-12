package ex4_generic;

public class Gen<A> {
	
	//제네릭 프로그래밍
	//일반적인 코드를 작성하고 이 코드를 다양한 타입의 변수나 객체에 대하여
	//재활용이 가능하도록 하는 프로그래밍 기법
	
	private A value;
	
	//setter
	public void setValue( A val ) {
		value = val;
	}
	
	//getter
	public A getValue() {
		return value;
	}

}
