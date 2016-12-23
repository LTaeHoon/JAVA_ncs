package sec02_inheritance;

class Point{ //부모클래스
	int x;  // x좌표
	int y;  // y좌표
	Point(){ } // 기본생성자
	Point(int x, int y){  //객체 생성 + 초기화
		this.x =x;
		this.y =y;
	}
}
class Point3D extends Point { //자식클래스(3차원)
	//int x;  // x좌표 - 부모멤버
	//int y;  // y좌표 - 부모멤버
	int z; //자식멤버(추가)
	
	Point3D(){ } //기본생성자
	Point3D(int x, int y){ //생성자 : 부모멤버 초기화 용도 (2개)
		super(x,y); //부모 생성자 호출
	}
	Point3D(int x, int y, int z){ //객체 생성 + 초기화(3개)
		this(x,y); //매개변수 2개 생성자 호출
		this.z = z; //3
	}
	void display(){
		System.out.printf("x = %d, y = %d, z = %d\n",x,y,z);
	}
	
}
public class Step05_this_super2 {
	/*
	 * 1. super/super()
	 * 	- super : 부모의 멤버 호출(접근)
	 *  - super(): 부모의 생성자 호출
 	 *
	 * 2. this/this()
	 *  - this : 현재 클래스의 멤버 호출
	 *  - this() : 현재 클래스의 또 다른 생성자 호출
	 */
	public static void main(String[] args) {
		//자식 클래스 객체 생성
		Point3D p3 = new Point3D(5,10,3);
		p3.display();//x = 5, y = 10, z = 3

	}

}
