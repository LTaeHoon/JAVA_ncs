package sec02_Class;
class Data1{
	int x = 100; //멤버변수
}
class Data2{
	int y = 200; //멤버변수
}

public class Step04_classType {
	
	public static void change2(Data1 d1,Data2 d2){
		int temp1 =0;
	    temp1 = d1.x;
		d1.x = d2.y;
		d2.y = temp1;
	   
	}
	public static void change(int []x,int[]y){//원소 변경
		int temp = 0; //임시변수
		for(int i=0;i<x.length;i++){
			temp = x[i];  //x,y 원소 교체
			x[i] = y[i];
			y[i] = temp;
		}
	}
	public static void main(String[] args) {
		//Data1, Data2 객체 생성
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
		System.out.println("d1.x="+d1.x);
		System.out.println("d2.y="+d2.y);
		
		change2(d1,d2); //
		
		System.out.println("d1.x="+d1.x);
		System.out.println("d2.y="+d2.y);
		int []x ={1,2,3};
		int []y ={10,20,30};
		for(int i:x)
			System.out.print(i+" ");//1 2 3
		System.out.println();
		for(int i:y)
			System.out.print(i+" "); // 10 20 30
			
		change(x,y); //메서드 호출
		System.out.println(); //빈줄
		for(int i:x)
			System.out.print(i+" "); //10 20 30
		System.out.println();
		for(int i:y)
			System.out.print(i+" "); // 1 2 3
			
	}

}
