package operator;

import java.util.Scanner; //패키지.패키지.클래스

public class Step01_arithmetic {

	/*
	 * 산술연산자 : +,-,*,/,%
	 */
	public static void main(String[] args) {
		//변수선언
		int a,b,result;
		//키보드 입력 : Scanner 클래스
	    Scanner sc = new Scanner(System.in); //object 생성
	    // System.in : 표준입력장치(키보드)
	    System.out.print("첫번쨰 숫자 입력: ");
	    a = sc.nextInt(); //정수 입력 받기
	    System.out.print("두번쨰 숫자 입력: ");
	    b = sc.nextInt(); //정수 입력 받기
	    result =a + b;
	    System.out.println("a+b ="+result);
	    result =a - b;
	    System.out.println("a-b ="+result);
	    result =a * b;
	    System.out.println("a*b ="+result);
	    result =a / b; //몫
	    System.out.println("a/b ="+result);
	    result =a % b; //나머지값
	    System.out.println("a%b ="+result);
	    
	    sc.close(); //객체 닫기
	    
	}

}
