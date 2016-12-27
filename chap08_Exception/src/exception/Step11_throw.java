package exception;

import java.util.Scanner;

public class Step11_throw {

	/*
	 * throw 키워드
	 * - 강제로 예외를 발생시키는 명령어
	 * 형식) throw new 예외클래스()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0이상 정수 입력:");
		int num = sc.nextInt();
		try{
			if(num < 0){
				//1. 강제 예외 발생
				throw new Exception("음수 입력은 불가~~~");
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
