package ex2_multiArray;

public class Ex1_multiArray {
	public static void main(String[] args) {
		
		//다차원 배열
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열
		int[][] test = new int[2][3];//[1차원 배열의수(행)][각1차원 배열의 index 수(열)]
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		//2차원 배열의 모든 내용을 출력하려면 2중 for문을 사용해야 한다.
		
		//test.length : 큰 방의 갯수		
		for(int i = 0; i < test.length; i++) {
			
			//test[i].length : 큰 방에 연결되어 있는 작은 방의 갯수
			for(int j = 0; j < test[i].length; j++) {
				
				System.out.print(test[i][j]+" ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main

}
