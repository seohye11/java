/**
 * ��Ű�� : com.pcwk.var01 
 * ���� : VariablelmplicitComversion.java
 * �ۼ��� : ITSC
 */
package com.pcwk.var01;

/**
 * @author ITSC
 *
 */
public class VariablelmplicitConversion {
	
	//������ ����ȯ
	//���� ������ ū ����, �� ������ ������ �� ������ ���� ���� �Ǵ� ���
	
	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum;//byte�� ���� int������ �ڵ� ��ȯ ��
		System.out.println("bNum : "+ bNum);
		System.out.println("iNum : "+ iNum);
		
		//�� ������ ������ �� ������ ���� ����
		int iNum02 = 14;
		float fNum = iNum02;
		System.out.println("iNum02 : "+ iNum02);
		System.out.println("fNum : "+ fNum);	
		
		double dNum;
		//     14.0 + 11    - > 14.0 + 11.0
		dNum = fNum + iNum;
		System.out.println("fNum + iNum = "+ dNum);

	}

}








