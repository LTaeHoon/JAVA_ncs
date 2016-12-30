package sec01_generic;

class Generic<T>{  // Type - 1. String , 2. Integer
	T var;    //변수
	T []arr;  //배열
	void setVar(T var){  //변수 초기화
		this.var = var;
	}
	void setArr(T []arr){ //배열 초기화
		this.arr = arr;
	}
	void display(){
		System.out.println("var :"+var);
		for(T s : arr)
			System.out.println("arr원소 :" +s);
	}
} //class end

public class Step02_generic2 {
	/*
	 * 제네릭(Generic): 포괄적인
	 * 1. 클래스에 자료형을 지정하여 객체를 생성하는 문법
	 * 2. 포괄적(이점) : 하나의 클래스로 서로 다른 자료형을 갖는 객체 생성
	 * 3. 데이터 안정성 보장 : 타입 불일치를 에러로 잡아줌
	 * 4. jdk 1.5 추가 기능
	 * 5. 기본자료형은 wrapper class 이용 
	 */

	public static void main(String[] args) {
		// 1. StringType 객체 생성
		Generic<String> gc = new Generic<String>();
		String name ="홍길동";
		String []name2 ={"이순신","강감찬","유관순"};
		gc.setVar(name);
		gc.setArr(name2);
		gc.display();
		
		// 2. IntegerType 객체 생성
		Generic<Integer> gc2 = new Generic<Integer>();
		Integer num = 100;
		Integer []num2 = {1000,2000,3000};
		gc2.setVar(num);  //변수
		gc2.setArr(num2); //배열
		gc2.display();
		
		//gc2.setVar("홍길동"); //Error - 타입 불일치
		
		Generic gc3 = new Generic();
		gc3.setVar(name); // string
		gc3.setVar(num);  // Integer
		
	}

}
