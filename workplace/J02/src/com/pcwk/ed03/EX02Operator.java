package com.pcwk.ed03;

public class EX02Operator {

	public static void main(String[] args) {
		//�������ҿ����� : (���׿�����) 1��ŭ ���ϰų� 1��ŭ �� �� ���
		//           ���� ��/�� ��ġ�� ���� ������ ����� �޶���
		
		int gameScore = 150;
		
		int lastScore01 = ++gameScore;
		System.out.println("lastScore01 : " + lastScore01);
		
		int lastScore02 = --gameScore;	
		System.out.println("lastScore02 : "+ lastScore02);
		
		int lastScore03 = gameScore++;
		System.out.println("lastScore03 : "+ lastScore03);
		//lastScore03 : 150, gameScore : 151
		
		int lastScore04 = gameScore--;
		//lastScore04 : 151 
		System.out.println("lastScore04 : "+ lastScore04);

	}

}
