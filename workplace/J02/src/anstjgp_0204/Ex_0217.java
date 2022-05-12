package anstjgp_0204;

public class Ex_0217 {

	public static void main(String[] args) {
		
		/* API(Application Programming Interface)
		 * : 자바에서 개발자들을 위해 기본적으로 제공하는 클래스
		 * - Object 클래스 : 모든 클래스의 최상위 클래스 java.lang.Object에 속함
		 *                Object클래스의 일부는 재정의 할 수 없음(final로 선언된 매서드)
		 *                모든 클래스는 Object를 상속 받음 컴파일러가 자동으로 extends Object추가
		 *   > String toString() 
		 *        : 객체를 문자열로 표현하여 반환 
		 *          재정의하여 객체에 대한 설명이나 특정 멤버 변수 값을 반환
		 *          인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 메서드
		 *                                      
		 *   > clone() 
		 *        : 객체를 복제하여 동일한 멤버 변수 값을 가진 새로운 인스턴스를 생성
		 *          이 메서드는 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다
		 *          (Object클래스의 clone()은 단순히 인스턴스 변수의 값만을 복제하기 때문에
		 *          참조 타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다)
		 *            -> cloneable인터페이스를 상속 받아야 함
		 *             
		 *   > equals(Object obj)
		 *         : 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려주는 역할          
		 *            
		 *   > hashcode()
		 *         : 이 메서드는 해싱(hashing)기법에 사용되는 해시함수(hash function)를 구현한 것
		 *           해시함수는 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환
		 *           객체에 동일을 비교시 equals와 hashCode를 같이 비교      
		 *            
		 *   > getClass()
		 *         : 이 메서드는 자신이 속한 클래스의 Class객체를 반환
		 *           클래스당 1개씩 존재    
		 *            
		 * - Class 객체를 얻는 방법     
		 *        Class cObj = new Card().getClass();   ->생성된 객체로부터
		 *        Class cObj = Card.Class               ->클래스 리터럴로부터    
		 *        Class cObj = Class.forName("Card")    ->클래스 리터럴로부터    
		 *            
		 * - 문자인코딩 : getBytes()를 사용하면 문자열의 문자 인코딩을 다른 인코딩으로 변환 가능          
		 *            서로 다른 문자 인코딩을 사용하는 컴퓨터 간에 데이터를 주고 받을 때는 적절한 인코딩 필요
		 *            
		 * - String을 기본형 값으로 변환
		 *   1) valueOf()
		 *   2) parselnt()           
		 * - Wrapper 클래스 : 기본자료형들을 객체로 다루는 데 사용
		 *   래퍼 클래스 -> 기본 자료형
		 *     > 자료형 이름 + value()
		 *   문자열 -> 래퍼 클래스           
		 *     > 자료형 이름 + valueOf()
		 *   기본 자료형을 자동으로 객체 자료형으로 변환 : 오토박싱(JDK 1.5부터)
		 *   객체 자료형을 자동으로 기본 자료형으로 변환 : 언박싱(JDK 1.5부터)             	 *            
		 */  
	}

}





























