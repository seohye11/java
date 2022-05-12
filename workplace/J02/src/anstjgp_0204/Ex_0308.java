package anstjgp_0204;

public class Ex_0308 {

	public static void main(String[] args) {
		
		/* 스레드
		 *   : 하나의 프로세스 안에서 두 가지 이상의 일을 하도록 도와줌
		 * 프로세스가 실행되는 방식
		 *   > 시간분할 방싱 : 모든 프로세스에게 동일한 시간을 할당하고 골고루 실행
		 *   > 선점형 방식 : 각각의 프로세스에게 우선순위를 부여하고 우선순위가 높은
		 *                프로세스가 잠시 멈추면 그 다음 순위의 프로세스가 동작
		 * 스레드 생성 방법
		 *   > thread 클래스를 상속받아서 만들기     
		 *   > Runnable 인터페이스 구현
		 *   
		 * 스레드의 우선순위
		 *   : 각각의 스레드에 우선순위를 부여할 수 있다
		 *     특정 스레드가 더 많은 작업시간을 갖도록 할 수 있다
		 *    > 최대 우선순위 : public static final int MAX_PRIORITY = 10;
		 *    > 최소 우선순위 : public static final int MIN_PRIORITY = 1;
		 *    > 보통 우선순위 : public static final int NORM_PRIORITY = 5;
		 *     
		 * 스레드 라이프 사이클
		 *   : 스레드는 상태에 따라 네가지 상태로 분류할 수 있다
		 *     상태 변화 주기를 라이프 사이클이라 한다   
		 *   > new : 스레드가 키워드 new를 통해 인스턴스화 된 상태
		 *           Runnable이 될 수 있는 상태이며 아직 대기열에 올라가지 않은 상태
		 *   > Runnable
		 *         : start() 메서드가 호출되면 new 상태에서 Runnable상태가 된다
		 *           Runnable 상태가 되면 실행할 수 있는 상태로 대기하게 된다
		 *           스케줄러에 의해 선택이 되면 run()메서드를 수행한다
		 *   > Blocked
		 *         : 실행 중인 스레드가 sleep(), join()메서드를 호출하게 되면 Blocked상태가 된다
		 *           스케줄러에 의해 선택 받을 수 없다
		 *   > Dead(Terminated)
		 *         : run()메서드의 실행을 모두 완료하게 되면 스레드는 Dead(Terminated)상태가 된다
		 *           할당받은 메모리와 정보가 삭제된다
		 *   
		 * yield()
		 *   : 실행 중에 자신에게 주어진 실행시간을 다른 스레드에서 양보한다  
		 *   
		 * join()
		 *   : 특정한 스레드가 작업을 먼저 수행할 때 사용한다  
		 *   
		 * 스레드의 동기화
		 *   : 멀티 스레드로 작업시, 한 스레드가 진행중인 작업을 다른 스레드가 간섭하지 못하도록 
		 *     막는 것을 스레드 동기화(synchronization)라 한다
		 *   > 메서드 전체를 임계 영역으로 지정
		 *   > 특정한 영역을 임계영역으로 지정 
		 *   
		 * wait()과 notify()
		 *   : wait()는 스레드를 대기
		 *     notify()는 대기중인 스레드를 깨운다  
		 */  
	}

}


