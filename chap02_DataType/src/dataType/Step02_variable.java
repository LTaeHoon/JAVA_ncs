package dataType;

public class Step02_variable {
	/*
	 * 변수 선언
	 * - 변수 : 메모리 이름 지정
	 * - 변수 선언 방법
	 * 형식) 자료형 변수명;
	 *   - 자료형 : 기본자료형 8가지(Step01참고)
	 *   - 변수명 : 사용자가 임의 지정 가능(식별자)
	 * - 변수 사용 절차
	 * 1. 변수 선언 : 메모리 확보
	 * 2. 변수 초기화 : 메모리에 값 할당
	 * 3. 변수 사용 : 변수 출력, 연산 등
	 */
	public static void main(String[] args) {
		// 1. 변수 선언
		byte num1; //메모리 이름 num1, 1byte 공간 확보
		short num2; //메모리 이름 num2, 2byte 공간 확보
		int num3; //메모리 이름 num3, 4byte 공간 확보
		int sum;
		/*
		 * 식별자 작성 규칙
		 *  - 식별자 : 변수, 메서드명, 클래스명
		 *  1) 예약어(명령어) 사용 불가
		 *  2) 영문자 또는 특수문자(_,$) 시작
		 *  3) 숫자 사용 불가
		 *  4) 대,소문자 구분
		 * 
		 */
		 // 2. 변수 초기화
		 num1 = 127; // -128 ~ 127
		 num2 = 32767; //-32768~32767
		 num3 = num1+num2; //4byte : 21억 4천
		 sum=0;
		 sum = sum + num3;
		 
		 /*
		  * 배정 연산자
		  * 형식) 변수 = 상수 or 변수 or 수식
		  * - 우변의 상수, 변수, 수식을 좌변의 변수에 할당
		  */
		 // 3. 변수 사용
		 System.out.printf("num1=%d\n",num1);
		 System.out.printf("num2=%,3d\n",num2); // num2=32,767
		 System.out.printf("num3=%,3d\n",num3); // num3=32,894
		 
		 System.out.println(Integer.SIZE); //32 -> 4byte
		 System.out.println(Float.SIZE);  //32
		 System.out.println(Double.SIZE);  //64 -> 8byte
	}
	

}
