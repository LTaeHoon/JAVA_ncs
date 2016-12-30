package com.mvc.view;

import java.util.List;
import java.util.Scanner;

import com.mvc.controller.Controller;
import com.mvc.model.Student;


/*
 * MVC 디자인 패턴
 *  1. Model : 데이터 생성, 관리, 전송, DB 접근 객체
 *  2. View : 일반 사용자에게 보여지는 페이지
 *  3. Controller : View <-> Model를 연결해주는 역할
 */
public class Viewer {
	/*
	 * 일반 사용자에게 보여지는 화면
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************");
		System.out.println(" 1. 학생정보 보기");
		System.out.println(" 2. 프로그램 종료");
		System.out.println("*****************");
		System.out.println("메뉴 선택 :");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			Controller c = new Controller();
			List<Student> list=c.getList(); //list
			System.out.println("학번\t이름\t학과\t주소");
			for(Student s : list){
				System.out.print(s.getId()+"\t");
				System.out.print(s.getName()+"\t");
				System.out.print(s.getMajor()+"\t");
				System.out.print(s.getAddress()+"\n");
			}
			break;
		case 2:
			System.out.println("프로그램 종료");
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("해당 메뉴가 없습니다.");
			break;
		}
	}//main method end

}
