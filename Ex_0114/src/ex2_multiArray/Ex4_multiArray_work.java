package ex2_multiArray;

public class Ex4_multiArray_work {
	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 출력
		//총합 : 50
		//평균 : 5
		
		int[][] arr = {{5, 6},
		               {1, 2, 6, 10},
		               {4, 2, 9},
		               {5}};
		int total = 0; //총 합
		float average = 0; //평균
		int count = 0 ;// 평균 계산을 위한 숫자의 갯수를 판단
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				total += arr[i][j];
				
				count++; //★★★
				
			}//inner
			
		}//outer
		
		System.out.println("총 합 : "+ total);
		average = (float)total / count;
		System.out.println("평균 : "+ average);
		
	}//main


}
