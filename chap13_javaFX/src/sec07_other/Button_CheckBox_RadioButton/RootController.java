package sec07_other.Button_CheckBox_RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	// 객체 주입 
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;	
	@FXML private Button btnExit;

	/*
	 * initialize() 메서드
	 *  - Initializable 인터페이스의 추상 메서드
	 *  - 컨트롤러 객체가 생성된 후 자동으로 호출되는 메서드
	 *  - 내용 : 속성 감시(토글 속성 감시), 이벤트 핸들러 등록, 이벤트 처리
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// toggleGroup으로 지정된 id를 이용하여 토글 속성 감시
		// 토글 속성이 변경되면 이벤트 핸들러에 의해서 이벤트 발생(이미지 변경) 
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/" + newValue.getUserData().toString() + ".png").toString());
				radioImageView.setImage(image);
			}
		});
	}
	// 체크 박스와 라디오 버튼 클릭 시 호출
	public void handleChkAction(ActionEvent e) {
		if(chk1.isSelected() && chk2.isSelected()) { // 모든 체크 
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if(chk1.isSelected()) { // 안경 체크
			checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else if(chk2.isSelected()) { // 모자 체크
			checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		} else { // 체크 없음
			checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}	
	// id : btnExit 버튼 클릭 시 호출
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}
}
