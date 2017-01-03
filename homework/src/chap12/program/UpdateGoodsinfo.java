package chap12.program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import chap12.jdbc.DriverTest;

public class UpdateGoodsinfo {

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
			System.out.println("Goodsinfo 테이블 수정하기");
			System.out.print("수정할 코드 입력:");
			String code = sc.next();
			sql = "select * from Goodsinfo where code = ?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, code);
			rs = pstm.executeQuery();
			if(rs.next()){
				System.out.print("수정할 상품명 입력:");
				String name = sc.next();
				System.out.print("수정할 가격 입력:");
				int price = sc.nextInt();
				System.out.print("수정할 제조사 입력:");
				String maker = sc.next();
				sql = "update Goodsinfo set name=?,price=?,maker=? where code=?";
				pstm=con.prepareStatement(sql);
				pstm.setString(1,name);
				pstm.setInt(2, price);
				pstm.setString(3,maker);
				pstm.setString(4,code);
				int result = pstm.executeUpdate();
				if (result>=1){
					System.out.println("레코드가 수정 되었습니다.");
				}else{
					System.out.println("데이터 수정 실패");
				}
				
			}else{
				System.out.println("해당 상품 없음");
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}
	}

}
