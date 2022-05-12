package ex1_computer;

public class Computer {
	
	//컴퓨터의 대량 생산을 위한 설계도 작업
	
	//클래스의 구성요소
	//1) 속성(변수, 멤버)
	private String brand = "barunson"; 
	public int ssd = 500;
	public int ram = 32;
	public float cpu = 2.5f;
	public String color = "white";
	
	//2) 메서드(함수)
	//메서드란 어떠한 작업을 수행하기 위한 명령문들의 집합
	public void getMyPc() {
		
		System.out.println("제조사 : "+ brand);
		System.out.println("ssd : "+ ssd);
		System.out.println("ram : "+ ram);
		System.out.println("cpu : "+ cpu);
		System.out.println("color : "+ color);
		System.out.println("------------------");
		
	}
	//메서드의 구성
	
	//접근제한자   반환형  메서드의 이름(파라미터 or 인자){메서드가 호출되면 실행되는 영역}
	//public    void  getMyPc(){ }
	
	//접근제한자
	//1)public : 같은 프로젝트의 모든 클래스에서 접근이 가능
	//2)private : 현재 클래스에게만 접근을 허가
	//3)protected : 상속관계의 클래스끼리만 접근을 허가
	//4)default : 같은 패키지에 있는 클래스들만 접근이 가능
	
	
	
	
}









