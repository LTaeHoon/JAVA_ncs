package sec01_Method;

import java.util.Scanner;

public class Step05_return2 {
	public static int[] input() { //데이터 입력
		Scanner sc = new Scanner(System.in);
		int [] score = new int[3]; //배열
		for(int i=0;i<score.length;i++){
			System.out.printf("%d번째 점수 입력:",i+1);
			score[i]=sc.nextInt();
		}
		sc.close();
		return score; //배열 객체 리턴
	}
	public static void output(int []score) {
		for(int s:score)
			System.out.println("score : "+s);
	}
	public static void main(String[] args) {
		// input 메서드 호출
		int []score = input(); //score 반환
		output(score);
		// main에서 점수 출력
		/*for(int s:score){
			System.out.println("score : "+s);
		}*/
	}

}
