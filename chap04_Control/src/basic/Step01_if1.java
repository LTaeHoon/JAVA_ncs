package basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Step01_if1 {
	/*
	 * 제어문
	 * - 프로그램의 흐름을 제어하는 명령문
	 * 1. 조건문
	 *   - if문, switch문
	 * 2. 반복문
	 *   - for문, while문
	 */
	public static void main(String[] args) {
		/*
		 * if문
		 * if(조건식){
		 * 	    실행문
		 * }
		 *
		 */
		int num = 10;
		if(num>=10){
			System.out.println("num은 10이상");
			//실행문이 1개이면 {}생략 가능
		}
		/*
		 * if(조건식){
		 * 	     실행문 	
		 * }else{
		 * 	     실행문
		 * }
		 */
		// 키보드로 입력한 값이 짝수/홀수 판별 예문
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력:");
/*		num = sc.nextInt();
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
*/		
		sc.close();
		
		//주민번호 14자리 입력하여 성별 판단하기 예문
		String sid;
		sid = JOptionPane.showInputDialog("주민번호 입력(123456-1234567)");
		System.out.printf("입력한 주민번호: %s\n",sid);
		char gender;
		gender = sid.charAt(7); //단일문자 추출
		if(gender=='1'||gender=='3')
			System.out.println("당신은 남자입니다.");
		else
			System.out.println("당신은 여자입니다.");
		
	}

}
