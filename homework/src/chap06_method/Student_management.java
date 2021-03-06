package chap06_method;

import java.util.Scanner;

public class Student_management {
/*<처리조건>
• 1. 데이터구조 : 이름(String), 학번(int), 학과(String), 점수(int)
• 2. 학생수 결정 : 키보드로 입력 받는다.
• 3. 메뉴 구성 : 다음 [메뉴 구성]을 참고한다.
•4. 메뉴 5개는 별도의 메서드로 정의해 놓고, 메뉴 선택 시 해당 메서드가 호출
되어 실행되도록 하시오.
 [메뉴 구성]
• 1. 학생등록 : 키보드로 학생정보 입력 -> 배열저장
• 2. 전체출력 : 등록학생 전체출력
• 3. 학생조회 : 학번 입력 -> 이름, 학번, 학과, 점수 출력
• 4. 정보수정 : 학번 입력 -> 학과, 점수 수정
• 5. 프로그램 종료 : 프로그램을 종료하시겠습니다?(y/n)
y입력 -> 종료, n입력 -> 프로그램 반복
*/
	public static void student_reg(String []name,int []stuno,String []major,int []score,Scanner sc) {
		//학생 정보 입력
		//Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<name.length;i++){
			System.out.print("학생명 :");
			name[i]=sc.next();
			System.out.print("학번 :");
			stuno[i]=sc.nextInt();
			System.out.print("학과 :");
			major[i]=sc.next();
			System.out.print("점수 :");
			score[i]=sc.nextInt();
		}
		
		
	}
	public static void output(String []name,int []stuno,String []major,int []score) {
		System.out.println("데이터 출력");
		if(stuno[0]==0){
			System.out.println("데이터가 없습니다.");
		}else{
			for(int i=0;i<name.length;i++){
				System.out.printf("%s %d %s %d\n",name[i],stuno[i],major[i],score[i]);
			}
		}
	}
	public static void student_find(int id,String []name,int []stuno,String []major,int []score) {
		for(int i=0;i<stuno.length;i++){
			if(id==stuno[i]){
				System.out.printf("%s %d %s %d\n",name[i],stuno[i],major[i],score[i]);
			}
		}
		
	}
	public static void info_change(int id,int []stuno, String []major,int[] score,Scanner sc){
		for(int i=0;i<stuno.length;i++){
			if(id == stuno[i])
				System.out.println("학과와 점수 정보를 바꾸시겠습니까?(y/n)");
				char yn = sc.next().charAt(0);
				if(yn == 'y'||yn=='Y'){
					System.out.println("학과입력:");
					major[i] = sc.next();
					System.out.println("점수입력:");
					score[i] = sc.nextInt();
				}else if (yn=='n'||yn=='N'){
					System.out.println("학과 및 점수 정보를 그대로 유지합니다.");
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력:");
		int size=sc.nextInt();
		String []name = new String [size];
		
		int []stuno = new int[size];
		String []major = new String[size];
		int []score= new int[size];
		int menu =0;
		while(true){	
			System.out.println("****************");
			System.out.println("*  1. 학생 등록  *");
			System.out.println("*  2. 전체 출력  *");
			System.out.println("*  3. 학생 조회  *");
			System.out.println("*  4. 정보 수정  *");
			System.out.println("*  5. 종     료  *");
			System.out.println("****************");

			System.out.print("  메뉴를 선택하세요 (1~4) :  " );
			menu = sc.nextInt();

			switch (menu){
			case 1:
				student_reg(name,stuno,major,score,sc);
				break;
			case 2:
				output(name,stuno,major,score);
				break;
			case 3:
				System.out.print("학번입력:");
				int id=sc.nextInt();
				student_find(id,name,stuno,major,score);
				break;
			case 4:
				System.out.print("정보수정:학과, 점수 수정");
				int id1=sc.nextInt();
				info_change(id1,stuno,major,score,sc);
				break;
			case 5:
			    System.out.print("프로그램을 종료하시겠습니까?(y/n)");
				char yesno = sc.next().charAt(0);
				
				if(yesno=='y'||yesno=='Y'){
					sc.close();
					System.exit(0); // 프로그램 종료 명령	
				}else if(yesno=='n'||yesno=='N'){
					System.out.println("프로그램 반복");
					break;
				}
				
			default : // 예외처리 
				System.out.println("메뉴를 잘못 선택했습니다.");
				
			}
			
		}
	}

}
