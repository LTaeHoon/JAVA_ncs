package sec01_Method;

import java.util.Scanner;

public class Step06_exam {
	/*
	 * 1. input() : 3개 과목점수 입력 (배열 저장)
	 * 2. total() : 3개 과목점수의 총점
	 * 3. avg() : 총점에 대한 평균
	 * 	  모든 메서드는 main에서 호출
	 */
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int [] score = new int[3]; //배열
		for(int i=0;i<score.length;i++){
			System.out.printf("%d번째 점수 입력:",i+1);
			score[i]=sc.nextInt();
		}
		sc.close();
		return score; //배열 객체 리턴
	}
	public static int total(int []score) {
		int sum=0;
		for(int s:score){
			sum +=s;
		}
		System.out.println("과목 점수 총합:"+sum);
		return sum;
	}
	public static float avg(int total,int []score) {
		return (float)total/score.length;
		
	}
	public static void main(String[] args) {
		int []score = input();
		int total=total(score);
		float avg=avg(total,score);
		System.out.printf("과목평균 : %.2f\n",avg);
	}

}
