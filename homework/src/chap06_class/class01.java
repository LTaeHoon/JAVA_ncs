package chap06_class;

import java.util.Scanner;

class Rect{
	int w,h;
	Rect(){}
	Rect(int w, int h){
		this.w=w;
		this.h=h;
	}
	int area(){
		return w*h;
	}
	int circum(){
		return 2*(w+h);
	}
}
public class class01 {
/*
 * 멤버 변수 : 가로(w), 세로(h)
생성자 : 가로, 세로 멤버변수 초기화
멤버 메서드(area) : 사각형의 넓이를 구하는 메서드
멤버 메서드(circum) : 사각형의 둘레를 구하는 메서드
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w,h;
		System.out.println("사각형의 넓이와 높이를 입력하세요");
		w =sc.nextInt();
		h =sc.nextInt();
		Rect r = new Rect(w,h);
		int area=r.area();
		int circum = r.circum();
		System.out.println("사각형의 넓이 "+area);
		System.out.println("사각형의 둘레 "+circum);
		
		sc.close();
	}

}
