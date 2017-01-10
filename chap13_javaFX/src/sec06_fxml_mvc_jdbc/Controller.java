package sec06_fxml_mvc_jdbc;

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

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
	// fxUI의 객체 주입
	@FXML	private TableView<Goods> tableView;
	@FXML	private ImageView imageView; // imageView
	@FXML	private Button previous;
	@FXML	private Button next;
	@FXML   private Button close;
	
	ObservableList<Goods> goodslist=null; // tableView 목록 저장
	
	/* tableView 목록을 저장하는 변수(전역변수 선언) */ 	
	List<Goods> list = null; // table 레코드 저장
	
	/* 오라클 연동을 위한 변수 */
	Connection con = null;// 1. 오라클 DB 연결 변수
	PreparedStatement pstmt = null;// 2. 쿼리문 실행 변수
	ResultSet rs = null; // 3. 쿼리 실행 결과 변수

	@Override
	public void initialize(URL local, ResourceBundle resource) {
				
		// 1. TableView의 컬럼에 Model 속성 지정(code, name, image)
		TableColumn tcgCode = tableView.getColumns().get(0);
		tcgCode.setCellValueFactory(new PropertyValueFactory("code"));
		tcgCode.setStyle("-fx-alignment: CENTER;"); // css 적용

		TableColumn tcgName = tableView.getColumns().get(1);
		tcgName.setCellValueFactory(new PropertyValueFactory("name"));
		tcgName.setStyle("-fx-alignment: CENTER;"); // css 적용

		TableColumn tcgImage = tableView.getColumns().get(2);
		tcgImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcgImage.setStyle("-fx-alignment: CENTER;"); // css 적용

		// 2. 오라클 변수 초기화
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
		String uid = "scott"; // db 사용자
		String upwd = "tiger"; // db 사용자 비번
		
		// 3. DB 테이블 연동
		try {
			// (1) 드라이버 로딩
			Class.forName(driver);
			// (2) 데이터베이스 연결
			con = DriverManager.getConnection(url, uid, upwd);
			// (3) 쿼리문 작성
			String sql = "select * from Goods order by code desc";
			// (4) 쿼리문 실행
			pstmt = con.prepareStatement(sql); // 쿼리문 실행
			// (5) select문 실행 -> 검색 결과 저장(rs)
			rs = pstmt.executeQuery(); // select문 실행
			
			int code;
			String name, image;			
			System.out.println("코드\t상품명\t이미지");
			
			// (6) 레코드 출력 및 list 원소 추가
			list = new ArrayList<Goods>();
			while (rs.next()) {	// 레코드 수 만큼 반복 			
				code = rs.getInt("code");       // 코드
				name = rs.getString("name");    // 상품명
				image = rs.getString("image");  // 이미지
				System.out.printf("%d\t %s\t %s \n", code, name, image);
				Goods g = new Goods(code, name, image);
				list.add(g); // list 추가(레코드)
			} 
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("JDBC DRIVER 로딩 실패");
			e.printStackTrace();
		} finally {			
			try {
				rs.close();	pstmt.close();	con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}

		// 4. ObservableList에 list 원소 추가			
		 goodslist = FXCollections.observableArrayList();
	    for (Goods glist : list) {
	    	 goodslist.add(glist);
	    }
	    
	    // 5. ObservableList 원소를 TableView 목록으로 추가
		tableView.setItems(goodslist); // 인수 : ObservableList 참조변수

		// 6. 목록 선택 시 이벤트 처리 - ImageView에 상품이미지 표시 및 선택 목록 콘솔 출력
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Goods>() {
			@Override
			public void changed(ObservableValue<? extends Goods> observable, Goods oldValue, Goods newValue) {
				if (newValue != null) {
					// 상품 이미지 표현
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));
				}
				Goods goods = tableView.getSelectionModel().getSelectedItem();
				System.out.print("상품코드: " + goods.getCode()+", ");
				System.out.print("상품명: " + goods.getName() + ", ");
				System.out.println("상품 이미지: " + goods.getImage());
			}
		}); // tableView end

		// 7. 닫기 버튼 -> 현재 창 닫기
		close.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
					Platform.exit();
			}			
		});
		
		// 8. 다음 버튼
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int i = tableView.getSelectionModel().getSelectedIndex();
				int end = goodslist.size(); // 상품 목록 전체 행 수

				if (i == -1) { // 상품이 선택되지 않은 경우 첫번째 상품 선택
					JOptionPane.showMessageDialog(null, "상품 목록을 선택하세요!");
					i++;
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
					return;
				} else {
					i++;
					if (i >= end) {
						JOptionPane.showMessageDialog(null, "마지막 상품입니다.");
						return;
					}
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
				}
			}
		});

		// 9. 이전 버튼
		previous.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int i = tableView.getSelectionModel().getSelectedIndex();

				if (i == -1) { // 상품이 선택되지 않은 경우 첫번째 상품 선택
					JOptionPane.showMessageDialog(null, "상품 목록을 선택하세요!");
					i++;
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
					return;
				} else {
					if (i <= 0) {
						JOptionPane.showMessageDialog(null, "첫번째 상품입니다.");
						return;
					}
					i--;
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
				}
			}
		}); // previous end

	} // method end


} // class end
