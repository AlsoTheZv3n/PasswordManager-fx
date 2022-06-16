package ch.iso.m120.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MyTransactionVBox extends VBox {

	public MyTransactionVBox() {
		super();

		HBox ibanHBox = new HBox();
		HBox validHBox = new HBox();
		GridPane grid = new GridPane();
		grid.setGridLinesVisible(true);

		// Setting the label
		Label lbltrans = new Label("Card ");
		Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
		lbltrans.setFont(font);

		// label mit eingabe felder
		Label lcardNumber = new Label(" Card Number ");
		lcardNumber.setPadding(new Insets(0, 0, 3, 0));
		TextField textCardNumber = new TextField();

		Label lfromUntil = new Label(" From - Until Expired ");
		lfromUntil.setPadding(new Insets(0, 0, 3, 0));
		TextField textExpired = new TextField();
		TextField textLastUsed = new TextField();

		// HBox inserts
		ibanHBox.getChildren().addAll(lcardNumber, textCardNumber);
		//	validHBox.getChildren().addAll(lfromUntil, textExpired, textLastUsed);

		Button btnAdd = new Button("Add");

		// this.setSpacing(20);
		this.setPadding(new Insets(20, 50, 50, 60));
		this.getChildren().addAll(grid, btnAdd);

		grid.add(lbltrans, 0, 0, 1, 1);
		grid.add(lcardNumber, 0, 1, 1, 1);
		grid.add(textCardNumber, 1, 1, 1, 1);
		grid.add(lfromUntil, 0, 2, 1, 1);
		grid.add(textExpired, 1, 2, 1, 1);
		grid.add(textLastUsed, 2, 2, 1, 1);
		
	}
}
