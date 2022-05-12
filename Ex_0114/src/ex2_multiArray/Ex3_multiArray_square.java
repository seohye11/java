package ex2_multiArray;

public class Ex3_multiArray_square {
	public static void main(String[] args) {
		
		int size = 3;
		int[][] arr = new int[size][size];
		int num = 1; //시작 수 
		
		int y = 0; //행(y)
		int x = 0; //열(x)
		
		x= size / 2;
		
		while(num <= size * size) {
			
			arr[y][x] = num;
			
			if(num % size == 0) {
				y++;
			}else {
				y--;
				x++;
			}
			if(y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}
			
			num++;

		}//while
		
		//배열 arr이 가진 모든 내용을 출력
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}//main

}
