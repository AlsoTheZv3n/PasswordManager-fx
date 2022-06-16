package ch.iso.m120.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MyNotesVBox extends VBox {

	public MyNotesVBox() {
		super();

		// Setting the label
		Label lblnotes = new Label("Securety Notes");
		Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
		lblnotes.setFont(font);

		// Creating a pagination
		TextArea area = new TextArea();

		// Setting number of pages
		area.setText("Enter your Notes Here");
		area.setPrefColumnCount(15);
		area.setPrefHeight(120);
		area.setPrefWidth(300);

		Button btnSave = new Button("Save");

		this.setSpacing(20);
		this.setPadding(new Insets(20, 50, 50, 60));
		this.getChildren().addAll(lblnotes, area, btnSave);

	}
}
