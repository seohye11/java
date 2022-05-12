package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		System.out.println("고양이");
		System.out.println("눈 : "+ cat.getEye());
		System.out.println("다리 : "+ cat.getLeg());
		System.out.println("특기 : "+ cat.balance);
		
		System.out.println("----------------------");
		
		Dog dog = new Dog();
		System.out.println("강아지");
		System.out.println("눈 : "+ dog.getEye());
		System.out.println("다리 : "+ dog.getLeg());
		System.out.println("특기 : "+ dog.nose);
		
		System.out.println("----------------------");
		
		Lion lion = new Lion();
		System.out.println("사자");
		System.out.println("눈 : "+ lion.getEye());
		System.out.println("다리 : "+ lion.getLeg());
		System.out.println("특기 : "+ lion.galgi);
		
		System.out.println("----------------------");
		
		Snake snake = new Snake();
		System.out.println("뱀");
		System.out.println("눈 : "+ snake.getEye());
		System.out.println("다리 : "+ snake.getLeg());
		System.out.println("특기 : "+ snake.sensor);
		
		
		
		
		
	}//main

}






