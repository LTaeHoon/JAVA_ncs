package chap06_class;

import java.util.Scanner;

class Temporary{
	String name;
	int time,pay;
	
	Temporary(String name,int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	float pay_calc(){
		return (this.time * this.pay)-(this.time * this.pay*0.033f);
	}
	void display(float real_pay){
		int tot_pay = this.time*this.pay;
		float diff = tot_pay*0.033f;
		String tot_spay = String.format("%,d", tot_pay);
		String sdiff = String.format("%,f", diff);
		String sdiff1=sdiff.substring(0,sdiff.indexOf("."));
		String sreal_pay = String.format("%,f", real_pay);
		String sreal_pay1=sreal_pay.substring(0,sreal_pay.indexOf("."));
		
		System.out.printf("이름 : %s\n",this.name);
		System.out.printf("총급여 : %s 원\n",tot_spay);
		System.out.printf("공제액 : %s 원\n",sdiff1);
		System.out.printf("실지급액 : %s 원\n",sreal_pay1);
		
	}
}
public class class04 {
/*
 * 임시직 클래스(Temporary) 설계
멤버변수 : 이름(name), 작업 시간(time), 시간당 급여(pay)
생성자 : 멤버변수에 초기화 역할 (this 키워드 사용)
메서드(pay_calc) : 급여 계산 관련 메서드
•총급여(tot_pay) = 작업시간 * 시간당 급여
•공제액(diff) = 총급여액 * 0.033
•실지급액(real_pay) = 총급여 - 공제액
main( ) : 키보드로 이름, 작업 시간, 시간당 급여를 입력 받아서
생성자를 이용하여 멤버변수에 초기화
급여계산 관련 메서드를 호출하여 급여를 계산한 후 결과 출력
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 작업 시간, 시간당 급여를 입력하세요.");
		String name = sc.next();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		Temporary tm = new Temporary(name,time,pay);
		float result = tm.pay_calc();
		tm.display(result);
		sc.close();
		
	}

}
