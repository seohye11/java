package anstjgp_0204;

public class Ex_0214 {

	public static void main(String[] args) {
		
		/* Object클래스 : 모든 클래스의 조상
		 *              모든 클래스 상속계층도의 최상위에 있는 조상클래스
		 * package와 import
		 * - package : 클래스를 모아 놓은 일종의 집합
		 *             물리적인 디렉토리
		 * - import : 다른 패키지에 있는 클래스를 사용하고 싶을 때 
		 *   ex) import 패키지명.클래스명;
		 * 코딩 순서
		 *   : package문 -> import문 -> 클래스 선언
		 * -static import문
		 * - 제어자 : 클래스나 멤버의 사용을 제어하기 위해서 사용
		 *   >종류 : 외부에서 접근하는 것을 막는 접근제어자와 클래스 멤버를 의미하는 static,
		 *          상수를 만들거나 상속을 종료시키는 final 등이 있음
		 *        )접근제어자 : 외부에서 접근할 수 있는 정도와 범위를 지정
		 *          public > protected > default > private
		 *          
		 *          public : 같은 클래스, 같은 패키지, 자손 클래스, 전체
		 *       protected : 같은 클래스, 같은 패키지, 자손 클래스
		 *         default : 같은 클래스, 같은 패키지
		 *         private : 같은 클래스
		 *         
		 *        )정보은닉(information hiding)
		 *          private접근 제어자 
		 *          : 클래스의 외부에서 클래스 내부의 멤버변수나 메서드에 접근하지 못하게 하는 경우 사용
		 *            멤버 변수나 메서드를 외부에서 접근하지 못하도록 하여 오류를 줄임
		 *            변수의 경우는 메서드를 통해 접근 getXXX(), setXXX()메서드 사용
		 * - static제어자 : 변수나 메서드 앞에 붙어서 이 멤버가 클래스 멤버라는 것을 의미
		 *                클래스 멤버는 처음 클래스가 메모리에 로드될 때 생성되기 때문에 인스턴스를
		 *                생성하지 않아도 사용 가능 
		 * - final : 문자 그대로 종결의라는 의미 final이 붙으면 내용이나 값을 변경하지 못하게 된다
		 *        클래스 -> 변경될 수 없는 클래스, 상속을 허용하지 않는다  ex)String 클래스
		 *        메서드 -> 오버라이딩 할 수 없다
		 *       멤버변수 -> 상수
		 *       지역변수 -> 상수 
		 *       
		 * - 다형성(polymorphism) : 객체지향언어에서 객체의 자료형을 변경하는 것      
		 *                        여러가지 형태를 가질수 있는 능력을 의미
		 *   > 다형성의 활용
		 *   > 참조변수의 형변환 : 기본형 변수와 같이 참조변수도 형변환이 가능
		 *                    단, 서로 상속관계에 있는 클래스 사이에서만 가능
		 *     )자손타입 -> 조상타입(Up-casting) : 형변환 생략 가능
		 *     )조상타입 -> 자손타입(Down-casting) : 형변환 생략 불가
		 *     
		 * - 여러 종류의 객체를 배열로 다루기
		 * 
		 * 
		 * 
		 * 
		 */  
	}

}















