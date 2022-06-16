package ch.iso.m120.view;

import ch.iso.m120.model.Globals;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane login = new MyLoginPane();

			BorderPane root = new BorderPane();
			root.setCenter(login);

			Globals.setRoot(root);

			Scene scene = new Scene(root, 850, 600);

			scene.getStylesheets().add(getClass().getResource("css/login.css").toExternalForm());

			primaryStage.setTitle("Login");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}