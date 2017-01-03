package chap10.view;

import java.util.List;
import java.util.Scanner;

import chap10.controller.MemberController;
import chap10.model.MemberModel;

public class MemberViewer {
	
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		List<MemberModel> list=mc.getList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************");
		System.out.println(" 1. 학생정보 전체보기");
		System.out.println(" 2. 학생검색");
		System.out.println(" 3. 프로그램 종료");
		System.out.println("*****************");
		System.out.println("메뉴 선택 :");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			for(MemberModel m : list)
				System.out.printf("이름 : %s, 아이디 : %s, 비번 : %s, 주소 : %s\n",m.getName(),m.getId(),m.getPwd(),m.getAddress());
			break;
		case 2:
			System.out.println("이름을 입력하세요.");
			String name = sc.next();
			int cnt =0;
			for(MemberModel m : list){
				if(m.getName().equals(name)){
					System.out.printf("이름 : %s, 아이디 : %s, 비번 : %s, 주소 : %s\n",m.getName(),m.getId(),m.getPwd(),m.getAddress());
					cnt++;
				}
			}
			if(cnt==0){
				System.out.println("관련 정보가 없습니다.");
			}
			
			break;
		case 3:
			System.out.println("프로그램 종료");
			sc.close();
			System.exit(0);
		default:
			System.out.println("해당메뉴가 없습니다.");
			break;
		}
		
	}

}