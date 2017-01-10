package sec01_basic;

import javafx.application.Application;
import javafx.stage.Stage;

public class FxStart02 extends Application{
	
	public FxStart02(){
		System.out.println("1.생성자");
	}
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("2.init 메서드");
		super.init();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("3.start 메서드");
		primaryStage.setTitle("무대 제목");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("4.stop 메서드");
		super.stop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
