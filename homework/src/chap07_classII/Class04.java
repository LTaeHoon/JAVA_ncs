package chap07_classII;

import java.util.Scanner;


abstract class Employee2{
	private String name;	//이름
	
	//생성자
	Employee2(){}
	Employee2(String name){
		this.name = name;
	}	
	
	//Setter, Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract int getPay(); //급여계산(추상메소드)

}

class Permanent2 extends Employee2{//정규직 
	int salary, bonus; //기본급, 보너스
	//생성자 생성
	Permanent2(String name1, int salary ,int bonus){ //이름,급여,기본급,보너스
		super(name1);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	//GetPay
	public int getPay(){
	     return	this.salary + this.bonus;
	}	//pay(급여)=	 기본급	+	보너스 
		
	//출력
	void display(){
		System.out.println("===============================");
		System.out.println("고용형태 : 정규직");
		System.out.printf("이름 : %s \n급여 : %,3d원 \n", getName() ,getPay());
	}
}
class Temporary2 extends Employee2{//임시직
	int time, Pay; //기본급, 보너스
	//생성자 생성
	Temporary2(String name, int time ,int Pay){ //이름,급여,기본급,보너스
		super(name);
		this.time = time;
		this.Pay = Pay;
	}
	
	//GetPay
	public int getPay(){
	      return this.time * this.Pay;
	}	//pay(급여)=	 작업시간	+ 시간당급여
		
	//출력
	void display(){
		System.out.println("===============================");
		System.out.println("고용형태 : 임시직");
		System.out.printf("이름 : %s \n급여 : %,3d원 \n", getName() ,getPay());
	}
}

public class Class04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		boolean count = true;
		while(count){
			System.out.println("고용형태-정규직<P>, 임시적<T>를 입력하세요.");
			String str = sc.nextLine();
	
			if(str.equals("P"))
			{
				System.out.println("이름, 기본급, 보너스를 입력하세요.");//이름,기본급,보너스
				Permanent2 per = new Permanent2(sc.next(), sc.nextInt(), sc.nextInt()); //사용자 입력으로 값 초기화
				
				per.getPay();
				per.display();
				
				count = false;
			}else if(str.equals("T")){
				System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");//이름,작업시간,시간당급여
				Temporary2 Tem = new Temporary2(sc.next(), sc.nextInt(), sc.nextInt());
				
				Tem.getPay();
				Tem.display();
				count = false;
			}else{
				System.out.println("잘못입력하셨습니다.");
				
			}
		}
		sc.close();
	}//main
}//class
