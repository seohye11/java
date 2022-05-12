package com.pcwk.array;

public class EX08_MultiArray {

	public static void main(String[] args) {
		
		// 다차원 배열 : 2차원 이상의 배열
		
		int[][] arr = {{1,2,3},
		               {4,5,6}
		              };
		System.out.println("arr.length : "+ arr.length);
		System.out.println("arr[0].length : "+ arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[0].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();	
		}

	}

}
