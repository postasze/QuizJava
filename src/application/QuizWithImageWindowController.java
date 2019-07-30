package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class QuizWithImageWindowController implements Initializable {
	@FXML
    private Label questionLabel;
	@FXML
    private Label firstAnswerLabel; 
	@FXML
    private Label secondAnswerLabel;
	@FXML
    private Label thirdAnswerLabel;
	@FXML
    private Label fourthAnswerLabel; 
	@FXML
    private Button checkAnswerButton; 
	@FXML
    private Button continueQuizButton;
	@FXML
	private ImageView questionImageView;
	
	private boolean answerChecked;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		QuizQuestion quizQuestion = Model.getInstance().getCurrentQuizQuestion();
		questionLabel.setText(quizQuestion.getQuestion());
		firstAnswerLabel.setText(quizQuestion.getFirstAnswer());
		secondAnswerLabel.setText(quizQuestion.getSecondAnswer());
		thirdAnswerLabel.setText(quizQuestion.getThirdAnswer());
		fourthAnswerLabel.setText(quizQuestion.getFourthAnswer());
		questionImageView.setImage(quizQuestion.getImage());
		checkAnswerButton.setDisable(true);
		continueQuizButton.setDisable(true);
		answerChecked = false;
		if(questionLabel.getText().length() > 200)
			questionLabel.setStyle("-fx-font-size: 14px");
	}
	
	@FXML
	public void selectAnswer(MouseEvent event) {
		if(answerChecked == true)
			return;
		
		switch(Model.getInstance().getCurrentlyCheckedAnswerNumber())
		{
		case 1:
			firstAnswerLabel.getStylesheets().clear();
			firstAnswerLabel.getStylesheets().add(getClass().getResource("Label.css").toExternalForm());
			break;
		case 2:
			secondAnswerLabel.getStylesheets().clear();
			secondAnswerLabel.getStylesheets().add(getClass().getResource("Label.css").toExternalForm());
			break;
		case 3:
			thirdAnswerLabel.getStylesheets().clear();
			thirdAnswerLabel.getStylesheets().add(getClass().getResource("Label.css").toExternalForm());
			break;
		case 4:
			fourthAnswerLabel.getStylesheets().clear();
			fourthAnswerLabel.getStylesheets().add(getClass().getResource("Label.css").toExternalForm());
			break;
		default:
			break;
		}
		
		switch(((Label) event.getSource()).getId())
		{
		case "firstAnswerLabel":
			Model.getInstance().setCurrentlyCheckedAnswerNumber(1);
			firstAnswerLabel.getStylesheets().clear();
			firstAnswerLabel.getStylesheets().add(getClass().getResource("SelectedAnswerLabel.css").toExternalForm());
			break;
		case "secondAnswerLabel":
			Model.getInstance().setCurrentlyCheckedAnswerNumber(2);
			secondAnswerLabel.getStylesheets().clear();
			secondAnswerLabel.getStylesheets().add(getClass().getResource("SelectedAnswerLabel.css").toExternalForm());
			break;
		case "thirdAnswerLabel":
			Model.getInstance().setCurrentlyCheckedAnswerNumber(3);
			thirdAnswerLabel.getStylesheets().clear();
			thirdAnswerLabel.getStylesheets().add(getClass().getResource("SelectedAnswerLabel.css").toExternalForm());
			break;
		case "fourthAnswerLabel":
			Model.getInstance().setCurrentlyCheckedAnswerNumber(4);
			fourthAnswerLabel.getStylesheets().clear();
			fourthAnswerLabel.getStylesheets().add(getClass().getResource("SelectedAnswerLabel.css").toExternalForm());
			break;
		}
		
		checkAnswerButton.setDisable(false);
	}
	
	@FXML
	public void checkAnswer(ActionEvent event) {
		if(answerChecked == true)
			return;
		
		if(Model.getInstance().getCurrentlyCheckedAnswerNumber() == 
		    Model.getInstance().getCurrentQuizQuestion().getCorrectAnswerNumber()) {
			checkAnswerButton.setText("Prawidłowa odpowiedź!");
			Model.getInstance().raiseScoreByOne();

			switch(Model.getInstance().getCurrentlyCheckedAnswerNumber())
			{
			case 1:
				firstAnswerLabel.getStylesheets().clear();
				firstAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 2:
				secondAnswerLabel.getStylesheets().clear();
				secondAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 3:
				thirdAnswerLabel.getStylesheets().clear();
				thirdAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 4:
				fourthAnswerLabel.getStylesheets().clear();
				fourthAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			default:
				break;
			}
		}
		else {
			checkAnswerButton.setText("Nieprawidłowa odpowiedź");

			switch(Model.getInstance().getCurrentlyCheckedAnswerNumber())
			{
			case 1:
				firstAnswerLabel.getStylesheets().clear();
				firstAnswerLabel.getStylesheets().add(getClass().getResource("WrongAnswerLabel.css").toExternalForm());
				break;
			case 2:
				secondAnswerLabel.getStylesheets().clear();
				secondAnswerLabel.getStylesheets().add(getClass().getResource("WrongAnswerLabel.css").toExternalForm());
				break;
			case 3:
				thirdAnswerLabel.getStylesheets().clear();
				thirdAnswerLabel.getStylesheets().add(getClass().getResource("WrongAnswerLabel.css").toExternalForm());
				break;
			case 4:
				fourthAnswerLabel.getStylesheets().clear();
				fourthAnswerLabel.getStylesheets().add(getClass().getResource("WrongAnswerLabel.css").toExternalForm());
				break;
			default:
				break;
			}
			
			switch(Model.getInstance().getCurrentQuizQuestion().getCorrectAnswerNumber())
			{
			case 1:
				firstAnswerLabel.getStylesheets().clear();
				firstAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 2:
				secondAnswerLabel.getStylesheets().clear();
				secondAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 3:
				thirdAnswerLabel.getStylesheets().clear();
				thirdAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			case 4:
				fourthAnswerLabel.getStylesheets().clear();
				fourthAnswerLabel.getStylesheets().add(getClass().getResource("CorrectAnswerLabel.css").toExternalForm());
				break;
			default:
				break;
			}
		}	
		continueQuizButton.setDisable(false);
		answerChecked = true;
	}
	
	@FXML
	public void continueQuiz(ActionEvent event) {
		Controller.getInstance().continueQuiz();
	}
}
