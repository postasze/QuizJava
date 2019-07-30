package application;

import javafx.scene.image.Image;

public class QuizQuestion {

	private String question;
	private String firstAnswer;
	private String secondAnswer;
	private String thirdAnswer;
	private String fourthAnswer;
	private int correctAnswerNumber;
	private Image image;

	public QuizQuestion(String question, String firstAnswer, String secondAnswer, String thirdAnswer,
			String fourthAnswer, int correctAnswerNumber, Image image) {
		super();
		this.question = question;
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.fourthAnswer = fourthAnswer;
		this.correctAnswerNumber = correctAnswerNumber;
		this.image = image;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(String firstAnswer) {
		this.firstAnswer = firstAnswer;
	}

	public String getSecondAnswer() {
		return secondAnswer;
	}

	public void setSecondAnswer(String secondAnswer) {
		this.secondAnswer = secondAnswer;
	}

	public String getThirdAnswer() {
		return thirdAnswer;
	}

	public void setThirdAnswer(String thirdAnswer) {
		this.thirdAnswer = thirdAnswer;
	}

	public String getFourthAnswer() {
		return fourthAnswer;
	}

	public void setFourthAnswer(String fourthAnswer) {
		this.fourthAnswer = fourthAnswer;
	}

	public int getCorrectAnswerNumber() {
		return correctAnswerNumber;
	}

	public void setCorrectAnswerNumber(int correctAnswerNumber) {
		this.correctAnswerNumber = correctAnswerNumber;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
