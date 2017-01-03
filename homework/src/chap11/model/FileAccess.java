package chap11.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileAccess { // File 연동
	
	// file 입출력에 필요한 변수 선언 
	File dir, file;
	String dirName = "C:\\NCS\\upload";
	String fileName = "student.dat";
	
	List<Student> list; 
	PrintWriter pw;	
	BufferedReader br;
	
	// 생성자 : file 입출력 객체 생성 
	public FileAccess() throws IOException {
		dir = new File(dirName);
		if(!dir.exists())
			dir.mkdirs();			
		file = new File(dir, fileName);
		if(!file.exists())
			file.createNewFile();
		
		list = new ArrayList<Student>();
		pw = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));		
	}

	// 학생 정보 저장 메서드 : 파일(DB) 저장 
	public void file_insert(List<Student> list) throws IOException { 
		for(Student st : list){ // 학생수 만큼 반복 
			pw.printf("%s %d %s %d", st.getName(), st.getStNo(), st.getMajor(), st.getScore());
			pw.println();
		}		
		System.out.println("학생수 : " + list.size()); // 학생수 출력 
		pw.close(); // 객체 닫기 
	}

	// 학생 정보 출력 메서드 : 파일(DB) 조회 
	public List<Student> file_select(int size) throws IOException {
		
		list = new ArrayList<Student>();		
		br = new BufferedReader(new FileReader(file));
		
		for (int i = 0; i < size; i++) { 
			// 파일로 부터 한 줄 읽기 -> 공백으로 칼럼 분리			
			String[] line = br.readLine().split(" "); 
			// list에 추가
			list.add(new Student(line[0], Integer.parseInt(line[1]), line[2], Integer.parseInt(line[3])));
		}
		br.close();
		return list; // list 객체 반환
	}

}

