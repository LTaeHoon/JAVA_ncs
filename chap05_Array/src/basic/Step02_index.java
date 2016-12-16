package basic;

import java.util.Scanner;

public class Step02_index {
	/*
	 * 배열의 첨자(index)는 반복문의 기준변수로 대체한다.
	 * 형식) 배열명[0] <- 배열명[i]
	 */
	public static void main(String[] args) {
		/*
		 * 문) 키보드로 정수 데이터 5개를 입력받아서 배열에 저장한 후 합계를 출력하시오.
		 */
		int [] num;
		num = new int[5];
		int sum =0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.printf("%d번째 입력:",(i+1));
			num[i] = sc.nextInt();
			//sum +=num[i];
		}
		
		//개선된 for문
		for(int n : num) //num[0] ~ num[4]
			sum +=n;
		/*
		 * 개선된 forans
		 *  - jdk1.5 버전에서 추가된 기능
		 *  - 원소수 만큼 반복
		 *  for(자료형 변수명 :배열명)
		 */
		System.out.println("합계 : "+sum);
		sc.close();
	}

}
