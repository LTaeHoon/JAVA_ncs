package sec03_fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. UI 작성(레이아웃)
		Parent root =FXMLLoader.load(getClass().getResource("fxmlUI.fxml"));
		// 2. 장면 객체 생성
		Scene scene = new Scene(root);
		
		// 3. 장면을 무대에 올리기
		primaryStage.setTitle("fxml 실습");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
