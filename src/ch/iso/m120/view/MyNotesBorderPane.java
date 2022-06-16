package ch.iso.m120.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyNotesBorderPane extends BorderPane {

	public MyNotesBorderPane() {
		super();

		VBox dialog = new MyNotesVBox();
		this.setCenter(dialog);

	}

}
