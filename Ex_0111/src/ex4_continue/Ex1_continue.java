package ex4_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장을 실행하지 않고 건너뛰고자 할 때 사용하는 키워드
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				if(j % 2 == 0) {
					//for문 안에서 사용되는 continue는 가장 가까운 for문의 증감식으로 이동한다.
					continue;
					//continue코드의 아래에는 그 어떤 코드도 추가될 수 없다.
				}
				
				System.out.print(j+ " ");
				
			}//inner
			
			System.out.println();
			
		}//outer

	}//main

}
