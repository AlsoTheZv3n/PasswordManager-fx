package ch.iso.m120.controller;

import ch.iso.m120.model.Globals;
import ch.iso.m120.view.MyNotesBorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class NotesEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		
		Globals.getMainPane().setCenter(new MyNotesBorderPane());
		
		Globals.getMainPane().setRight(new Label("juhui"));

	}

}
