package sec01_Static;

import java.util.Scanner;

class StaticD{
	//PI 변수의 상수화
	static final double PI = 3.14159;
	
	
}
public class Step05_static_final {
	/*
	 * 변수의 상수화
	 *  - 변수를 상수처럼 생성
	 *  - 변수명을 대문자로 표시
	 *  - static final 변수 = 초기화;
	 *  - PI = 3.14159
	 */
	public static void main(String[] args) {
		// PI 리턴
		double pi = StaticD.PI;
		System.out.println("파이 = "+ pi);
		
		/*
		 * 문)PI를 이용하여 원의 넓이를 계산하시오.
		 * 원의 넓이 = 반지름*반지름*PI
		 * 조건) 반지름은 키보드 입력
		 */
		System.out.println("반지름 입력 :");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = r*r*StaticD.PI;
		System.out.println("원의 넓이 = "+area);
		sc.close();
	}

}
