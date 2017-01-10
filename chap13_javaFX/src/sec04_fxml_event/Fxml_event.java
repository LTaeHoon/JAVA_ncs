package sec04_fxml_event;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fxml_event extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout 파일 로드 - 파일 위치 : 현재 
		Parent root = FXMLLoader.load(getClass().getResource("fxUI.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("학생관리 프로그램");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
