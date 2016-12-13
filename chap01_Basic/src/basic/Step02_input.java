package basic;

public class Step02_input {
	
	/*
	 * 프로그램으로 데이터 입력하는 방법
	 */
	public static void main(String[] args) {
		// 프로그램 시작점
		
		// 3개 정수를 저장하는 변수 선언
		int num1,num2,sum;
		num1 = Integer.parseInt(args[0]); //첫번째 정수
		num2 = Integer.parseInt(args[1]); //두번째 정수
		sum = num1+num2;
		System.out.println("sum = "+sum);
		
	}

}
