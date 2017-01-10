package sec06_fxml_mvc_jdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Layout 파일 로드 - 파일 위치 : 현재 
		Parent root = FXMLLoader.load(getClass().getResource("fxUI.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("TableView & ImageView");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) { 
		launch(args);
	}
}
