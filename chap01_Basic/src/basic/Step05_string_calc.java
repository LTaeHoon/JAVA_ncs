package basic;

public class Step05_string_calc {
	/*
	 * 문자열 연산자(+)
	 * 1. 산술적 의미 : 덧셈
	 * 2. 결합 연산자 : 두 항목을 하나로 결합
	 */
	public static void main(String[] args) {
		//1. 산술적 의미
		System.out.println(10+20); //30
		//2. 결합 연산자
		System.out.println("name"+"홍길동");
		int age = 35;
		System.out.println("age: "+age);
		
		//문) "10+20 = " 30
		System.out.println("10+20 ="+(10+20));
	}

}
