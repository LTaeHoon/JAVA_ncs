package sec02_Class;

import java.util.Scanner;

class Account{ //계좌클래스
	private int balance; //잔액 (0)
	
	void setBalance(int b){ //Setter
		balance = b;
	}
	int getBalance(){  //Getter
		return balance;
	}
	void deposit(int in){
		if(in>0){
			balance = balance + in;
		}else{
			System.out.println("입금액을 확인하세요.");
		}
	}
	void withdraw(int out){
		if(balance>out){
			balance = balance - out;
		
		}else{
			System.out.println("출금액을 확인하세요.");
		}
	}
	
}
public class Step06_account {
	/*
	 * 계좌관련 클래스 정의
	 */
	public static void main(String[] args) {
		// Account 객체 생성
		Account ac = new Account();
		
		//잔액 초기화
		ac.setBalance(1000);
		int bal = ac.getBalance();
		System.out.println("현재 잔액 : "+ bal);
		
		/*
		 * 문1)임금메서드(deposit)를 다음과 같이 추가하시오.
		 *  조건) 입금액이 0보다 적으면 예외처리
		 *  	->"입금액을 확인하세요."
		 *  	정상입금액인 경우 : balance = balance + 입금액
		 *  문2)출금메서드(withdraw)를 다음과 같이 추가하시오.
		 *  	조건)출금액이 잔액보다 많은 경우 예외 처리
		 *    	-> "잔액이 부족합니다."
		 *    	정상 출금액인 경우 : balance = balance- 출금액
		 * 
		 *     
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입금액을 입력하세오:");
		int in = sc.nextInt();
		ac.deposit(in);
		int bal2 = ac.getBalance();
		System.out.println("현재 잔액 : "+ bal2);
		System.out.println("출금액을 입력하세오:");
		int out = sc.nextInt();
		ac.withdraw(out);
		int bal3 = ac.getBalance();
		System.out.println("현재 잔액 : "+ bal3);
		sc.close();
		
	}

}
