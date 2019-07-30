package application;

import java.io.IOException;
import java.util.Stack;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowManager implements Constants {

	private static WindowManager instance;
	private Stage stage;
	private Stack<Scene> scenes;

	private Parent root;
	private Scene scene;

	public WindowManager() {
		scenes = new Stack<Scene>();
	}

	public static WindowManager getInstance() {
		if (instance == null)
			instance = new WindowManager();
		return instance;
	}

	public void setStage(Stage stage) {
		// begin-user-code
		this.stage = stage;
		// end-user-code
	}

	public void displayIntroWindow() throws IOException {

		root = FXMLLoader.load(getClass().getResource("IntroWindow.fxml"));
		scene = new Scene(root, INTRO_WINDOW_WIDTH, INTRO_WINDOW_HEIGHT);
		scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
		stage.setMinWidth(INTRO_WINDOW_WIDTH);
		stage.setMinHeight(INTRO_WINDOW_HEIGHT);
		stage.setMaxWidth(INTRO_WINDOW_WIDTH);
		stage.setMaxHeight(INTRO_WINDOW_HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Quiz");
		stage.show();

		scenes.clear();
		scenes.push(scene);
	}
	
	public void displayQuizWindow() throws IOException {

		root = FXMLLoader.load(getClass().getResource("QuizWindow.fxml"));
		scene = new Scene(root, QUIZ_WINDOW_WIDTH, QUIZ_WINDOW_HEIGHT);
		scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
		stage.setMinWidth(QUIZ_WINDOW_WIDTH);
		stage.setMinHeight(QUIZ_WINDOW_HEIGHT);
		stage.setMaxWidth(QUIZ_WINDOW_WIDTH);
		stage.setMaxHeight(QUIZ_WINDOW_HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Quiz");
		stage.show();

		scenes.clear();
		scenes.push(scene);
	}
	
	public void displayQuizWithImageWindow() throws IOException {

		root = FXMLLoader.load(getClass().getResource("QuizWithImageWindow.fxml"));
		scene = new Scene(root, QUIZ_WINDOW_WITH_IMAGE_WIDTH, QUIZ_WINDOW_WITH_IMAGE_HEIGHT);
		scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
		stage.setMinWidth(QUIZ_WINDOW_WITH_IMAGE_WIDTH);
		stage.setMinHeight(QUIZ_WINDOW_WITH_IMAGE_HEIGHT);
		stage.setMaxWidth(QUIZ_WINDOW_WITH_IMAGE_WIDTH);
		stage.setMaxHeight(QUIZ_WINDOW_WITH_IMAGE_HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Quiz");
		stage.show();

		scenes.clear();
		scenes.push(scene);
	}
	
	public void displayResultWindow() throws IOException {

		root = FXMLLoader.load(getClass().getResource("ResultWindow.fxml"));
		scene = new Scene(root, INTRO_WINDOW_WIDTH, INTRO_WINDOW_HEIGHT);
		scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
		stage.setMinWidth(INTRO_WINDOW_WIDTH);
		stage.setMinHeight(INTRO_WINDOW_HEIGHT);
		stage.setMaxWidth(INTRO_WINDOW_WIDTH);
		stage.setMaxHeight(INTRO_WINDOW_HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Quiz");
		stage.show();

		scenes.clear();
		scenes.push(scene);
	}

	public void displayPreviousWindow() throws IOException {
		scenes.pop();
		stage.setScene(scenes.peek());
		stage.show();
	}
}


