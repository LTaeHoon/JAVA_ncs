package sec02_Class;

import java.util.Calendar;

class MyDate{
	//멤버변수
	private int day,month,year;
	//생성자 : 객체 + 초기화 , 리턴타입은 없음
	MyDate(int day,int month,int year){ //멤버변수 초기화
		//python : self.day = day, java : this.day = day; 
		//this.멤버변수 = 매개변수
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//멤버메서드
	void display(){
		System.out.printf("%d년 - %d월 - %d일\n",year,month,day);
	}
}
public class Step09_const3 {
	/*
	 * 생성자 용도
	 *  1. 객체 생성 역할
	 *  2. 멤버변수 초기화
	 *  3. 객체 생성 시점에서 자동 처리할 내용
	 * 	   -> 생성자는 객체 생성 시점에 1회 호출
	 * 	   -> new 명령어 사용 시점
	 */
	public static void main(String[] args) {
		// MyDate 객체생성
		MyDate date = new MyDate(25,10,2015);
		//참조변수 : date
		date.display(); //2015년 - 10월 - 25일
		
		// 이미 생성된 객체를 반환하는 클래스
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); //년
		int month = now.get(Calendar.MONTH)+1;  //월
		int day = now.get(Calendar.DATE); //일
		
		MyDate today = new MyDate(day,month,year);
		today.display();
		
	}

}
