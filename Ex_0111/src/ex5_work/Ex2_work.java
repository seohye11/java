package ex5_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//n이 저장하고 있는 값이 소수(약수가 1과 자기 자신뿐인 수)인지 아닌지를 판단하시오 for break
		//7은 소수입니다
		
		int n = 7;
		int i = 0;
		
		for(i = 2; i <= n; i++) {
			
			if(n % i == 0) {
			   break;
			}
		}
		if(i == n) {
			System.out.println(n+"은(는) 소수입니다");
			
		}else {
			System.out.println(n+"은(는) 소수가 아닙니다");
		}
	
	}//main

}
