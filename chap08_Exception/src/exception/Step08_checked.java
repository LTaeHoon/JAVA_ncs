package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Step08_checked {

	public static void main(String[] args) throws IOException {
		// 2. checked 방식 : file, DB 입출력
		
		String fileName = "C:\\NCS\\test.txt";
		FileReader file = null; //전역적으로 사용하기 위해 try catch 블럭 바깥쪽에 초기화
		try{
			file = new FileReader(fileName); //예외 처리
			int num;
			while((num=file.read())!=-1){  // -1(Eof)
				System.out.print((char)num); // 문자 출력
			}
			
		}catch(FileNotFoundException e){
			System.out.println("해당 파일이 없습니다.");
			System.out.println("예외 정보 :"+e);
		}finally{
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}
