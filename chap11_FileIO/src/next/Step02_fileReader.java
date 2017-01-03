package next;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Step02_fileReader {
	/*
	 * 파일로부터 문자입출력 관련 클래스
	 *  - FileReader/FileWriter
	 *  - BufferedReader
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "C:\\NCS\\java\\workspace(java)\\chap11_FileIO\\src\\next\\Step01_file.java";
		
		// 파일로 문자스트림 방식으로 읽는 객체 생성
		FileReader fr = new FileReader(fileName);
		// 버퍼 할용 줄 단위 읽기 객체 생성
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		
		// 줄단위 읽고/출력
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
		
		//객체 닫기
		br.close();fr.close();
		
	}	

}
