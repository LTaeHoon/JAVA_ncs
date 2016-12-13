package operator;

import java.util.Scanner;

public class Step03_logical {
	/*
	 * 논리 연산자
	 * - 논리곱(and) : &&
	 * - 논리합(or) :||
	 * - 부정(not) : !
	 * 
	 */
	public static void main(String[] args) {
		int a = 15;
		boolean result = (a>=10 && a<=20);
		System.out.println("result : "+result);
		
		/*
		 * && 연산자 수행 과정
		 *  - 두 관계식이 모두 true -> true
		 *  - 왼쪽 관계식이 거짓이면 오른쪽 관계식 수행 안함
		 *  - 왼쪽 관계식이 참이면 오른쪽 관계식 수행함
		 *  
		 */
		
		/*
		 *  문) 키보드로 나이를 입력받아서 10~18 : "청소년", 아니면 "유아 or 성인"을 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int age;
		String result1;
		
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		//형식1) (조건)?참:거짓;
		result1 = (age>=10&&age<=18)?"청소년":"유아 or 성인";
		System.out.println(result1);
		//형식2) (조건1) ? 참:(조건2)?참:거짓;
		result1 = (age>=10&&age<=18)?"청소년":(age<10)?"유아":"성인";
		System.out.println(result1);
		sc.close();
		
		
	}
}
