package ch.iso.m120.view;

import ch.iso.m120.controller.IdentificationEventHandler;
import ch.iso.m120.controller.NotesEventHandler;
import ch.iso.m120.controller.PasswordEventHandler;
import ch.iso.m120.controller.TransactionEventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MyNavigation extends VBox {

	public MyNavigation() {
		super();
		
		this.getStylesheets().add(getClass().getResource("css/navLeiste.css").toExternalForm());
		
		Button passwordL = new Button("Passwörter");
		passwordL.setOnAction(new PasswordEventHandler());
		
		Button safeNotes = new Button("Sichere Notiz");
		safeNotes.setOnAction(new NotesEventHandler());
		
		Button transactions = new Button("Zahlungsmittel");
		transactions.setOnAction(new TransactionEventHandler());
		
		Button identification = new Button("Ausweis");
		identification.setOnAction(new IdentificationEventHandler());

		this.getChildren().addAll(new Label(""), passwordL, safeNotes, transactions, identification);
		
		//this.setAlignment(Pos.CENTER_LEFT);

	}

}
