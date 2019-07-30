package application;

import java.io.IOException;
import java.util.Random;

public class Controller implements Constants {

	private static Controller instance;

	public static Controller getInstance() {
		if (instance == null)
			instance = new Controller();
		return instance;
	}

	public void startQuiz() {
		Model.getInstance().resetModel();
		Model.getInstance().setCurrentQuizQuestion(getNextRandomQuizQuestion());
		Model.getInstance().setCurrentlyCheckedAnswerNumber(0);
		Model.getInstance().raiseCountByOne();

		try {
			if (Model.getInstance().getCurrentQuizQuestion().getImage() == null)
				WindowManager.getInstance().displayQuizWindow();
			else
				WindowManager.getInstance().displayQuizWithImageWindow();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void continueQuiz() {
		if(Model.getInstance().getCount() == NUMBER_OF_QUESTIONS)
		{
			endQuiz();
			return;
		}
			
		Model.getInstance().setCurrentQuizQuestion(getNextRandomQuizQuestion());
		Model.getInstance().setCurrentlyCheckedAnswerNumber(0);
		Model.getInstance().raiseCountByOne();

		try {
			if (Model.getInstance().getCurrentQuizQuestion().getImage() == null)
				WindowManager.getInstance().displayQuizWindow();
			else
				WindowManager.getInstance().displayQuizWithImageWindow();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public QuizQuestion getNextRandomQuizQuestion() {
		Random random = new Random();

		int chosenQuestionIndex = random.nextInt(Model.getInstance().getAvailableQuestionsList().size());
		QuizQuestion chosenQuestion = Model.getInstance().getAvailableQuestionsList().get(chosenQuestionIndex);
		Model.getInstance().getAvailableQuestionsList().remove(chosenQuestionIndex);

		return chosenQuestion;
	}
	
	public boolean checkQuizQuestionAnswer() {
		return Model.getInstance().getCurrentlyCheckedAnswerNumber() == 
			Model.getInstance().getCurrentQuizQuestion().getCorrectAnswerNumber();
	}
	
	public void endQuiz() {
		try {
			WindowManager.getInstance().displayResultWindow();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
