package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ResultWindowController implements Initializable, Constants {

	@FXML
	private Label resultLabel;
	@FXML
	private Button goBackButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		resultLabel.setText("Twój wynik to: " + Model.getInstance().getScore() + "/" + NUMBER_OF_QUESTIONS);
	}

	@FXML
	private void goBack(Event event) {
		try {
			WindowManager.getInstance().displayIntroWindow();
		} catch (IOException e) {
		}
	}
}
