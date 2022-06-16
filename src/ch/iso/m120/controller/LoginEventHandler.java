package ch.iso.m120.controller;

import ch.iso.m120.model.Globals;
import ch.iso.m120.model.User;
import ch.iso.m120.model.UserObservableList;
import ch.iso.m120.view.MyMainPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {

		String username = Globals.getUserTextField().getText();
		String pw = Globals.getPwBox().getText();

		UserObservableList.loadData();

		boolean go = false;

		for (User u : UserObservableList.getData()) {
			if (u.getUsername().equals(username) && u.getPassword().equals(pw)) {
				go = true;
				Globals.setLoggedInUser(u);
				break;
			}
		}

		if (go) {
			Globals.getRoot().setCenter(new MyMainPane());
		} else {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login failed");
			alert.setHeaderText(null);
			alert.setContentText("login failed no such user");
			alert.showAndWait();
		}
	}

}
