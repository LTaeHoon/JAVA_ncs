package exception;

import java.util.Scanner;

//사용자 정의 예외 클래스
class UserException extends Exception{ //Exception(String str);
	UserException(String str){ //생성자
		super(str);
	}
}

public class Step12_userException {

	/*
	 * 사용자 정의 예외 클래스
	 * - 사용자가 직접 작성 예외 클래스
	 * - 조건 : Exception 클래스를 상속 받아야 한다.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0이상 정수 입력:");
		int num = sc.nextInt();
		try{
			if(num < 0){
				//1. 강제 예외 발생
				throw new UserException("음수 입력은 불가~~~");
			}
			System.out.println("num = "+ num);	
		}catch(Exception e){
			//2. 예외처리
			System.out.println(e.getMessage());
		}finally{
			sc.close();
		}
		System.out.println("프로그램 종료");
	}

}
