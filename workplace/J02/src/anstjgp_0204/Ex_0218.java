package anstjgp_0204;

public class Ex_0218 {

	public static void main(String[] args) {
		
		/* 예외(Exception)
		 *  : 프로그램 실행 중에서 발생하는 오류 중에서 처리가 가능한 것
		 *    프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		 * 에러(Error)
		 *  : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 ex)메모리 부족, power 오류  
		 *  
		 * Exception 클래스와 그 자손들
		 *  : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
		 *    예외처리를 해야 컴파일 가능
		 * - RuntimeException 클래스와 그 자손들    
		 *    : 프로그래머의 실수로 발생하는 예외
		 *      예외처리 여부와 상관없이 컴파일
		 *      
		 * 예외처리(Exception handling)
		 *  > 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
		 *  > 목적 : 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지    
		 *  > 구문처리 형식
		 *       1) try{
		 *            예외가 발생할 가능성이 있는 코드
		 *          }catch(Exception1 e1){
		 *            Exception1이 발생했을 경우 이를 처리하기 위한 문장
		 *          }catch(Exception2 e2){
		 *            Exception2이 발생했을 경우 이를 처리하기 위한 문장
		 *          }catch(Exception3 e3){
		 *            Exception3이 발생했을 경우 이를 처리하기 위한 문장
		 *          }
		 *       2) try-catch-finally문    
		 *          finally문은 예외와 관계없이 무조건 수행
		 *          ex) DB연결 자원 반납, File을 Read하는 경우 자원 반납
		 *           try{
		 *            예외가 발생할 수 있는 부분
		 *          }catch(처리할 예외 타입 e){
		 *            예외를 처리하는 부분
		 *          }finally{
		 *            항상 수행되는 부분
		 *       3) 멀티 catch블럭
		 *          JDK 1.7부터 여러 catch블럭을 |기호를 이용해서 하나의 catch블럭으로 합칠 수 있다   
		 *          try{
		 *           
		 *          }catch(ArithmeticException a){
		 *          
		 *          }catch(ArrayIndexOutOfBoundsException e){
		 *          
		 *          }finally{
		 *          
		 *          }
		 *          try{
		 *           
		 *          }catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
		 *         
		 *          
		 *          }finally{
		 *          
		 *          }
		 *       4) try-with-resource 구문
		 *          리소스를 자동으로 해제하도록 제공해주는 구문 jdk 1.7부터 가능  
		 *          close()를 명시적으로 호출
		 *          AutoCloseable인터페이스를 구현해야 함
		 * 예외 발생 시키기
		 *   : 프로그래머가 의도적으로 예외를 발생시키는 행위
		 *     예외 클래스의 인스턴스를 생성하고 throw를 이용하면 강제 예외 발생
		 *     Exception e = new Exception("사용자 정의 예외");
		 *     throw e;         
		 * 예외던지기(throws)
		 *   : 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고 자신을 호출한 쪽으로 
		 *     예외 처리에 대한 책임을 넘기는 것
		 *          void method() throws Exception01, Exception02, Exception03..{
		 *          
		 *          }
		 *           
		 * 사용자 정의 예외
		 *   : 예외 클래스를 사용자가 직접 정의할 수도 있습니다
		 *          class PCWKException extends Exception{
		 *              public PCWKException (String msg){
		 *                  super(msg);
		 *              }
		 *          }
		 *           
		 *           
		 *           
		 *           
		 *           
		 *           
		 */  
	}

}





























