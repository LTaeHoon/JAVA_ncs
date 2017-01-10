package sec02_stage_scene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Step01_stage extends Application {

	
	@Override
	public void start(Stage stage) throws Exception {
		// 1. 컨테이너 생성: 프레임, 패널(컴포넌트를 담는 그릇)
		VBox vbox = new VBox(); // 행 단위 배치 컨테이너
		vbox.setPrefWidth(350); // 폭 지정
		vbox.setPrefHeight(150); // 높이 지정
		vbox.setAlignment(Pos.CENTER); //정렬 방식
		vbox.setSpacing(20); //행 간격
		
		// 2. 컴포넌트 생성 : 레이블, 버튼, 텍스트상자, 레디오버튼 ..
		Label label = new Label();
		label.setText("레이블 상자");  // 내용
		label.setFont(new Font(40)); // 글자 크기
		Button btn = new Button("버튼"); //버튼 객체 생성
		
		// 3. 컨테이너에 컴포넌트 탑재
		vbox.getChildren().add(label); // 1. 레이블 추가(1행)
		vbox.getChildren().add(btn);  // 2.버튼 추가 (2행)
		
		// 4. 장면 객체 생성
		Scene scene = new Scene(vbox); // 장면에 컨테이너를 추가
		
		// 5. 장면을 무대에 올리기
		stage.setTitle("장면과 무대 연습중");
		stage.setScene(scene);
		stage.show(); //화면에 보이기
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
