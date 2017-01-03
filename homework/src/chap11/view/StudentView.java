package chap11.view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import chap11.controller.StudentController;
import chap11.model.Student;

/*
 * View 영역 : 사용자 인터페이스(UI)
 */
public class StudentView {
	// View <-> Controller 
	public static void main(String[] args) throws  ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("관리할 학생 수 : ");
		int size = sc.nextInt();
		
		// Controller 객체 생성 
		StudentController sct = new StudentController();
		int menu;
		
		while(true){
			System.out.println("<< 메뉴 구성 >>");
			System.out.println("1.학생등록");
			System.out.println("2.전체출력");
			System.out.println("3.학생조회");
			System.out.println("4.정보수정");
			System.out.println("5.종료");
			System.out.print("메뉴 번호 선택 : ");
			
			menu = sc.nextInt();
			switch(menu){
			case 1:	// 학생등록 
				sct.insertCall(size);
				break;
			case 2:	// 전체출력
				List<Student> list = sct.selectCall(size);
				if(list.size() == 0){ 
					System.out.println("학생정보가 없습니다.");
				}else{	
					System.out.println("  이름\t 학번\t 학과\t 점수 ");
					for(Student st : list){
						System.out.printf("%6s    %5d   %5s   %3d\n",
							st.getName(),st.getStNo(),st.getMajor(),st.getScore());
					}
				}	
				break;
			case 3:	// 학생조회
				System.out.println("학생 정보 조회");
				break;
			case 4:	// 정보수정
				System.out.println("학생 정보 수정 ");
				break;
			case 5:	// 종료
				System.out.print("프로그램을 종료합니까(y/n) : ");
				String yn = sc.next();
				if(yn.equals("y") || yn.equals("Y")){
					System.out.println("종료합니다.");
					System.exit(0);
				}else{
					return; // 메서드 실행 종료 
				}				
				break;
			default :
				System.out.println("해당 메뉴 없음.");
			}
		}
	}

}
