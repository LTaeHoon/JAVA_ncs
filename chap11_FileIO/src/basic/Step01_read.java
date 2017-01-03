package basic;

import java.io.IOException;

public class Step01_read {
	/*
	 * read() 메서드를 이용하여 여러 개 문자 입력
	 * 1. 변수 이용 방법
	 * 2. 배열 이용 방법
	 * 
	 */
	public static void main(String[] args) {
		// 1. 변수 이용 방법
		
		int data = 0;
		System.out.println("문자를 입력하세요 : ");
		/*
		for(int i=1;i<=3;i++){
			try {
				data=System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("num(바이트 스트림) :"+data);
			System.out.println("num(문자 스트림) :"+(char)data);
			
			 * Enter키 (2byte)
			 *  - 13 : 커서 첫줄 이동
			 *  - 10 : 줄 바꿈 기능
			 
		} //for end
		*/
		
		//2. 배열 이용 방법
		byte[] data2 = new byte[20]; //byte 타입의 배열 객체(20)
		int size = 0; //byte 수 저장 변수
		
		try {
			size = System.in.read(data2);
			//byte읽기 ->배열 저장 -> 배열 크기 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//data 출력
		int cnt = 0;
		while(true){
			if(size > cnt){ //탈출 조건
				System.out.println("data2(바이트 스티림) :"+ data2[cnt]);
			    System.out.println("data2(문자 스티림) :"+ (char)data2[cnt]);
				cnt++;
			}else{
				break;
			}
			
		}
		
		
	}

}
