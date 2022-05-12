package ex1_computer;

public class ComputerMain {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		System.out.println("용량 : " + c1.ssd);
		System.out.println("ram : " + c1.ram);
		System.out.println("cpu : " + c1.cpu);
		System.out.println("색상 : " + c1.color);
		
		System.out.println("---------------------------");
		
		Computer c2 = new Computer();
	
		c2.ssd = 700;
		c2.getMyPc();
		
	}//main

}











