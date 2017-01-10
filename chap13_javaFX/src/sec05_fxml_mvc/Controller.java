package sec05_fxml_mvc;

import java.net.URL;
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
	@FXML private TableView<Goods> tableView; // Bean을 제네릭으로 지정 	
	@FXML private ImageView imageView; // imageView
	@FXML private Button previous;
	@FXML private Button next;
	@FXML private Button close;
	ObservableList<Goods> goodslist=null;
	
	@Override
	public void initialize(URL local, ResourceBundle resource) {
		
		// 1. TableView의 컬럼 속성 지정(name, image)		
		TableColumn tcgName = tableView.getColumns().get(0);
		tcgName.setCellValueFactory(new PropertyValueFactory("name"));  
		tcgName.setStyle("-fx-alignment: CENTER;"); // css 적용
				
		TableColumn tcgImage = tableView.getColumns().get(1);
		tcgImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcgImage.setStyle("-fx-alignment: CENTER;"); // css 적용	
		
		// 2. TableView 추가할 상품목록 객체 생성
		goodslist = FXCollections.observableArrayList(
				new Goods("사과", "apple.jpg"),
				new Goods("바나나", "banana.jpg"),
				new Goods("체리", "cherry.jpg"),
				new Goods("포도", "grape.jpg"),
				new Goods("배", "pear.jpg"),
				new Goods("감", "persimmon.jpg")
		);
		
		// 3. TableView 상품목록 객체 추가
		tableView.setItems(goodslist); // ObservableList 객체
		
		// 4. 목록 선택 시 이벤트 처리 - ImageView에 상품이미지 표시 및 선택 목록 콘솔 출력
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Goods>() {
			@Override
			public void changed(ObservableValue<? extends Goods> observable, Goods oldValue, Goods newValue) {
				if(newValue!=null) {
					// 상품 이미지 표현 - images/apple.jpg
					imageView.setImage(new Image(getClass().getResource("images/"
					     + newValue.getImage()).toString()));
				}
				// 선택 목록 콘솔 출력 
				Goods goods = tableView.getSelectionModel().getSelectedItem(); // 선택된 모델의 아이템 반환  
				System.out.print("상품명: " + goods.getName()+", ");
				System.out.println("상품 이미지: " + goods.getImage());
			}			
		}); // tableView end	
		
		// 5. 닫기 버튼 -> 현재 창 닫기 
		close.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Platform.exit();				
			}
			
		});   	
		
		// 6. 다음 버튼
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int i = tableView.getSelectionModel().getSelectedIndex();
				int end = goodslist.size(); // 상품 목록 전체 행 수
				
				if(i==-1){ // 상품이 선택되지 않은 경우 첫번째 상품 선택 
					JOptionPane.showMessageDialog(null, "상품 목록을 선택하세요!");
					i++;
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
					return;	
				}else{
					i++;
					if(i >= end){
						JOptionPane.showMessageDialog(null, "마지막 상품입니다.");
						return;
					}
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
				}
			}
		});
		
		// 7. 이전 버튼
		previous.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int i = tableView.getSelectionModel().getSelectedIndex();
				
				if(i==-1){ // 상품이 선택되지 않은 경우 첫번째 상품 선택 
					JOptionPane.showMessageDialog(null, "상품 목록을 선택하세요!");
					i++;
					tableView.getSelectionModel().select(i);
					tableView.scrollTo(i);
					return;	
				}else{					
					if(i <= 0){
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
