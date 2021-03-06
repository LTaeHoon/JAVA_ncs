package sec02_Class;

/*
 * 문1) 영화대본점수(scripting), 감독점수(directing), 배우점수(acting)의 
 * 	  멤버변수를 갖는 movie 클래스를 정의하시오.
 * 	 조건1) 생성자로 멤버변수 초기화(10점 만점)
 * 	 조건2) display() 메서드로 영화 정보 출력
 * 문2) 영화제목(title) 멤버변수를 추가하시오.
 * 	 조건) 제목, 3개 점수를 출력할 수 있는 display2()메서드 추가
 */

class Movie{
	String title;
	int scripting,directing,acting;
	Movie(){} //기본 생성자
	//생성자1 : 멤버변수 초기화 생성자 : 점수
	Movie(int scripting,int directing,int acting){
		this.scripting = scripting;
		this.directing = directing;
		this.acting = acting;
		
	}
	//생성자2 : 제목, 점수
	Movie(String title,int scripting,int directing,int acting){ //4개
		this(scripting,directing,acting); //생성자2 -> 생성자1 , this() 생성자 첫단에 와야함
		this.title = title;
		/*this.scripting = scripting;
		this.directing = directing;
		this.acting = acting;*/
		
	}
	int tot(){
		return this.scripting+this.directing+this.acting;
	}
	void display(){
		//멤버메서드에서 this 키워드 사용
		System.out.printf("대본점수 : %d\n",this.scripting);
		System.out.printf("감독점수 : %d\n",this.directing);
		System.out.printf("배우점수 : %d\n",this.acting);
	}
	void display2(){
		//멤버메서드에서 this 키워드 사용
		
		System.out.printf("영화제목 : %s\n",this.title);
		System.out.printf("대본점수 : %d\n",this.scripting);
		System.out.printf("감독점수 : %d\n",this.directing);
		System.out.printf("배우점수 : %d\n",this.acting);
	}
}

public class Step10_this {
	/*
	 * this 키워드
	 *  - 현재 클래스의 객체를 참조할 수 있는 주소값을 갖는다.
	 *  - 용도는 현재 클래스의 멤버를 지정할 때 사용된다.
	 *  	형식)
	 *  	this.멤버변수
	 *  	this.멤버메서드()
	 *  this()
	 *   - 생성자에서 다른 생성자 호출 역할
	 *     형식)
	 *     this(실인수);
	 *   - 주의 : 생성자 첫문장에서 작성
	 */
	public static void main(String[] args) {
		// Movie 객체 생성
		
		Movie m = new Movie(10,8,9);
		//영화 정보 출력
		m.display();
		
		Movie m2 = new Movie("거기 있어 줄래요?",5,8,8);
		m2.display2();
		
		
		/*
		 * 문3) 영화총점을 대상으로 다음과 같이 평가하시오.
		 * 	   총점 계산 : tot() 함수에서 리턴 받기
		 *     28점 이상: ★★★★★
		 *     26점 이상: ★★★★
		 *     24점 이상: ★★★
		 *     24점 미만: ★★
		 *     출력예시
		 *     영화제목 : 거기 있어 줄래요?
		 *	    대본점수 : 10
		 *	    감독점수 : 8
		 *	    배우점수 : 10
 		 *	    영화평가 : ★★★★★
		 */
		int result=m2.tot();
		String result1 = null;
		if(result >=28){
			result1 ="★★★★★";
		}else if(result>=26){
			result1 ="★★★★";
		}else if(result>=24){
			result1 ="★★★";
		}else{
			result1 ="★★";
		}
		System.out.println("영화평가:"+result1);
	}

}
