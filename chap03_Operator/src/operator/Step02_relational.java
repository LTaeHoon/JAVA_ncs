package operator;

import java.util.Scanner;

public class Step02_relational {
	/*
	 * 관계 연산자 : 대소관계 구분
	 * - >, >=,<,<=,!=,==
	 * - 결과 : true,false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b=4;
		
		boolean result;
		String str;
		
		result = a>=b;
		System.out.println("result = "+ result);
		
		
	   /* 3항 연산자
	    *  
		* 형식) 변수 = (조건)? 참 : 거짓;
		*
		*/
		str = (a>=b)?"a가 큽니다.":"b가 큽니다.";
		System.out.printf("str : %s",str);
		/*
		 * 문) 키보드를 임의의 숫자를 입력 받아서 짝수/홀수를 판별하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int num1;
		String str1;
		
		System.out.printf("\n임의의 숫자를 입력 하세오 : ");
		num1 = sc.nextInt();
		str1 = (num1%2==0)?"짝수입니다.":"홀수입니다.";
		System.out.printf("입력한 수는 "+str1+"\n");
		
		str1 = (num1%5==0)?"5의배수 입니다.":"5의배수가 아닙니다.";
		System.out.println("입력한 수는 "+str1);
		
		
		sc.close();
		
	}

}
