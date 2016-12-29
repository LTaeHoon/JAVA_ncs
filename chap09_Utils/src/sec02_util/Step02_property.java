package sec02_util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Step02_property {
	private static final String FILE="C:\\NCS\\jdbc.properties";
	/*
	 * 2. Properties 클래스
	 *  - 시스템의 환경변수 처리(DB 속성, 웹 서버 속성)
	 *  
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream(FILE);
		p.load(new BufferedInputStream(fis));
		
		// 표준출력장치 결과
		p.list(System.out);
		/*
		 * -- listing properties --
		 *	url=jdbc:oracle:thin:@localhost:1521:ORCL
		 *	password=tiger
		 *	driver=oracle.jdbc.driver.OracleDriver
		 *	username=scott
		 */
		
		/*속성 단위 처리 */
		String driver = p.getProperty("driver");//value 반환
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
