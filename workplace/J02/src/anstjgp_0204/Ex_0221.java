package anstjgp_0204;

public class Ex_0221 {

	public static void main(String[] args) {
		
		/* java.util.패키지
		 *   System.currentTimeMills();
		 *    현재 운영체제의 시각을 long 타입으로 반환
		 *    (1970.01.01기준으로 현재까지의 경과 시간 1/1000초까지 단위 환산)
		 * 
		 * 날짜와 시간
		 * > Calendar
		 * > Date          
		 * 
		 * set()으로 날짜 지정하기
		 *     set(바꿔야할 항목, 바꿀 값)
		 *     set(년, 월, 일)          
		 *     set(년, 월, 일, 시, 분, 초)          
		 * 
		 * Date와 Calendar 간의 변환
		 *     Calendar -> Date
		 *     ex) Calendar cal = Calendar.getInstance();
		 *         Date d = new Date(cal.getTimeInMills());
		 *     
		 *     Date -> Calendar
		 *     ex) Date d = new Date();
		 *         Calendar cal = Calendar.getInstance();
		 *         cal.setTime(d);
		 *           
		 * SimpleDateFormat
		 *   : 날짜를 형식화하는 클래스          
		 *     y : 년도, M : 월, d : 일, h : 시, m : 분, s : 초,
		 *     S : 천분의 1초, a : 오전/오후(AM/PM)      
		 * 
		 * 달력 출력
		 * 
		 * java.util.Scanner
		 *   : Scanner 클래스는 입력을 도와주는 클래스
		 *    화면, 파일, 문자열과 같은 입력소스로부터 문자데이트를 읽어오는데 사용       
		 *           
		 * java.util.StringTokenizer
		 *   : 긴 문자열을 지정된 구분자(delimiter)를 기준으로 토큰(token)이라는 여러개
		 *     문자열로 잘라내는데 사용한다        
		 * 
		 * 한글로 된 숫자를 아라비아 숫자로 변환
		 * 
		 * java.time 패키지
		 *   : JDK1.8부터 시작
		 *     Date, Calendar가 가지고 있던 단점들을 해소하기 위해 추가
		 * java.time 패키지의 핵심 클래스
		 *   : 날짜와 시간을 합쳐 놓은 calendar와 달리 날짜와 시간을 분리
		 *     ex) LocalDate(날짜) + LocalTime(시간) -> LocalDateTime(날짜+시간)
		 *         time-zone : LoclaDateTime + 시간대 -> ZonedDateTime
		 * Period와 Duration
		 *   : 날짜와 시간의 간격을 표한하기 위한 클래스
		 *     날짜 - 날짜 Period
		 *     시간 - 시간 Duration
		 * 객체 생성하기 (now(), of())
		 *   > now() : 현재 날짜와 시간을 저장하는 객체 생성
		 *     ex) LocalDate date = LocalDate.now(); //날짜만
		 *         LocalTime time = LocalTime.now(); //시간만
		 *         LocalDateTime dateTime = LocalDateTime.now(); //날짜+시간
		 *     
		 *   > of() : 해당 필드 값을 순서대로 지정해주기만 하면 된다 
		 *     ex) LocalDate date = LocalDate.of(2022,07,12);
		 *         LocalTime time = LocalTime.of(23,59,59);  
		 *         
		 * Timer/TimerTask
		 *   : 개발자가 원하는 특정 시간에 코드를 실행하거나 특정 시간 간격으로 반복되는 작업을 할 수 있게 한다        
		 *         
		 * BigDecimal 클래스
		 *   : 정확한 소수점 연산을 해야할 때 사용
		 *     double과 long으로 소수점 연산을 할 때 오차가 나는 부분을 보완
		 * 
		 * BigInteger 클래스
		 *   : 정수형으로 표현할 수 있는 값의 한계가 있다
		 *     long으로 표현할 수 있는 최대가 10진 19자리 정도이다 이 이상이 필요한 과학적 계산에서 사용
		 *
		 * formating
		 *   : 데이터를 볼 때 일정한 형식으로 통일되게 출력
		 *   > DecimalFormat : 숫자를 형식화하는 클래스
		 * 
		 
		 */  
	}

}






