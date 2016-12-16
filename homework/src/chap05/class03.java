package chap05;

import java.util.Scanner;

public class class03 {
/*
 * 최대 10명까지 관리할 수 있는 학생관리프로그램을 작성하시오.
 * 1. 학생 인원수는 키보드로 입력 받는다.
 * 2. 입력 데이터 : 이름(String), 학번(int), 점수(int)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=0;
		
		int menu=0;
		String stuname="";
		System.out.print("학생수를 입력하세오(10명 제한):");
		size = sc.nextInt();
		String []name = new String[size];
		int []stuno = new int[size];
		int []score = new int[size];
		while(true){
			System.out.println("****************");
			System.out.println("*  1. 성적 입력  *");
			System.out.println("*  2. 성적 출력(전체)  *");
			System.out.println("*  3. 성적 검색(조건)  *");
			System.out.println("*  4. 종     료  *");			
			System.out.println("****************");

			System.out.print("  메뉴를 선택하세요 (1~4) :  " );
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.println("학생이름 입력");
				for(int i=0;i<size;i++){
					name[i]=sc.next();
				}
				System.out.println("학번 입력");
				for(int i=0;i<size;i++){
					stuno[i]=sc.nextInt();
				}
				System.out.print("점수 입력");
				for(int i=0;i<size;i++){
					score[i]=sc.nextInt();
				}
				
				break;
			case 2:
				System.out.println("데이터출력");
				for(int i=0;i<size;i++){
					System.out.printf("%s %d %d\n",name[i],stuno[i],score[i]);
				}
				break;
			case 3:
				System.out.println("성적조회를 원하는 학생의 이름을 입력하세요:");
				stuname = sc.next();
				System.out.println("해당학생의 조회 결과");
				System.out.println("이름\t학번\t점수");
				
				for(int i=0;i<size;i++){
					if(name[i].equals(stuname)){
						System.out.printf("%s\t%d\t%d\n",name[i],stuno[i],score[i]);
					}
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0); // 프로그램 종료 명령
			default : // 예외처리 
				System.out.println("해당 메뉴가 없습니다.");
			}
			
		}
		
	}

}
