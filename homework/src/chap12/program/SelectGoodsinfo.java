package chap12.program;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import chap12.jdbc.DriverTest;

public class SelectGoodsinfo {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = null;
		
		DriverTest dt = new DriverTest();
		con = dt.con();
		try{
			sql = "select * from Goodsinfo";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			Reader code;
			char []code1=new char[5];
			String code2="";
			String name,maker;
			int price;
			int size;
			System.out.println("코드\t상품명\t가격\t제조사");
			while(rs.next()){
				code = rs.getCharacterStream("code");
				size=code.read(code1);
				for(int i=0;i<size;i++){
					code2 +=code1[i];
					
				}
				
				name = rs.getString("name");
				price = rs.getInt("price");
				maker = rs.getString("maker");
				System.out.printf("%s"+"\t"+"%s"+"\t"+"%,3d"+"\t"+"%s\n",code2,name,price,maker);
				code2 ="";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();pstm.close();con.close();
		}
		
	}

}
