package Real_Estate;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
//import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;



public class Controller implements Initializable {
	
	@FXML	private	TableView<Housing> tableView;
	@FXML	private ImageView imageView;
	@FXML	private ComboBox gu;
	@FXML	private ComboBox dong;
	@FXML	private ComboBox type;
	@FXML	private ComboBox condition;
	@FXML	private ComboBox deposit;
	@FXML	private ComboBox price;
	@FXML	private	Button info;
	@FXML	private	Button insert;
	@FXML	private	Button delete;
	
	/* 오라클 연동을 위한 변수 */
	Connection con = null;// 1. 오라클 DB 연결 변수
	PreparedStatement pstmt = null;// 2. 쿼리문 실행 변수
	ResultSet rs = null; // 3. 쿼리 실행 결과 변수

	ObservableList<Housing> housinglist=null; // tableView 목록 저장
	
	List<Housing> list = null;
	
	ObservableList<String> gu_list = FXCollections.observableArrayList(
			"강남구", "강동구", "강북구", "강서구", "관악구");
	
	ObservableList<String> kangnam_list = FXCollections.observableArrayList(
			"개포동", "논현동", "대치동", "도곡동", "삼성동", "세곡동", "수서동",
			"신사동", "압구정동", "역삼동", "율현동", "일원동", "자곡동", "청담동");
	
	ObservableList<String> kangdong_list = FXCollections.observableArrayList(
			"강일동", "고덕동", "길동", "둔촌동", "명일동", "상일동", "성내동",
			"암사동", "천호동");
	
	ObservableList<String> kangbuk_list = FXCollections.observableArrayList(
			"미아동", "번동", "수유동", "우이동");
	
	ObservableList<String> kangseo_list = FXCollections.observableArrayList(
			"가양동", "개화동", "공항동", "과해동", "내발산동", "등촌동", "마곡동",
			"방화동", "염창동", "오곡동", "오쇠동", "외발산동", "화곡동");
	
	ObservableList<String> kwanak_list = FXCollections.observableArrayList(
			"남현동", "봉천동", "신림동");
	
	ObservableList<String> type_list = FXCollections.observableArrayList(
			"단독", "오피스텔", "빌라", "아파트", "다세대건물", "원룸");
	
	ObservableList<String> condition_list = FXCollections.observableArrayList(
			"월세", "전세", "매매");
	
	ObservableList<String> deposit_list = FXCollections.observableArrayList(
			"100만원 이하", "300만원 이하", "500만원 이하", "1000만원 이하", "3000만원 이하",
			"5000만원 이하", "10000만원 이하", "10000만원 이상");
	
	ObservableList<String> monthly_list = FXCollections.observableArrayList(
			"10만원 이하", "30만원 이하", "50만원 이하", "100만원 이하", "100만원 이상");
	
	ObservableList<String> rent_list = FXCollections.observableArrayList(
			"1000만원 이하", "3000만원 이하", "5000만원 이하", "10000만원 이하", "30000만원 이하",
			"30000만원 이상");
	
	ObservableList<String> buy_list = FXCollections.observableArrayList(
			"1000만원 이하", "3000만원 이하", "5000만원 이하", "10000만원 이하", "30000만원 이하",
			"50000만원 이하","50000만원 이상");
	
	ObservableList<String> empty_list = FXCollections.observableArrayList();
	
	public Connection dbcon() throws ClassNotFoundException, SQLException{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
		String uid = "scott"; // db 사용자
		String upwd = "tiger"; // db 사용자 비번
		
		Class.forName(driver);
		con = DriverManager.getConnection(url, uid, upwd);
		
		return con;
	}
	
	public void db_search(String sql){
		try {
			System.out.println("try 문안 ");
			con = dbcon();
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			int hscode,deposit,price,monfee;
			String gu,dong,bdtype,condition,image;			
			
			// (6) 레코드 출력 및 list 원소 추가
			list = new ArrayList<Housing>();
			while (rs.next()) {	// 레코드 수 만큼 반복 			
				hscode = rs.getInt("hscode");       // 매물코드
				gu = rs.getString("gu");    // 구
				dong = rs.getString("dong");  // 동
				bdtype = rs.getString("bdtype"); //매물타입
				condition = rs.getString("condition"); //매물조건
				deposit = rs.getInt("deposit"); //보증금 (전세, 월세인 경우)
				monfee = rs.getInt("monfee"); //월세
				price = rs.getInt("price"); //매매가격 (매매시 가격)
				image = rs.getString("image"); //이미지경로
				
				System.out.printf("%d\t %s\t %s\t %s\t %s\t %d\t %d\n", hscode, gu, dong,bdtype,condition,deposit,price);
				Housing h = new Housing(hscode, gu, dong,bdtype,condition,deposit,monfee,price,image);
				list.add(h); // list 추가(레코드)
			} 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("JDBC DRIVER 로딩 실패");
			e.printStackTrace();
		}finally{
			try {
				rs.close();	pstmt.close();con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		// 4. ObservableList에 list 원소 추가			
		housinglist = FXCollections.observableArrayList();
	    for (Housing hlist : list) {
	    	housinglist.add(hlist);
	    }
	    
	    // 5. ObservableList 원소를 TableView 목록으로 추가
	    
	    tableView.setItems(housinglist);
			    
	    tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Housing>() {
			@Override
			public void changed(ObservableValue<? extends Housing> observable, Housing oldValue, Housing newValue) {
				
				if (newValue != null) {
					// 상품 이미지 표현
					System.out.println("이미지 체인지 안");
					imageView.setImage(new Image(getClass().getResource("image/" + newValue.getImage()).toString()));
				}
			
				
			}
		}); // tableView end

		
	}
	


 
 

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String sql = null;
		// TODO Auto-generated method stub
		// 1. TableView의 컬럼에 housing 속성 지정(hscode, gu, dong,bdtype,condition,deposit,price)
		TableColumn thscode = tableView.getColumns().get(0);
		thscode.setCellValueFactory(new PropertyValueFactory("hscode"));
		thscode.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tgu = tableView.getColumns().get(1);
		tgu.setCellValueFactory(new PropertyValueFactory("gu"));
		tgu.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tdong = tableView.getColumns().get(2);
		tdong .setCellValueFactory(new PropertyValueFactory("dong"));
		tdong .setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tbdtype = tableView.getColumns().get(3);
		tbdtype.setCellValueFactory(new PropertyValueFactory("bdtype"));
		tbdtype.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tcondition = tableView.getColumns().get(4);
		tcondition.setCellValueFactory(new PropertyValueFactory("condition"));
		tcondition.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tdeposit = tableView.getColumns().get(5);
		tdeposit.setCellValueFactory(new PropertyValueFactory("deposit"));
		tdeposit.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tmonfee= tableView.getColumns().get(6);
		tmonfee.setCellValueFactory(new PropertyValueFactory("monfee"));
		tmonfee.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		TableColumn tprice= tableView.getColumns().get(7);
		tprice.setCellValueFactory(new PropertyValueFactory("price"));
		tprice.setStyle("-fx-alignment: CENTER;"); // css 적용
		
		// 구
		gu.setValue("구 선택");
		gu.setItems(gu_list);
		
		dong.setValue("동 선택");
		sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing order by hscode";
		db_search(sql);
		
		gu.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {	
			//콤보박스 구 선택시 이벤트 핸들러 안
			//DB를 불러와서
			//select를 하고
			//tableview에 표출
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				
				// 동
				if (gu.getValue().equals("강남구")){
					
						dong.setValue("동 선택");
						dong.setItems(kangnam_list);
							
					
					
				}else if (gu.getValue().equals("강동구")){
					dong.setValue("동 선택");
					dong.setItems(kangdong_list);
					
				}else if (gu.getValue().equals("강북구")){
					dong.setValue("동 선택");
					dong.setItems(kangbuk_list);
					
				}else if (gu.getValue().equals("강서구")){
					dong.setValue("동 선택");
					dong.setItems(kangseo_list);
					
				}else if (gu.getValue().equals("관악구")){
					dong.setValue("동 선택");
					dong.setItems(kwanak_list);
					
				}  
				String sql ="select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu= '"+gu.getValue()+"'";
				db_search(sql);

			}
			
			
		});
		
		dong.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
			
				
				String sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
						+" and "+"dong='"+dong.getValue()+"'";
				System.out.println(sql);
				db_search(sql);
				
				
			}
		});
		
		// 매물타입
		type.setValue("매물타입");
		type.setItems(type_list);
		
		// 거래조건
		condition.setValue("거래조건");
		condition.setItems(condition_list);
	
		
		type.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue){
				String sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where dong='"+dong.getValue()+"'"
						+" and "+"bdtype='"+type.getValue()+"'";
				System.out.println(sql);
				db_search(sql);
			}
		});
		
		condition.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				
				if (condition.getValue().equals("월세")){
					
					deposit.setValue("보증금");
					deposit.setItems(deposit_list);
					
					price.setValue("월세 가격");
					price.setItems(monthly_list);
					
					
				}else if (condition.getValue().equals("전세")){
					
					deposit.setValue("");
					deposit.setItems(empty_list);

					price.setValue("전세 가격");
					price.setItems(rent_list);
					
					
				}else if (condition.getValue().equals("매매")){
					
					deposit.setValue("");
					deposit.setItems(empty_list);

					price.setValue("매매 가격");
					price.setItems(buy_list);
					
					
				}
				String sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
						+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'";
				System.out.println(sql);
				db_search(sql);

			}
		});
		
		deposit.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				
				String str=deposit.getValue().toString();
				String strlast = str.substring(str.indexOf('이'),str.indexOf('이')+2);
				String result = str.substring(0,str.indexOf('만'))+"0000";
				String sql = null;
				if(strlast.equals("이하")){
					sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
							+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
							+" and "+"deposit <="+result;
					System.out.println(sql);
					db_search(sql);
				}else if(strlast.equals("이상")){
					sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
							+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
							+" and "+"deposit >="+result;
					System.out.println(sql);
					db_search(sql);
				}
				
				
			}
		});
		price.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				String dstr,dresult,pstr,presult,sql=null;
				String dstrlast,pstrlast;
				
				dstr=deposit.getValue().toString();
				dstrlast = dstr.substring(dstr.indexOf('이'),dstr.indexOf('이')+2);
				dresult = dstr.substring(0,dstr.indexOf('만'))+"0000";
				pstr=price.getValue().toString();
				pstrlast = pstr.substring(pstr.indexOf('이'),pstr.indexOf('이')+2);
				presult = pstr.substring(0,pstr.indexOf('만'))+"0000";
				
				if(condition.getValue().equals("월세")){
					
					if(dstrlast.equals("이하")&&pstrlast.equals("이하")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit <="+dresult
								+" and "+"monfee <="+presult;
						
						System.out.println(sql);
						//db_search(sql);
					}else if(dstrlast.equals("이하")&&pstrlast.equals("이상")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit <="+dresult
								+" and "+"monfee >="+presult;
						
					}else if(dstrlast.equals("이상")&&pstrlast.equals("이하")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit >="+dresult
								+" and "+"monfee <="+presult;
					}else if(dstrlast.equals("이상")&&pstrlast.equals("이상")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit >="+dresult
								+" and "+"monfee >="+presult;
					}
					
				}else if(condition.getValue().equals("전세")){
					if(pstrlast.equals("이하")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit <="+presult;
						
					
					}else if(pstrlast.equals("이상")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"deposit >="+presult;
					}
					//db_search(sql);
				}else if(condition.getValue().equals("매매")){
					if(pstrlast.equals("이하")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"price <="+presult;
						
						System.out.println(sql);
					//db_search(sql);
					}else if(pstrlast.equals("이상")){
						sql = "select hscode, gu, dong, bdtype, condition,deposit,monfee,price,image from housing where gu='"+gu.getValue()+"'"
								+" and "+"dong='"+dong.getValue()+"'"+" and "+"bdtype='"+type.getValue()+"'"+" and "+"condition='"+condition.getValue()+"'"
								+" and "+"price >="+presult;
							
					}
				}
				db_search(sql);
				
				
			}
		});
		 tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Housing>() {
				@Override
				public void changed(ObservableValue<? extends Housing> observable, Housing oldValue, Housing newValue) {
					
					delete.setOnAction(new EventHandler<ActionEvent>() {
						public void handle(ActionEvent event) {
							
							Housing housing = newValue;
							int hcode = housing.getHscode();
							
							list.remove(housing);
							
							try {
								con = dbcon();
								String sql = "delete from housing where hscode=?";
							pstmt=con.prepareStatement(sql);
							pstmt.setInt(1, hcode);
							int result = pstmt.executeUpdate();
							if(result>=1){
								JOptionPane.showMessageDialog(null, "삭제 성공");
							}else{
								JOptionPane.showMessageDialog(null, "삭제 실패");
							}
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						String sql = "select * from housing order by hscode";
						db_search(sql);
						tableView.setItems(housinglist);
					}
				});
			}
		}); 
	




	}

}
