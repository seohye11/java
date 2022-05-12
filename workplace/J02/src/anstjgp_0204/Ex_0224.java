package anstjgp_0204;

public class Ex_0224 {

	public static void main(String[] args) {
		
		/* 컬랙션 프레임워크
		 *  > List interface
		 *  > Set interface
		 *  > Map interface
		 *  
		 * Collection 인터페이스
		 *  > 분류
		 *    List : 순서가 있는 자료관리, 데이터 중복 허용 
		 *           ArrayList, Vector, LinkedList, Stack, Queue
		 *         > Collection 하위 인터페이스
		 *           객체를 순서에 따라 저장관리
		 *           배열의 기능을 구현한 인터페이스
		 *             
		 *    Set : 순서가 정해져 있지 않음, 중복을 허용하지 않음
		 *          HashSet, TreeSet
		 * 
		 * Collection 인터페이스 주요 메서드
		 *   : boolean add(E e), void clear, Iterator<E> iterator,
		 *     boolean remove(Object o), int size()
		 *   
		 * Map
		 *   : Key-Value의 쌍으로 이루어짐 Key는 중복될 수 없다     
		 *   
		 * 지네릭스(Generics)
		 *   : 클래스가 다룰 객체를 미리 명시해주는 것
		 *     컬렉션 클래스에서 컴파일 시 타입체크를 해주는 기능
		 *   > 장점
		 *     1) 타입 안정성을 제공
		 *     2) 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해짐
		 *       
		 * GenericPrint<T> 
		 *   : 지네릭클래스, T의 GenericPrint, T GenericPrint라고 읽는다
		 *           
		 * 제한된 지네릭스 클래스
		 *   : T에 저장될 타입의 종류를 제한할 수 있다  
		 *           
		 *  <T super Material> : T와 그 조상들만 가능
		 *  <?> : 제한 없음, 모든 타입이 가능 = <? extends Object>
		 *  <T extends Fruit & Eatable> : Fruit과 Eatable을 구현한 클래스만 가능  
		 * 
		 * 지네릭 메서드
		 *   : 메서드의 선언부에 지네릭 타입이 선언된 메서드 
		 *    generic type
		 *    public static <T> T getName(T name){return name;}
		 *         
		 * 지네릭 타입의 제거        
		 *   : 컴파일러는 지네릭 타입을 이용해서 소스파일을 체크하고 필요한 곳에 형변환을 넣어준다
		 *     그리고 지네릭 타입을 제거한다 즉, 컴파일된 파일(*.class)에는 지네릭 타입에 대한 정보가 없다          
		 *           
		 * ArrayList
		 *   : 컬렉션 프레임웍에서 가장 많이 사용
		 *     데이터의 저장순서가 유지되고 데이터의 중복을 허용
		 *     중간 추가 삭제에 취약(마지막에 추가 삭제에는 최고 성능)
		 *           
		 * ArrayList엘리멘트 삭제
		 *   : 뒤에서부터 삭제(앞에서부터 삭제하면 오류 발생)          
		 *           
		 * ArrayList에 전체 값 확인
		 *   : ArrayList에 모든 값을 순회해서 출력
		 *           
		 * LinkedList
		 *   : 배열은 중간에 자료를 추가/삭제할 때 나머지 자료들이 자리를 이동하게 된다
		 *     그래서 배열 중간에 빈번한 자료 추가/삭제가 발생하면 속도에 영향을 준다          
		 * 
		 * Set(Collection 하위 인터페이스) ex) HashSet, TreeSet
		 *   : 순서 유지되지 않음
		 *     중복을 허용하지 않는다
		 *     null값을 허용
		 *     출력순서 보장되지 않음          
		 *  > HashSet
		 *    : set인터페이스를 구현한 클래스
		 *      중복을 허용하지 않으므로, 저장된 객체의 동일성을 확인하기 위해 equals, hashCode()를 재정의해야 함         
		 *           
		 * 삭제(remove)와 전체 출력(for-each, iteractor)
		 *           
		 * Queue
		 *   : 먼저 들어온 데이터를 먼저 처리(FIFO First In First Out)
		 *     사람, 차량 등의 줄 혹은 줄을 서서 기다리는 것을 의미 줄을 지어 순서대로 처리되는 것
		 *  > add(e) : Queue에 요소 e추가
		 *  > E element : Queue에 제일 상단 요소 반환
		 *  > E remove() : Queue에 제일 상단 요소 삭제, 삭제 데이터 return
		 *  > offer(e) : Queue에 요소 e추가
		 *  > E peek() : Queue에 제일 상단 요소 반환
		 *  > E poll() : Queue에 제일 상단 요소 삭제, 삭제데이터 return
		 *  
		 * Queued의 활용 : 최근 사용문서, 인쇄작업 대기목록, 버퍼
		 * 명령어 history Queue로 생성          
		 *           
		 * stack
		 *   : 자료 구조 중 하나인 stack은, 상자에 물건을 쌓아 올리듯이 데이터를 쌓는 자료 구조
		 *     stack의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는(LIFO Last In First Out)
		 *  > element(e) : 요소반환
		 *  > peek() : 요소반환
		 *  > pop() : 요소 하나를 제거하면서 반환
		 *  > push(E item) : 새로운 요소 추가
		 *  > int search(Object) : 요소가 있는지 검색해서 위치 반환   
		 *               
		 * stack의 활용 : 수식계산, 수식괄호 검사, 워드프로세서의 redo/undo
		 * 웹브라우저 뒤로/앞으로
		 * 
		 * Map
		 *   : 키와 값을 쌍으로 저장하는 자료 구조
		 *     key는 중복을 허용하지 않는다
		 *     검색을 위한 자료 구조
		 *     key를 이용해서 값을 저장하거나 삭제할 때 사용하면 편리
		 *     내부적으로 hash방식으로 구현
		 *     key가 되는 객체는 유일성의 여부를 위해 equals와 hashCode가 재정의 필요
		 *  > containsKey(Object key) : 해당키가 있는지 여부 반환
		 *  > containsVaule(Object v) : 해당값이 있는지 여부 반환
		 *  > V get(Object k) : 해당 key에 해당하는 값 반환
		 *  > Set keySet() : 키들을 Set형태로 반환
		 *  > Vput(K key, V value) : 키와 값을 추가
		 *  > Vremove(K key) : 이 키를 가진 요소를 제거
		 *  > int size() : 전체 요소의 개수를 반환
		 * 
		 * HashMap
		 *   : Map인터페이스를 구현 key, Value로 데이터 저장
		 *               
		 *               
		 *               
		 *               
		 */  
	}

}





























