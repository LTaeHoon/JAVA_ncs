package chap05;

import java.util.Scanner;

public class class01 {
/*
 * 키보드로 배열의 크기를 입력 받아서 생성된 
 * 배열요소 만큼 임의의 정 수를 키보드로 입력 받은 후
 * 그 중 최대값과 최소값 을 구하시오.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size =0;
		System.out.print("배열 크기 입력:");
		size = sc.nextInt();
		int []num = new int[size];
		
		for(int i=0;i<num.length;i++){
			System.out.printf("%d번째 정수 입력:",i+1);
			num[i] = sc.nextInt();
		}
		
		int max=0,min=0;
		for(int i=0;i<num.length;i++){
			if(num[i]>max)
				max = num[i];
			if(i==0||num[i]<min)
				min = num[i];
		}
		System.out.printf("Max값 : %d, min값 : %d",max,min);

		sc.close();	

	}

}
