package ex3_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		//0 ~ 9사이의 난수를 100개 만든다.
		//발생된 100개의 난수를 통해 0 ~ 9까지 각각 몇 개의 숫자가 있는지를 그래프화 하시오.
		
		//난수 : 55135615...
		
		//0의 갯수 : ###### 6
		//1의 갯수 : #### 4
		//...
		//9의 갯수 : #####5
		
		Random rnd = new Random();//난수를 만들기 위한 클래스
		
		String numbers = "";
		for(int i = 0; i < 100; i++) {
			//0 ~ 9 사이의 난수 100개
			numbers += rnd.nextInt(9-0+1)+ 0;
		}
		System.out.println(numbers);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < numbers.length(); i++) {
			
			String s = "" +  numbers.charAt(i);
			//Integer.perseInt : 정수 형태의 문자열을 실제 정수로 변경해주는 메서드
			int n = Integer.parseInt(s);
			arr[n]++;
			
		}
		
		PrintGraph pg = new PrintGraph();
		pg.print(arr);
		
	}//main

}


























