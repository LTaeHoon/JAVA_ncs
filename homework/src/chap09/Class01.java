package chap09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Class01 {
	static Pattern email_regEx = Pattern.compile("^[a-zA-Z]([a-zA-Z]|[0-9]){1,}@[a-zA-z]{1,}.\\w{1,}"); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email=JOptionPane.showInputDialog("이메일을 입력하세요.");
		
		Matcher m = email_regEx.matcher(email);
		if(m.find()){ //m.find가 true이면 if문 안에 실행문 수행
			JOptionPane.showMessageDialog(null, "이메일 형식이 맞습니다.");
		}else{
			JOptionPane.showMessageDialog(null,"이메일 형식이 틀립니다.");
		}
		
	}

}
