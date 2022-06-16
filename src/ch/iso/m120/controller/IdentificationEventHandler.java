package ch.iso.m120.controller;

import ch.iso.m120.model.Globals;
import ch.iso.m120.view.MyIdentificationVBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class IdentificationEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {

		Globals.getMainPane().setCenter(new MyIdentificationVBox());

	}

}
