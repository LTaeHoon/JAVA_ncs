package chap09;

import java.util.Scanner;

class Student{
	int snum;
	int gnum;
	Score s;
	Scanner sc;
	
	Student(int snum,int gnum,Scanner sc){
		this.snum =snum;
		this.gnum = gnum;
		this.sc= sc;
		s = new Score(this.snum,this.gnum);
		s.score_input(sc);
		s.calc();
		s.display();
	}
	class Score{
		int [][]score=null;
		int []sum = new int [gnum];
		float []avg = new float [gnum];
		Score(int snum,int gnum){
			score = new int[snum][gnum];
		}
		void score_input(Scanner sc){
			for(int i=0;i<score.length;i++){
				System.out.printf("%d 번째 학생의\n",i+1);
				for(int j=0;j<score[i].length;j++){
					System.out.printf("\t %d 번째 성적 입력:",j+1);
					score[i][j]=sc.nextInt();
				}
			}
		}
		void calc(){
			
			
			for(int i=0;i<score.length;i++){
				
				for(int j=0;j<score[i].length;j++){
					sum[i] +=score[i][j];
				}
				avg[i] = (float)sum[i]/score[i].length;
			}
			
		}
		void display(){
			for(int i=0;i<score.length;i++){
				System.out.printf("%d 번째 학생 성적처리 결과\n",i+1);
				System.out.printf("총점: %d, 평균 : %.2f, 과목별 점수 : %d %d %d\n",sum[i],avg[i],score[i][0],score[i][1],score[i][2]);
			}
			
		}
	}
}
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로 학생수와 과목수를 입력 받아서 입력 받은 학생수 만큼 개인별 과목 점수에 대한 성적을 처리하시오.
			[처리조건]
			1. Student(Outer class)
			-> 성적관리에 필요한 멤버변수 선언 (학생수,과목수 등)
			-> 생성자를 이용하여 값 초기화
			-> Inner class 객체 생성
			-> Inner class 멤버 메서드 호출
			2. Score(Inner class)
			-> 학생수와 과목수 만큼 배열 객체 생성
			-> 키보드로 학생수 만큼 과목점수 입력
			-> 학생 단위 총점,평균,각 과목점수 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int snum = sc.nextInt();
		System.out.print("과목수를 입력하세요:");
		int gnum = sc.nextInt();
		Student s = new Student(snum,gnum,sc);
		
		
	}

}
