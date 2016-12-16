package chap04;

import java.util.Scanner;

public class class03 {

	public static void main(String[] args) {
		String name="";
		String maj="";
		int level=0;
		int menu=0;
		while(true){ // 무한 반복 
			Scanner sc = new Scanner(System.in);
			System.out.println("****************");
			System.out.println("*  1. 입력     *");
			System.out.println("*  2. 출력     *");
			System.out.println("*  3. 종료     *");
			System.out.println("****************");

			System.out.print("  메뉴 입력 :  " );
			menu = sc.nextInt();
			
			
			switch(menu){
			case 2 : // 2. 출력
				if(name.equals("")&&maj.equals("")&&level==0){
					//입력값이 없으면
					//menu =1;
					System.out.println("입력부터 하세요.");
					
				}else{
					System.out.println("2. 출력");	
					System.out.printf("이름 : %s, 학년 : %d, 학과 : %s\n",name,level,maj);
					break;
				}
				
			case 1 : // 1. 입력
				System.out.println("1. 입력");
				System.out.print("이름 :");
				name = sc.next();
				System.out.print("학년 :");
				level = sc.nextInt();
				System.out.print("학과 :");
				maj = sc.next();
				break;
			
			case 3 : // 3. 종료
				System.out.println("프로그램 종료");
				System.exit(0); // 프로그램 종료 명령
				sc.close();
			default : // 예외처리 
				System.out.println("해당 메뉴가 없습니다.");
			} // switch end 
			
		} // while end 

	}

}
