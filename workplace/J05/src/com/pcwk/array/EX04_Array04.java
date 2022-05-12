package com.pcwk.array;

import java.util.Arrays;

public class EX04_Array04 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		
		//데이터가 있는 요소만 출력
		System.out.println(Arrays.toString(data));
		
		int size = 0;
		data[0] = 10.0;
		
		size++;
		data[1] = 20.0;
		
		size++;
		data[2] = 30.0;
		
		size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
		System.out.println("----------------------");
		System.out.println(Arrays.toString(data));

	}

}
