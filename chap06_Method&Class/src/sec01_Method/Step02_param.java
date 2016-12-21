package sec01_Method;

public class Step02_param {
	/*
	 * 매개변수를 갖는 메서드 정의
	 * 형식)
	 * 리터타입 메서드명(자료형 변수1, 자료형 변수2,...){
	 *  	메서드 실행문;
	 *  }
	 *  -매개변수와 실인수는 일치
	 *   -> 개수, 타입, 순서
	 */
	public static void adder(int n1,int n2){
		//int n1 = 10, n2=20; //지역변수
		int sum = n1+ n2; //지역변수
		System.out.printf("%d + %d = %d\n",n1,n2,sum);
	}
	
	public static void subtracter(int n1,int n2){
		//int n1 = 30, n2=20; //지역변수
		int sub = n1- n2; //지역변수
		System.out.printf("%d - %d = %d\n",n1,n2,sub);
	}
	/*
	 * 지역변수
	 *  - 메서드 내 선언된 변수
	 *  - 매개변수, 일반 지역변수
	 *  - stack 메모리 저장
	 *  - 메서드 종료 시 자동으로 소멸
	 */
	
	public static void main(String[] args) {
		// adder() 메서드 호출
		
		adder(10,20); //10 + 20 =30
		subtracter(20, 10); //20 - 10 = 10
		/*
		 * 가인수(매개변수)와 실인수
		 *  - 자료형 일치
		 *  - 순서 일치
		 *  - 개수 일치
		 *  
		 */
	}

}
