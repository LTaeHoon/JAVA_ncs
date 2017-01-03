package chap12.program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import chap12.jdbc.DriverTest;

public class DeleteGoodsinfo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = null;
		
		DriverTest dt = new DriverTest();
		con = dt.con();
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Goodsinfo테이블에 레코드 삭제");
			System.out.print("삭제할 코드 입력:");
			String code = sc.next();
			sql = "select * from Goodsinfo where code=?";
			pstm=con.prepareStatement(sql);
			pstm.setString(1, code);
			rs = pstm.executeQuery();
			if(rs.next()){
				sql = "delete from Goodsinfo where code = ?";
				pstm = con.prepareStatement(sql);
				pstm.setString(1, code);
				int result = pstm.executeUpdate();
				if(result >=1){
					System.out.println("레코드가 삭제되었습니다.");
				}else{
					System.out.println("레코드 삭제 안됨");
				}
			}else{
				System.out.println("삭제할 레코드가 없음");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}
	}

}
