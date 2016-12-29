package sec05_Inner;

class Outer{
	int outValue; //100
	Inner in;
	Outer(int outValue){ //100
		this.outValue = outValue;
		in = new Inner(200);
		in.display();
	}
	class Inner{
		int inValue;
		Inner(int inValue){
			this.inValue = inValue;
		}
		void display(){
			System.out.println("outValue : "+outValue); //100
			System.out.println("inValue : "+inValue); //200
		}
	}// inner end
}//outer end

public class Step03_inner {
	/*
	 * 중첩클래스
	 *  - 클래스 내에서 또 다른 클래스를 자신에 멤버로 선언하는 유형
	 *  - 예) 성적처리 클래스 안에 성적 전담 클래스
	 *  형식)
	 *  class Outer{
	 *  	Outer(){}
	 *  	class Inner{
	 *  		Inner(){}
	 *  	}
	 *  }
	 */
	public static void main(String[] args) {
		// Outer 객체 생성
		Outer out = new Outer(100); //3개 문장이 수행
		
		// Inner 객체 생성
		/*
		 * Outer.Inner 참조변수 = Outer 참조변수.new Inner();
		 */
		Outer.Inner inn = out.new Inner(2000);
		inn.display(); //inValue : 2000
	}

}
