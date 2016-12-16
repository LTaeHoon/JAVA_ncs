package next;

import java.util.Scanner;

public class Step01_length1 {
	/*
	 * length 속성
	 *  - 배열의 길이를 정수로 리턴하는 속성
	 *  형식) 
	 *  배열명.length
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num;
		num = new int[10];  //수정1
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++){ 
			System.out.printf("%d번째 입력:",(i+1));
			num[i] = sc.nextInt();	
		}
		
		for(int i=0;i<num.length;i++){ 
			sum +=num[i];
		}
		
		System.out.println("합계 : "+sum);
		sc.close();
	

	}

}
