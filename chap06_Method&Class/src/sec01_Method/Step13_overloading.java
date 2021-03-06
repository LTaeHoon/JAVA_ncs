package sec01_Method;

public class Step13_overloading {
	/*
	 * 메서드 다중정의(method loading)
	 *  - 하나의 클래스에서 동일한 이름의 메서드가 2개 이상 선언하는 문법
	 *  - 조건 : 매개변수의 개수 또는 타입이 달라야 한다.
	 */
	public static int sum(int k,int e) { // 2개 과목 합계
		return k+e;
	}
	public static float sum(float k,float e) { // 2개 과목 합계
		return k+e;
	}
	public static int sum(int k,int e,int m) { // 3개 과목 합계
		return k+e+m;
	}
	public static int sum(int k,int e,int m,int s) { // 3개 과목 합계
		return k+e+m+s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
