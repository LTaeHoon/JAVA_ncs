package chap12.program;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import chap12.jdbc.DriverTest;

public class InsertGoodsinfo {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstm = null;
		String sql = null;
		
		DriverTest dt = new DriverTest();
		con = dt.con();
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("***상품정보 입력***");
			System.out.print("상품명 입력:");
			String name = sc.next();
			System.out.println("가격 입력:");
			int price = sc.nextInt();
			System.out.println("제조사 입력:");
			String maker = sc.next();
			sql = "insert into Goodsinfo values(cd_seq.nextval,?,?,?)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setInt(2,price);
			pstm.setString(3, maker);
			int result = pstm.executeUpdate();
			if (result>=1){
				System.out.println("데이터 입력 성공");
			}else{
				System.out.println("데이터 입력 실패");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			pstm.close();con.close();
		}
	}

}
