package next;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Step01_file {
	/*
	 * File 클래스
	 *  - 파일과 폴더(디렉토리)를 생성하는 클래스
	 *  - 파일 입출력 용도
	 */
	public static void main(String[] args) throws IOException {
		// 폴더명 : C:\\NCS\\upload (경로 작성 시 \\ or / 사용) 
		// 파일명 : file.txt
		String saveFolder = "C:\\NCS\\upload";
		
		// 폴더 생성
		File dir = new File(saveFolder);
		if(!dir.exists()){
			dir.mkdirs(); //물리적 폴더 생성
		}
		
		// 파일 생성
		File file = new File(dir, "file.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		// 파일 정보 출력
		System.out.println(file.getAbsolutePath()); // 파일 경로
		System.out.println(file.getName()); // 파일 이름
		System.out.println(file.length());  // 파일 크기		
		
		/*오늘 날짜로 폴더생성 / 파일 생성 */
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		//날짜별로 하위 폴더 생성 경로
		String sub_dir = saveFolder +"/"+year+"-"+month+"-"+day;
		String fileName = "file2.txt";
		File dir2 = new File(sub_dir); //폴더명, 파일명
		
		if(!dir2.exists()){
			dir2.mkdir(); //폴더 생성
		}
		
		File file2 = new File(sub_dir,fileName); //폴더명, 파일명
		if(!file2.exists()){
			file2.createNewFile();
		}
		System.out.println(file2.getAbsolutePath()); // 파일 경로
		System.out.println(file2.getName()); // 파일 이름
		System.out.println(file2.length());  // 파일 크기		
	}

}
