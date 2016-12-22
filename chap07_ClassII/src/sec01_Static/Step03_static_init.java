package sec01_Static;
class StaticC{
	int instNum; //인스턴스 멤버
	static int num1;
	static int num2;
	static int []arr = new int [5];
	static{
		//instNum = 100; error 인스턴스멤버는 static 블럭에서 못씀
		num1 = 10;
		num2 = 20;
		for(int i=0;i<arr.length;i++)
			arr[i] = i+1;
	}
	static void display(){
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		
	}
}
public class Step03_static_init {
	/*
	 * static 초기화 블럭
	 *  - 다수의 static 멤버를 대상으로 초기화하는 블럭
	 *  - 클래스가 메모리로 로딩 될 때 자동으로 호출
	 *  형식)
	 *  static{
	 *  	static 멤버변수  = 초기값;
	 *  }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticC.display();
		/*
		 * num1 =10
		 * num2 =20
		 */
		//arr 배열 5개 출력(for이용)
		
		for(int i:StaticC.arr)
			System.out.println("arr 원소 = "+i);
			
	}

}
