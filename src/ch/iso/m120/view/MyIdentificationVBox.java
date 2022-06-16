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

public class MyIdentificationVBox extends VBox {

	public MyIdentificationVBox() {
		super();

		HBox idNumbHBox = new HBox();
		HBox validFromHBox = new HBox();
		HBox validUntilHBox = new HBox();
		HBox country = new HBox();
		

		// Setting the label
		Label lblid = new Label("ID");
		Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
		lblid.setFont(font);

		// label mit eingabe felder

		Label lidNumber = new Label("ID-Number");
		lidNumber.setPadding(new Insets(0,0,3,0));
		TextField textIdNumber = new TextField();

		Label lvaildFrom = new Label("Valid From");
		lvaildFrom.setPadding(new Insets(0,0,3,0));
		TextField textValidFrom = new TextField();

		Label lvalidUntil = new Label("Valid Until");
		lvalidUntil.setPadding(new Insets(0,0,3,0));
		TextField textValidUntil = new TextField();

		Label lcountry = new Label("Country");
		lcountry.setPadding(new Insets(0,0,3,0));
		TextField textCountry = new TextField();

		Button btnAdd = new Button("Add");

		// HBox inserts
		idNumbHBox.getChildren().addAll(lidNumber, textIdNumber);
		validFromHBox.getChildren().addAll(lvaildFrom, textValidFrom);
		validUntilHBox.getChildren().addAll(lvalidUntil, textValidUntil);
		country.getChildren().addAll(lcountry, textCountry);
		
		// Abstände zwischen label und Textbox
		idNumbHBox.setPadding(new Insets(0,0,10,10));
		validFromHBox.setPadding(new Insets(0,0,10,10));
		validUntilHBox.setPadding(new Insets(0,0,10,10));
		country.setPadding(new Insets(0,0,10,10));

		// this.setSpacing(20);
		this.setPadding(new Insets(20, 50, 50, 60));
		this.getChildren().addAll(lblid, idNumbHBox, validFromHBox, validUntilHBox, country, btnAdd);
		
		

	}

}
