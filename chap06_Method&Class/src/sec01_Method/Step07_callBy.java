package sec01_Method;

public class Step07_callBy {
	/*
	 * 메서드 호출 방식(2가지)
	 *  1. call by value
	 *    - 값으로 메서드 호출하는 방식
	 *    - 매개변수가 기본자료형 사용
	 *  2. call by reference
	 *    - 주소를 이용하여 메서드를 호출하는 방식
	 *    - 매개변수가 참조형(배열이름=참조변수) 사용
	 */
	public static void data(int n) {  //n = 100
		int num=200;
		System.out.println("num ="+num);
		num +=n;
		System.out.println("num ="+num);
	}
	public static void main(String[] args) {
		// 1. call by value
		System.out.println("프로그램 시작");
		int num = 100;
		data(num); //data(100);
		System.out.println("num = "+num); //100
		System.out.println("프로그램 종료");
		
		
		
	}

}
