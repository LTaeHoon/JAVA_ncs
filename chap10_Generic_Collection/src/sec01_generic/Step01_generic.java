package sec01_generic;


class StringType{
	String var;    //변수
	String []arr;  //배열
	void setVar(String var){  //변수 초기화
		this.var = var;
	}
	void setArr(String []arr){ //배열 초기화
		this.arr = arr;
	}
	void display(){
		System.out.println("var :"+var);
		for(String s : arr)
			System.out.println("arr원소 :" +s);
	}
} //class end

class IntegerType{
	Integer var;    //변수
	Integer []arr;  //배열
	void setVar(Integer var){  //변수 초기화
		this.var = var;
	}
	void setArr(Integer []arr){ //배열 초기화
		this.arr = arr;
	}
	void display(){
		System.out.println("var :"+var);
		for(Integer s : arr)
			System.out.println("arr원소 :" +s);
	}
} //class end

public class Step01_generic {

	public static void main(String[] args) {
		// 1. StringType 객체 생성
		StringType st = new StringType();
		String name ="홍길동";
		String []name2 ={"이순신","강감찬","유관순"};
		st.setVar(name);
		st.setArr(name2);
		st.display();
		
		// 2. IntegerType 객체 생성
		IntegerType it = new IntegerType();
		Integer num = 100;
		Integer []num2 = {1000,2000,3000};
		it.setVar(num);  //변수
		it.setArr(num2); //배열
		it.display();
		
	}

}