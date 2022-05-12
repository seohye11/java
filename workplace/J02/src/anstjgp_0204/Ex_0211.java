package anstjgp_0204;

public class Ex_0211 {

	public static void main(String[] args) {
		
		/* 메서드 : 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
		 *        멤버 함수(member function)라고도 함
		 *        객체가 수행하는 기능
		 *        중복되는 기능은 함수로 구현하여 1개의 메소드에 관리
		 * - 함수 정의 : 함수의 이름, 매개변수, 반환 값을 선언하고 코드로 구현
		 *         반환 타입 메서드이름 (타입 변수명, 타입 변수명){
		 *             //메서드 내부의 동작
		 *             return 값;
		 *         }
		 *   1) 함수 이름 : 함수의 기능과 관련하여 명명(카멜 표기법)
		 *   2) 매개 변수 : 함수 수행을 위해 필요한 변수
		 *   3) return : 함수의 수행 결과를 반환하기 위한 예약어
		 *   4) 함수의 반환형 : 반환 값의 자료형을 나타냄 반환 값이 없는 경우는 void라고 함
		 *
		 * - 함수 오버로딩 : 매개변수의 개수와 타입은 다르지만 이름이 같은 메서드를 여러개 정의하는 것
		 *               일반적으로 메서드를 사용할 때는 메서드의 이름으로 구분해서 사용
		 *               하지만 같은 기능을 하는 메서드가 매번 이름이 달라야 한다면 매우 비효율적
		 * 생성자 : 지금까지는 인스턴스 변수를 초기화할 때 참조변수를 통해서 일일이 초기화를 함
		 *        인스턴스 변수 개수가 많아지면 초기화 작업이 번거로움
		 *        인자있는 생성자를 생성하면 default 생성자는 JVM을 만들지 않음
		 * - 기본 생성자(default)
		 *       클래스 이름(){}
		 *       
		 * - 클래스 멤버(static)와 인스턴스 멤버간의 참조 및 호출       
		 *   1) 클래스를 설계할 때, 멤버변수 중 모든 인스턴스를 공통으로 사용하는 것에 static을 붙임
		 *   2) 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있음
		 *      클래스 변수는 클래스가 메모리에 올라갈 때 자동으로 생성
		 *   3) 클래스 메서드(static 변수)는 인스턴스 변수를 사용할 수 없음
		 *   4) 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려함
		 * - class 클래스명{
		 *         멤버변수
		 *         static 멤버변수
		 *         생성자(){}
		 *         메서드(){}
		 *         static메서드(){}
		 *   }
		 * - 상속과 다형성
		 *   상속 : 새로운 클래스를 작성할 때 효율적으로 코드를 작성하기 위해 존재하는 클래스의 속성을
		 *         물려받는 것
		 *   다형성 : 상속관계의 클래스에서 부모객체에 여러 타입의 자식 인스턴스들이 대입될 수 있는 성질
		 *   조상클래스 
		 *     = 부모클래스(parent class), 상위클래스(super class), 기반클레스(base class)  
		 *   자손 클래스
		 *     = 자식클래스(child calls), 하위클래스(sub class), 파생클래스(derived class)
		 * - 자바는 단일 상속만 가능
		 * - 오버라이딩(overriding)
		 * 	 : 자손 클래스에서 부모 클래스로부터 물려받은 메서드를 다시 작성하여 새롭게 정의하는 것
		 * - this : 인스턴스들이 메서드를 호출할 때, 메서드는 공용으로 사용하게 된다
		 *          이때 각 인스턴스의 정보를 저장하는 변수
		 * - this() : default 생성자 호출
		 * - super : 상속을 하면 자식의 멤버(변수, 메서드)와 이름이 겹치게 될 때가 있는데 이를 구분하기
		 *           위한 super.변수, super.메서드를 사용하면 자식의 멤버가 호출되지 않고 상속받은
		 *           부모의 멤버를 호출할 수 있다.
		 * - super() : 자식 생성자에서 부모 생성자를 호출할 때 사용
		 * - super() 조상 클래스의 생성자 호출
		 *        this() 또는 super()는 첫 줄에 호출해야 한다.
		 *        그렇지 않으면 컴파일러가 자동적으로 오류
		 *        super()를 명기하지 않으면 컴파일러가 자동으로 넣어준다         
		 */
	}

}














