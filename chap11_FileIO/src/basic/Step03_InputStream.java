package basic;

import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_InputStream {
	/*
	 * InputStreamReader 클래스
	 * 	- 바이트스트림(기계) -> 문자스트림(인간어) 변환
	 *  - char 형변환 필요없음
	 *  - 키보드 데이터 입력 -> 컴퓨터 저장
	 *    ex) A(키보드) -> 65(컴퓨터 저장) -> A(콘솔 출력)
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []msg = new char[20]; //단일문자 배열 객체
		int size = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("문자를 입력하세요 : ");
		
		try {
			size = isr.read(msg);//System.in.read()와 유사, 문자읽고 -> 배열 저장 -> 문자크기 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		for(int i=0;i<size;i++){
			System.out.print(msg[i]);
		}
	}
}
