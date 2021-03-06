package sec01_Method;

import java.util.Scanner;

public class Step04_return {
/*
 * - 리턴값 : 해당 메서드에서 처리한 결과를 반환하는 값
 * 형식)
 * 리턴타입 메서드(){
 * 	실행문
 *  return 값
 *  }
 *  void: 리턴값이 없는 경우 사용되는 키워드
 */
	public static int method1() {
		System.out.println("method1 호출");
		return 10; //상수 리턴 -> 호출한 곳으로 반환
	}
	public static int method2(int a,int b) {
		System.out.println("method2 호출");
		int sum = a+b;
		return sum + 100; //변수 리턴 -> 호출한 곳으로 반환
	}
	
	/*
	 * 문1) 키보드로 3개의 점수를 입력받아서 총점을 반환하는 함수를
	 * 	   정의하시오.
	 * 	   조건1) 키보드 입력 : main()
	 * 	   조건2) 함수명 : total()
	 *     조건3) main에서 호출하여 결과 출력
	 * 문2) 평균을 반환하는 함수를 정의하시오.
	 * 	   조건1) total를 인수로 평균 함수 호출
	 * 	   조건2) 함수명 : avg()
	 * 	  조건3) 출력은 소수점 이하 2자리 까지
	 */
	public static int total(int n1,int n2,int n3) {
		int sum = n1+n2+n3;
		return sum;
	}
	public static float avg(int tot) {
		return tot/3.0f;
	}
	public static void main(String[] args) {
		//method1 호출
		int result=method1();
		System.out.println("result =" + result);
		
		//method2 호출
		int sum = method2(10,20);
		System.out.println("sum ="+sum);
		//메서드는 반복호출이 가능
		
		//method2 호출
		int sum2 = method2(100,200);
		System.out.println("sum ="+sum2);
		
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		
		System.out.println("3개의 정수 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int result3=total(a,b,c);
		System.out.println("합계 : " + result3);
		
		float avg = avg(result3);
		System.out.printf("평균값 : %.2f\n",avg);
		sc.close();
	}

}
