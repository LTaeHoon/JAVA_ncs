package sec01_Method;

public class Step01_Method {
	/*
	 * 메서드
	 * 1. python의 함수와 유사
	 * 2. 기능을 정의하는 단위
	 * 형식)
	 *  [접근지정자] 리턴타입 메서드명([매개변수]){
	 *   	메서드 실행문;
	 *   	[return 값;]
	 *   }
	 *   - 리턴타입 : 메서드의 반환값의 자료형
	 *   - 메서드명 : 식별자
	 *   - 매개변수 : 외부 값을 넘겨받는 역할(생략 가능)
	 *   - return 값 : 처리결과를 호출하는 곳으로 반환
	 *   - 주의 : main() 바깥쪽에 선언
	 */
	public static void adder(){
		int n1 = 10, n2=20;
		int sum = n1+ n2;
		System.out.printf("합계: %d",sum);
	}
	public static void subtracter(){
		int n1 = 30, n2=20; //지역변수
		int sub = n1- n2; //지역변수
		System.out.printf("합계: %d",sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		//adder 메서드 호출
		adder();
		//subtracter 메서드 호출
		subtracter();
		/*
		 * 메서드 호출
		 * 형식)
		 * 메서드명();
		 * - 매개변수가 없으면 빈괄호 호출
		 * - 
		 */
	}

}
