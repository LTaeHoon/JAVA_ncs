package chap12.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap12.model.DAO;
import chap12.model.Student;


/*
 * Controller = View와 Model 연결자
 */
public class StudentController {
	// View <-> Controller <-> FileAccess 
	Scanner sc;
	DAO da;
	List<Student> list;
	//생성자
	public StudentController() throws IOException, SQLException {
		sc = new Scanner(System.in); // 키보드 입력 
		da = new DAO(); // DB 접근 객체 생성 
	}
	
	// 학생정보 저장 메서드 
	public void insertCall(int size) throws IOException, SQLException{
		List<Student> list = new ArrayList<Student>();		
		
		for (int i=0; i < size; i++){ // 학생수 만큼 반복 
			Student st = new Student();
			System.out.printf("%d번째 이름 입력 : ",i+1);
			st.setName(sc.next());
			System.out.printf("%d번째 학번 입력 : ", i+1);
			st.setStNo(sc.nextInt());
			System.out.printf("%d번째 학과 입력 : ", i+1);
			st.setMajor(sc.next());
			System.out.printf("%d번째 성적 입력 : ", i+1);
			st.setScore(sc.nextInt());
			list.add(st); // list에 학생정보 저장 
		}			
			da.data_insert(list);// 저장 메서드 호출
	}// method end 
	
	// 학생정보 조회 메서드 
	public List<Student> selectCall(int size) throws IOException, SQLException{		
		List<Student> list = da.data_select(size);		
		return list;		
	}// method end  
	
	public List<Student> findCall(int snum) throws SQLException{
		List<Student> list = da.data_find(snum);
		return list;
	}
	public void updateCall(int snum,String major,int score) throws SQLException{
		da.data_update(snum,major,score);
	}
	
	
}