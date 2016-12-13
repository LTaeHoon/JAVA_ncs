package dataType;

public class Step01_dataType { //class
	/*
	 * java의 기본자료형(8가지) - p45(강의자료)
	 * 1. 정수형 : byte(1), short(2), int(4): 기본형, long(8)
	 * 2. 실수형 : float(4), double(8) : 기본형
	 * 3. 단일문자형 : char(1,2,3) : 유니코드 지원 - 그렇기 떄문에, 문자하나당 다수의 바이트가 할당 될 수 있음
	 * 4. 논리형 : boolean(true,false):1byte
	 *
	 * 나머지 자료형 : 참조형(5장 이후) -> 참조변수
	 */
	public static void main(String[] args) { //method
		// TODO Auto-generated method stub
		System.out.println(10); // 정수 기본형 (int)
		System.out.println(10.7); //실수 기본형 (double)
		System.out.println('한'); //단일 문자형(char)
		System.out.println(true); //논리형 (true/false)
		System.out.println(10l);  //l or L -> 정수형 (long)
		System.out.println(10.7f); //f or F -> 실수형 (float)
		
	} //method end

} //class end
