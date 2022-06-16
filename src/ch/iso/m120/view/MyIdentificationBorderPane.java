package ch.iso.m120.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyIdentificationBorderPane extends BorderPane {

	public MyIdentificationBorderPane() {
		super();

		VBox dialog = new MyIdentificationVBox();
		this.setCenter(dialog);

	}

}
