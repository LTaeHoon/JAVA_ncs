package sec02_Class;


/*1. class 정의 */
class First{ //start //클래스 첫자는 대문자
	int num; //멤버변수(전역변수: 해당 클래스 내 어디서든 쓸 수 있음)
	
	void display(){ //멤버메서드
		int num2=100;  //지역변수
		System.out.println("num = " + num);
		System.out.println("num2 = "+ num2);
	}
}// class end

public class Step01_class1 {
	/*
	 * 클래스(class)
	 *  1. java는 클래스 단위로 프로그램 작성
	 *  2. 클래스의 구성요소 : 멤버(member)
	 *  3. 멤버 : 속성 + 기능
	 *     -> 속성 : 멤버변수(저장) - 명사
	 *     -> 기능 : 멤버 메서드(함수) - 동사
  	 *	[형식]
  	 *	[public] class 클래스명{ //시작
  	 *		멤버변수;     // 클래스 특징 
  	 *		멤버메서드(){ // 클래스 행위
  	 *			실행문;
  	 *		}
  	 *	}//끝
	 */ 
	public static void main(String[] args) {
		// 프로그램 시작점
		/* 2. class의 객체 생성 */
		//Scanner sc = new Scanner(System.in);
		//형식) 클래스 참조변수 = new 클래스();
		First f = new First();
		/*
		 * 객체(object) 생성 과정
		 * 1. new 명령어를 이용하여 First 클래스의 객체 생성
		 *  -> 생성된 객체는 Heap 영역 저장(주소)
		 * 2. 객체의 주소를 참조변수로 반환
		 */
		/* 3. 참조변수를 이용해 멤버 호출*/
		System.out.println("첫번째 객체 정보");
		f.num = 10; //참조변수.멤버변수 = 10
		f.display(); //참조변수.멤버메서드()
		
		/* 2번째 객체 생성*/
		First f2 = new First();
		
		/* 2번째 참조변수 이용*/
		System.out.println("두번째 객체 정보");
		f2.num = 20;
		f2.display();
		
	}//method end

}
