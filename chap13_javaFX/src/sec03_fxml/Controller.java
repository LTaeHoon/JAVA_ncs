package sec03_fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	
	@FXML private Button ok;
	@FXML private TextField input;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// [확인] 버튼 클릭 시 호출되는 메서드
		ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("버튼을 클릭했군요");
				String result = input.getText();
				System.out.printf("당신의 이름은 %s입니다",result);
				input.setText(""); // 내용 초기화
			}
		});
	}

}
