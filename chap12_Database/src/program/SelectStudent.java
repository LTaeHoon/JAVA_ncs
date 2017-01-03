package program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.DriverTest;

public class SelectStudent {
	/*
	 * student 테이블의 전체 내용 조회
	 */
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
			// 1. 쿼리문 작성
			sql = "select * from student order by num desc"; // 학번 내림차순
			// 2. 쿼리문 실핼
			pstm = con.prepareStatement(sql);
			// 3. select문 실행
			rs = pstm.executeQuery(); //전체 레코드 조회
			
			int num,score;  //학번, 점수
			String name,phone,email,regdate; //이름, 폰번호, 이메일, 등록날짜
			while(rs.next()){ //true,false : 레코드 수 만큼 반복
				// num,name,score,phone,email,regdate
				num = rs.getInt("num");
				name = rs.getString("name");
				score = rs.getInt("score");
				phone = rs.getString("phone");
				email = rs.getString("email");
				regdate = rs.getString("regdate");
				System.out.printf("%d %s %d %s %s %s\n",num,name,score,phone,email,regdate);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}
		
		
	}

}
