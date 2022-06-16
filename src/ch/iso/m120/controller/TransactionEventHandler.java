package ch.iso.m120.controller;

import ch.iso.m120.model.Globals;
import ch.iso.m120.view.MyNotesBorderPane;
import ch.iso.m120.view.MyTransactionsBorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TransactionEventHandler implements EventHandler<ActionEvent> {
	
	@Override
	public void handle(ActionEvent event) {
		Globals.getMainPane().setCenter(new MyTransactionsBorderPane());

	}

}
