package sec01_Method;

import java.util.Scanner;

public class Step12_recursive {
	/*
	 * 재귀호출(recursive) 메서드 구현
	 *  - 자기자신의 메서드를 호출하는 문법
	 *  - 반복문의 역할 제공
	 *  - 종료 조건 필요
	 *  응용 : 팩토리얼 값 계산
	 */
	//n=5 -> 1+2+3+4+5 => 15(int)
	public static int sum(int n) {
		int result = 0;
		if(n==1) //종료조건
			return 1;  //상수 반환
		else{  // n>=2 
			result = n + sum(n-1); //재귀호출
			// 5+(5-1) + (4-1)+(3-1)+(2-1)
			//9+4+3+2+1 = 15
			return result;
		}
	}
	/*
	 * 문)n=5일 때 => 1*2*3*4*5=120 리턴
	 *  조건) n은 키보드 입력
	 */
	
	public static int factorial(int n) {
		int result = 0;
		if(n ==1)
			return 1;
		else{
			result = n*factorial(n-1); //재귀호출(반복문 :n--)
			System.out.printf("n=%d, result=%d\n",n,result);
			//1.계산 : 5*(5-1)*(4-1)*(3-1)*(2-1)*(1)
			//2.누적 result 저장 -> 반환
			return result;
		}
	}
	public static void main(String[] args) {
		// sum 메서드 호출
		int n =sum(5); //n = 5
		System.out.println("n = "+n); //n=15
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int num = factorial(input);
		System.out.println("num = "+num);
	}

}
