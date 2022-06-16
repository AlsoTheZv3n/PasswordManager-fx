package ch.iso.m120.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelLoginEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {

		Platform.exit();
	}

}
