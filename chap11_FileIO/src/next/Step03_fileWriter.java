package next;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Step03_fileWriter {
	
	/*
	 * 파일에 문자열 저장
	 *  - FileWriter : 주 스트림 클래스 
	 *  - BufferedWriter : 보조 스트림 클래스 : 버퍼 이용 
	 *  - PrintWriter : 보조 스트림 클래스 : 양식 이용
	 */
	
	public static void main(String[] args) throws IOException {
		// 1. 폴더와 파일 생성 - File
		String saveFile = "C:/NCS/upload/file3.txt";
		File file = new File(saveFile);
		
		// 2. 파일에 문자열 저장 객체 생성 - FileWriter / BufferedWriter
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		// 3. 키보드로 입력한 데이터(저장) - InputStreamReader / BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1;i<=4;i++){
			System.out.printf("%d번째 문자열 입력:\n",i);
			String msg = "";
			msg = br.readLine();
			
			//문자열 -> 파일 저장(bw:1~2,pw:3~4)
			if(i <=2){
				bw.write(msg);
				bw.newLine(); // 줄 바꿈
			}else{
				pw.printf("입력한 문자열: %s입니다.",msg);
				pw.println(); // 줄 바꿈
				pw.println(msg); // 문자열 출력(줄바꿈)
			}
			
		}// for end
		
		//객체 닫기
		pw.close();
		bw.close();
		fw.close();
		System.out.println("file3.txt 파일을 확인하세요.");
	}

}
