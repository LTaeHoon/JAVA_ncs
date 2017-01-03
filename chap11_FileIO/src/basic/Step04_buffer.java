package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step04_buffer {
	
	/*
	 * InputStreamReader : 바이트 스트림-> 문자 스트림(인간어)
	 * BufferedReader : 버퍼를 이용하여 문자열 읽기(임시기억장소)
	 */
	public static void main(String[] args) {
		// 표준입력장치로 부터 문자 입력 객체 생성
		InputStreamReader ir = new InputStreamReader(System.in);
		//ir.read(); //단일문자 단위 읽기
		// 버퍼 이용하여 문자열 읽기 객체 생성
		BufferedReader br = new BufferedReader(ir);  //보조스트림
		String str = null;
		System.out.print("문자열을 입력하세요 : ");
		try {
			str = br.readLine();  //문자열 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력한 문자열 :"+str);
		
		// 한 문장으로 나타낸 경우
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("두 수를 입력하세요.");
		String snum1 = null;
		String snum2 = null;
			
		try {
			snum1 = br2.readLine();
			snum2 = br2.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		
		System.out.println(num1 + num2);
	}

}
