package chap07_classII;

import java.util.Scanner;

class Tax{
	static final double TX = 1.1;
	static String [] pname = new String[3]; 
	static int [] price = new int[3];
	static int [] su = new int[3];
	int [] tot = new int[3];
	int temp=0;
	double providesum;
	double buga;
	double total;
	void calc(){
		for(int i=0;i<pname.length;i++){
			tot[i] = price[i]*su[i];
			temp +=tot[i];
		}
		providesum = temp /TX;
		buga = temp - providesum;
		total = temp + buga;
	}
	void display(){
		String sprovidesum = String.format("%,f", providesum);
		String sprovidesum1=sprovidesum.substring(0,sprovidesum.indexOf("."));
		String sbuga = String.format("%,f", buga);
		String sbuga1=sbuga.substring(0,sbuga.indexOf("."));
		String stotal = String.format("%,f", total);
		String stotal1=stotal.substring(0,stotal.indexOf("."));
		
		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("-----------------------------");
		for(int i=0;i<pname.length;i++){
			System.out.println(pname[i]+"\t"+price[i]+"\t"+su[i]+"\t"+this.tot[i]+"원");
		}
		System.out.println("-----------------------------");
		System.out.println("공급가액                    "+sprovidesum1+"원");
		System.out.println("부가세                      "+sbuga1+"원");
		System.out.println("청구금액                    "+stotal1+"원");
	}
}
public class class01 {
/*
 * 조건1) 품명, 단가, 수량은 키보드로 입력 받아서 배열에 저장
조건2) 부가가치세율 : 1.1 <- 클래스 멤버(공용변수) 선언
조건3) 공급가액 = 총금액 / 1.1(부가가치세율)
조건4) 품명별 금액, 총금액,공급가액,부가세,청구금액은 [관련 수식] 참조
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		for(int i=0;i<Tax.pname.length;i++){
			System.out.println("품명, 단가, 수량 입력:");
			Tax.pname[i] = sc.next();
			Tax.price[i] = sc.nextInt();
			Tax.su[i] = sc.nextInt();
		}
		Tax t = new Tax();
		t.calc();
		t.display();
		sc.close();
	}

}
