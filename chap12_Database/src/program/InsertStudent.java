package program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DriverTest;

public class InsertStudent {
	/*
	 * student 테이블에 레코드 삽입 
	 */
	public static void main(String[] args) throws SQLException, IOException {
		// 1. 오라클 DB 연동 객체 변수 선언
		Connection con = null;
		// 2. 쿼리문 실행 변수 선언
		PreparedStatement pstm = null;
		// 3. 쿼리문 저장 변수 선언
		String sql = null;
		
		// DB 연동 객체 생성
		DriverTest dt = new DriverTest();
		con = dt.con();
		
		try{
			// 1. 학생정보 키보드 입력 : 4개 칼럼 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력:");
			String name = sc.next();
			System.out.print("점수 입력:");
			int score = sc.nextInt();
			System.out.print("전화번호 입력:");
			String phone = sc.next();
			System.out.print("이메일 입력:");
			String email = sc.next();
			
			// 2. SQL문 작성
			sql = "insert into student values(st_seq.nextval,?,?,?,?,sysdate)";
			// 3. SQL문 실행
			pstm = con.prepareStatement(sql);
			// 4. ?에 값 배정
			pstm.setString(1, name);
			pstm.setInt(2, score);
			pstm.setString(3, phone);
			pstm.setString(4, email);
			
			// 5. insert,update,delete문 실행
			int result = pstm.executeUpdate(); // 성공한 레코드 수 반환 
			/*
			 * select문 : executeQuery()
			 * insert,update,delete문 : executeUpdate()
			 */
			if(result >=1){
				System.out.println("레코드 삽입 성공");
			}else{
				System.out.println("레코드 삽입 실패");
			}
		
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			pstm.close();con.close();
		}
		

	}

}
