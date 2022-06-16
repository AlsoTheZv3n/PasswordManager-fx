package ch.iso.m120.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyTransactionsBorderPane extends BorderPane{

	public MyTransactionsBorderPane() {
		super();

		VBox dialog = new MyTransactionVBox();
		this.setCenter(dialog);
	}

}
