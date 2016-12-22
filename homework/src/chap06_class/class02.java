package chap06_class;

import java.util.Scanner;

class Person{
	String name,gender;
	int age;
	Person(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	void display(){
		System.out.printf("이름 : %s, 성별 : %s, 나이 : %d\n",this.name,this.gender,this.age);
	}
}

public class class02 {
/*
 * 멤버 변수 : 이름(name), 성별(gender), 나이(age)
멤버 메서드(display) : 이름, 성별, 나이 출력 기능
생성자 : 키보드로 입력 받은 이름, 성별, 나이를 멤버변수에 초기화
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 성별, 나이를 입력하세요");
		String name = sc.nextLine();
		String gender = sc.nextLine();
		int age = sc.nextInt();
		
		Person p = new Person(name,gender,age);
		p.display();
		sc.close();
		
	}

}
