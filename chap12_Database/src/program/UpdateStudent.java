package program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DriverTest;

public class UpdateStudent {
	/*
	 * 레코드 수정
	 * 1. 학번으로 수정할 학생 조회
	 * 2. 해당 학생이 있으면 전화번호, 이메일 수정
	 * 3. 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException, IOException {
		// 1. 오라클 DB 연동 객체 변수 선언
		Connection con = null;
		// 2. 쿼리문 실행 변수 선언
		PreparedStatement pstm = null;
		// 3. 조회 결과를 저장하는 변수 선언
		ResultSet rs = null;
		// 4. 쿼리문 저장 변수 선언
		String sql = null;
		
		// DB 연동 객체 생성
		DriverTest dt = new DriverTest();
		con = dt.con();
		
		try{
			/* 1. 수정할 학생 조회 */
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 학번 입력:");
			int num = sc.nextInt();
			
			// SQL문 작성 : 조건 검색
			sql = "select * from student where num=?";
			// SQL문 실행
			pstm = con.prepareStatement(sql);  // 1차 sql문 실행
			pstm.setInt(1, num);    //값 배정
			rs=pstm.executeQuery(); //2차 select문 실행
			
			if(rs.next()){ //1회만 수행 (해당 학생 있음)
				/* 2. 해당 학생이 있으면 전화번호, 이메일 수정 */
				System.out.print("수정할 전화번호 입력:");
				String phone = sc.next();
				System.out.print("수정할 이메일 입력:");
				String email = sc.next();
				//SQL 문 작성
				sql = "update student set phone=?,email=? where num=?";
				pstm = con.prepareStatement(sql);
				pstm.setString(1, phone);
				pstm.setString(2, email);
				pstm.setInt(3, num);
				int result = pstm.executeUpdate(); // update문 실행 
				if(result>=1){
					System.out.println("레코드 수정 성공");
				}else{
					System.out.println("레코드 수정 실패");
				}
			}else{
				System.out.println("해당 학생은 없습니다.");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}

	}

}
