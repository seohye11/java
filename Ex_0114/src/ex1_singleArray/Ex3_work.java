package ex1_singleArray;

public class Ex3_work {
	public static void main(String[] args) {
		
		//변수 money에 10~5000사이의 값을 아무거나 집어 넣는다
		//단, 1의 자리 숫자는 반드시 0으로 작성
		//money를 동전으로 바꿨을 때 가능한 한 가장 적은 수의 
		//동전을 사용할 수 있는 경우의 수를 판단하여 출력
		
		int[]coin = {500, 100, 50, 10};
		int money = 4380;
	int[]j = {money/500, money%500/100, money%500%100/50, money%500%100%50/10};
		
		for(int i = 0; i < coin.length; i++) {
		
			System.out.println(coin[i]+"원" +" : " +j[i]+"개");
			
			}
		System.out.println("---------------");
		
		for(int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			if(res > 0 ) {
				System.out.println(coin[i]+"원 : "+res);
				money %= coin[i];
			}
		}
	}//main

}
