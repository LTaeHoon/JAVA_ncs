package sec04_fxml_event;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller implements Initializable {	
	@FXML private Button submit;
	@FXML private Button reset;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		
		// 무명클래스 표현
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("전송버튼 클릭!!"); // 콘솔 메시지 출력
								
				/* 2차 작성 : dialog 창을 보여줄 Stage 객체 */				
				Stage stage = new Stage(StageStyle.UTILITY);
				
				/* 컨트롤러에서 레이아웃 파일(dialog.fxml) 사용 : Parent 객체 가져오기 */
				Parent parent=null;
				try { // 예외 처리(파일 입출력)
					parent = FXMLLoader.load(getClass().getResource("dialog.fxml"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				/* 알림창 레이아웃으로 Scene 객체 생성 */
				Scene scene = new Scene(parent);
				
				/* Stage에 Scene 올리기 */ 
				stage.setScene(scene);
				stage.setTitle("알림창");
				stage.setResizable(false);
				stage.show();
				
				/* 2차 - 알림창에서 [닫기] 버튼 클릭 시 알림창 닫기 */				
				// dialog.fxml 파일의 버튼 객체 가져오기 
				Button btnOk = (Button)parent.lookup("#btnOk"); // #버튼id								 
								
				// 닫기 버튼 클릭 시 알림창 닫기 - 무명클래스
				btnOk.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						stage.close(); // 알림창 닫기						
					}					
				});	
				 
			} // method end 
		}); // 무명class end	
		
		// 취소 버튼 
		reset.setOnAction(event-> Platform.exit() );  // 현재 창 닫기
		
		
	} // method end
	
}
