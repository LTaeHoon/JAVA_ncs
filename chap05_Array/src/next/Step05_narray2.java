package next;

import java.util.Scanner;

public class Step05_narray2 {
	/*
	 * 다차원 배열에 length 속성 사용(3행2열)
	 *  1. for(int i=0;i<배열.length;i++) #행
	 *  2. for(int j=0;j<배열[행].length;j++) #열
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.println("행수 입력:");
		row = sc.nextInt();
		System.out.println("열수 입력:");
		col = sc.nextInt();
		// 1. 다차원 배열 선언
		int [][] arr;
		
		// 2. 배열 객체 생성
		arr = new int[row][col];  //[행][열]
		
		// 3. 배열 초기화
		int cnt=0;
		for(int i=0;i<arr.length;i++){ // i : 행
			
			for(int j=0;j<arr[i].length;j++){ // j : 열
				cnt++;
				arr[i][j]= cnt;
			}//inner for
		}//outer for
		//4. 배열 원소 출력
		for(int i=0;i<arr.length;i++){ // i : 행
			for(int j=0;j<arr[i].length;j++){ // j : 열
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
			}//inner for
		}//outer for
		sc.close();
	}
}
