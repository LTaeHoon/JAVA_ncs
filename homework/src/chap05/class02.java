package chap05;

import java.util.Scanner;

public class class02 {
	/*
	 * 임의의 숫자 5개를 키보드로 입력 받아서 배열에 저장한 후,
	 * 내림차순으로 정렬하여 출력하시오.
	 */
	
	public static void main(String[] args) {
		//정렬 알고리즘 : 두 개의 배열요소를 비교하여 첫 번째
		//요소 값이 두 번째 요소보다 작으면 두 값을 교환하여
		//가장 큰 값을 첫 번째 배열 요소로 이동시킨다.
		Scanner sc = new Scanner(System.in);
		
		int []num = new int[5];
		int ex=0;
		for(int i=0;i<num.length;i++){
			System.out.printf("%d번째 정수 입력:",i+1);
			num[i] = sc.nextInt();
		}
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]<num[j])
				ex = num[j];
				num[j]=num[i];
				num[i]=ex;
			}
		}
		System.out.println("내림차순 정렬 결과");
		for(int i=0;i<num.length;i++){
			System.out.printf("%d ",num[i]);
		}
		
		sc.close();

	}

}
