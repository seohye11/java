package ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Try_Catch {
	public static void main(String[] args) {
		
		//try-catch(예외처리)
		//자바에서 프로그램이 실행되는 도중에 예외(에러)가 발생하면 그 시점에서 프로그램이 강제적으로 종료
		//이것은 올바른 판단이지만, 때로는 예측 가능한 오류가 있을 때 프로그램을 강제종료하지 않고
		//이후의 작업들을 이어나가야하는 경우가 있다
		//예외처리를 통해서 프로그램의 비정상적인 종료를 줄여보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
			
		try {
			//예측 가능한 오류를 try영역 안에 넣어둔다
			//try영역에서 오류가 발생하지 않았다면 catch구문은 무시하고 코드가 진행
			//try영역에서 오류(예외)가 발생했다면 그 즉시, catch구문을 실행하고 빠져나온다
			int num = sc.nextInt();
			int result = 10 / num;
		
			System.out.println("결과 : "+ num);
			System.out.println("result : "+ result);
			
		}catch (InputMismatchException e) {
			
			System.out.println("키보드에서는 정수값만 입력받아주세요");
			
		}catch (ArithmeticException e) {
			
			System.out.println("0으로는 나눌 수 없습니다");
			
		}
		
		System.out.println("프로그램 종료");
		
		
	}//main

}
