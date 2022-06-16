package ch.iso.m120.controller;

import ch.iso.m120.model.Globals;
import ch.iso.m120.view.MyPasswordBorderPane;
import ch.iso.m120.view.MyProfileView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PasswordEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		Globals.getMainPane().setCenter(new MyPasswordBorderPane());
		Globals.getMainPane().setRight(new MyProfileView());
	}
}
