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
		
		int gender;
		String result2;
		System.out.print("성별 입력(1~4):");
		gender = sc.nextInt();
		result2 = (gender==1||gender==3)?"남자":"여자";
		System.out.printf("당신의 성별은 %s 입니다.\n",result2);
		
		/*
		 * 문3) id가 "hong"이고, 비번이 "1234"이면 "로그인 성공", 아니면 "로그인 실패"를 출력하시오.
		 * 	   <조건1>Scanner 클래스
		 *     <조건2>3항 연산자
		 */
		String id, pwd, result3;
		System.out.print("id입력:");
		id = sc.next();
		System.out.print("pwd입력:");
		pwd = sc.next();
		
		//문자열 내용 비교 : equals() 함수 이용
		result3 = (id.equals("hong") && pwd.equals("1234"))?"로그인 성공":"로그인 실패";
		System.out.printf("로그인 결과 : %s\n",result3);
		sc.close();
		
		
		
	}
}
