package ch.iso.m120.controller;

import java.util.Optional;

import ch.iso.m120.model.User;
import ch.iso.m120.model.UserObservableList;
import ch.iso.m120.view.MyRegisterDialog;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Dialog;

public class RegisterEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
		Dialog<User> dialog = new MyRegisterDialog<User>();

		Optional<User> result = dialog.showAndWait();
		if (result.isPresent()) {
			UserObservableList.saveData(result.get().getFirstname(), result.get().getLastname(), result.get().getUsername(), result.get().getPassword());
		}
		
		
	}

}
