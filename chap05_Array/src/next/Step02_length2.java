package next;

import java.util.Scanner;

public class Step02_length2 {
	/*
	 * 키보드로 배열의 크기를 입력받아서 객체 생성하는 예문
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력 : ");
		
		//배열 선언 + 객체 생성
		int size = sc.nextInt();
		int score[] = new int[size];
		
		//배열 초기화
		for(int i=0;i<score.length;i++){
			System.out.printf("%d번째 정수 입력: ",i+1);
			score[i] = sc.nextInt();
		}
		
		//배열 이용 : 가장 큰 점수와 가장 작은 점수를 출력하시오.
		for(int s:score)
			System.out.println(s);
		int max=0,min=999;
		
		for(int s:score){
			if(s>max) max =s; //max보다 크면 max에 할당
			if(s<min) min =s; //min보다 작으면 min에 할당
		}
		System.out.printf("최댓값 : %d, 최소값 : %d\n",max,min);
		
		sc.close();
		
		

	}

}
