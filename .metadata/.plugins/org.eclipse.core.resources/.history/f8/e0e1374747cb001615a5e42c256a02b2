package Step04_AccessTwo;

import Step04_AccessOne.Super;  //패키지명.클래스명

/*
 * 클래스의 접근지정자
 *  1. public : 메인 클래스 - 모든 클래스에서 접근
 *  2. default : 기본 클래스 - 현재 패키지에서 접근 
 */
public class Sub extends Super {
	//멤버변수 4개 상속 (num1 ~ num4)
	
	public static void main(String[] args) {
		// 자식클래스 객체 생성
		Sub sub = new Sub();
		//System.out.println("num= "+ sub.num); //private
		//System.out.println("num2 = "+ sub.num2); //default :동일 패키지에서만 접근 가능
		System.out.println("num3 = "+ sub.num3);
		System.out.println("num4 = "+ sub.num4);
	}

}
