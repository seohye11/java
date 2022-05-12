package ex3_override;

public class Snake extends Animal{
	
	String sensor = "밤눈이 좋음";
	
	//오버라이딩
	//'메서드의 재정의'의 의미를 가지며, 상속관계의 객체에서
	//부모의 메서드를 그대로 가져오되 내용만 자식사정에 맞도록 재정의 하는 것
	@Override
	public int getLeg() {
		return 0;
	}
	
}
