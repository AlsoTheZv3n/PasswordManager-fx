package ch.iso.m120.view;

import ch.iso.m120.controller.CancelLoginEventHandler;
import ch.iso.m120.controller.LoginEventHandler;
import ch.iso.m120.controller.RegisterEventHandler;
import ch.iso.m120.model.Globals;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MyLoginPane extends BorderPane {

	public MyLoginPane() {
		super();

		GridPane grid = new GridPane();
		
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 4, 1);

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		Globals.setUserTextField(userTextField);
		grid.add(userTextField, 1, 1, 3, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		Globals.setPwBox(pwBox);
		grid.add(pwBox, 1, 2, 3, 1);

		// Login button mit weiterverweisung zu overview
		Button btnLogin = new Button("Login");
		HBox hbBtnLogin = new HBox(10);
		hbBtnLogin.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnLogin.getChildren().add(btnLogin);
		grid.add(hbBtnLogin, 1, 4);
		btnLogin.setOnAction(new LoginEventHandler());

		// Register Button mit weiterleitung zu register Dialog
		Button btnRegister = new Button("Register");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		grid.add(hbBtnRegister, 2, 4);
		btnRegister.setOnAction(new RegisterEventHandler());

		// Cancel Button
		Button btnCancel = new Button("Cancel");
		HBox hbBtnCancel = new HBox(10);
		hbBtnCancel.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnCancel.getChildren().add(btnCancel);
		grid.add(hbBtnCancel, 3, 4);
		btnCancel.setOnAction(new CancelLoginEventHandler());

		this.setCenter(grid);

		this.setRight(new Label(""));

		this.setLeft(new Label(""));
		
	}

}
