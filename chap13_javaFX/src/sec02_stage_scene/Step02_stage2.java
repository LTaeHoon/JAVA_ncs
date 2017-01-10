package sec02_stage_scene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Step02_stage2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. 컨테이너 생성(열단위 방향 배치) 
		HBox hbox = new HBox();						//HBox 컨테이너 생성	
		hbox.setPrefWidth(350);						//2차 - HBox의 폭 설정
		hbox.setAlignment(Pos.CENTER);              //2차 - HBox의 정렬방식
		hbox.setPadding(new Insets(10,10,10,10));   //안쪽 여백 설정(top기준 시계방향)
		hbox.setSpacing(10);  						//컨트롤간의 수평 간격 설정
		
		// 2. 컴포넌트 생성 
		TextField textField = new TextField(); 		//TextField 컨트롤 생성
		textField.setPrefWidth(200);				//TextField의 폭 설정
		
		Button button = new Button();				//Button 컨트롤 생성
		button.setText("확인");						//Button 글자 설정
		
		// 3. 컨테이너에 컴포넌트 추가		
		hbox.getChildren().add(textField);			//TextField 컨트롤 배치
		hbox.getChildren().add(button);             //Button의 컨트롤 배치
						
		// 4. 장면 객체 생성 
		Scene scene = new Scene(hbox);				// 컨테이너로 장면 생성
		
		// 5. 무대 올리기
		primaryStage.setTitle("무대와 장면-열 배치");		//윈도우 창 제목 설정
		primaryStage.setScene(scene);				//윈도우 창에 화면 설정
		primaryStage.show();						//윈도우 창 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
