package ch.iso.m120.view;


import ch.iso.m120.model.User;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class MyRegisterDialog<T> extends Dialog<User> {

	public MyRegisterDialog() {
		super();

		this.setTitle("Register");
		createDialog();
	}

	private void createDialog() {

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Register");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 4, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1, 5, 1);

		Label firstName = new Label("First Name:");
		grid.add(firstName, 0, 2);

		TextField firstTextField = new TextField();
		grid.add(firstTextField, 1, 2, 5, 1);

		Label lastName = new Label("Last Name:");
		grid.add(lastName, 0, 3);

		TextField lastTextField = new TextField();
		grid.add(lastTextField, 1, 3, 5, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 4);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 4, 5, 1);

		Label pwc = new Label("Password Confirm:");
		grid.add(pwc, 0, 5);

		PasswordField pwcBox = new PasswordField();
		grid.add(pwcBox, 1, 5, 5, 1);
		
		
		this.getDialogPane().setContent(grid);
		
		ButtonType buttonTypeOK = new ButtonType("OK", ButtonData.OK_DONE);
		this.getDialogPane().getButtonTypes().add(buttonTypeOK);

		ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
		this.getDialogPane().getButtonTypes().add(buttonTypeCancel);

		this.setResultConverter(new Callback<ButtonType, User>() {

			@Override
			public User call(ButtonType register) {
				if (register == buttonTypeOK) {
					return new User(0, firstTextField.getText(), lastTextField.getText(), userTextField.getText(), pwBox.getText()); 
				}
				return null;
			}
		});

	}

}
