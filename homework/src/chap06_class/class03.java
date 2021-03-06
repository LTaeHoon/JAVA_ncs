package chap06_class;

import java.util.Scanner;

class NameCard{
	String name, phone, address, rank;
	NameCard(String name, String phone, String address, String rank){
		this.name = name;
		this.phone= phone;
		this.address = address;
		this.rank = rank;	
	}
	void display(){
		System.out.printf("이름: %s\n",this.name);
		System.out.printf("전화번호: %s\n",this.phone);
		System.out.printf("주소: %s\n",this.address);
		System.out.printf("직급: %s\n",this.rank);
	}
}

public class class03 {

	/*
	 * NameCard : 명함정보 클래스
•멤버 변수 : 이름(name), 전화번호(phoe), 주소(address), 직급(rank)
•생성자 : 멤버변수 초기화(this 키워드 사용)
•멤버 메서드(disaply) : 멤버변수값을 콘솔에 출력하는 메서드
Main : 메인 클래스(main 메서드 포함)
•키보드로 명함정보를 입력 받아서 NameCard 클래스의 멤버변수에 초기화
•NameCard 클래스의 멤버 메서드를 호출하여 콘솔에 명함정보 출력
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");
		String name = sc.nextLine();
		String phone= sc.nextLine();
		String address = sc.nextLine();
		String rank = sc.nextLine();
		
		NameCard nc = new NameCard(name,phone,address,rank);
		nc.display();
		
		sc.close();
	}

}
