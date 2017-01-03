package program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.DriverTest;

public class DeleteStudent {
/*
 *  레코드 삭제
 *  - 조건1 : 학번으로 조회
 *  - 조건2 : 해당 학생이 있으면 삭제, 없으면 " 해당 학생 없음"
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
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
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 학생 학번 입력:");
			int num = sc.nextInt();
			sql ="select * from student where num=?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, num);
			rs=pstm.executeQuery();
			
			if(rs.next()){
				//삭제 실행
				sql = "delete from student where num = ?";
				pstm=con.prepareStatement(sql);
				pstm.setInt(1, num);
				int result = pstm.executeUpdate();
				System.out.println(result);
				if(result>=1){
					System.out.println("해당 레코드 삭제 성공");
				}else{
					System.out.println("해당 레코드 삭제 실패");
				}
			}else{
				System.out.println("해당학생 없음");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}
	}

}
