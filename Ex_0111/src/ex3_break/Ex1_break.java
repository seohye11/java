package ex3_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져 나가기 위한 키워드
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j < 5; j++) {
				
				if( j % 2 == 0 ) {
			       break;//가장 가까운 반복문인 안 쪽 for문을 통째로 빠져 나간다.
			//System.out.println(); -> break문 바로 아래 쪽에는 어떤 코드도 추가할 수 없음
				}
				
				System.out.print(j+ " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main

}
