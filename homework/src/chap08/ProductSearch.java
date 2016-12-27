package chap08;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductData pd = new ProductData();
		
		String product=JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		String result=pd.search(product);
		try{
			if(result.equals("null")){
				throw new Exception("해당 상품이 없습니다.");
			}
			JOptionPane.showMessageDialog(null,result);	
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e.getMessage());	
		}finally{
			System.out.println("프로그램 종료");
		}
			
		
	}

}
