package ex2_work;

public class Work1 {
     public static void main(String[] args) {
		
		/*
		* 과수원이 있다.
		* 
		* 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		* 5,  7,   5개.
		* 
		* 과수원에서 하루에 생산되는 총 갯수를 출력하고, 시간당 
		* 전체 과일의 평균 생산 갯수를 출력.
		* 평균값을 담는 변수는 float으로 할 것.
		*/
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int fruittoral = pear+apple+orange;
		System.out.println("하루에생산되는과일수:"+ fruittoral+"개");
		float fruittoralaverge = fruittoral/24f;
		System.out.println("시간당평균생산갯수:" +fruittoralaverge+"개");
		
	}//main

}
