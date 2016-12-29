package sec03_wrapper;

import java.util.Scanner;

public class Step02_wrapper2 {
	/*
	 * Integer 레퍼클래스 예
	 *  - int 기본자로형을 클래스로 포장해 놓은 클래스
	 *  - int형을 객체로 생성할 수 있는 클래스
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		System.out.println("i = " + i);
		Integer it = new Integer(100);
		System.out.println("it = " + it);
		float ft = it.floatValue();
		System.out.println("ft = " + ft);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String str = sc.next(); // 문자열
		int num = Integer.parseInt(str); // 문자열 -> 숫자
		float fnum = Float.parseFloat(str); //문자열 -> 실수
		System.out.println(num + 1000); // 연산
		System.out.println(fnum);  //실수
		// 진법변환 - 2진수, 8진수, 16진수
		int temp = 15; // 2,8,16
		System.out.printf("15의 2진수 : %s\n", Integer.toBinaryString(temp) );
		System.out.printf("15의 8진수 : %s\n", Integer.toOctalString(temp) );
		System.out.printf("15의 16진수 : %s\n", Integer.toHexString(temp) );		
		
	}

}





