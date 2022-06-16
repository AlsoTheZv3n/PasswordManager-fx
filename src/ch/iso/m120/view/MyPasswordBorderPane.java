package ch.iso.m120.view;

import ch.iso.m120.model.Password;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class MyPasswordBorderPane extends BorderPane {
	public MyPasswordBorderPane() {
		super();

		TableView<Password> table = new MyPasswordTableView<Password>();
		this.setCenter(table);

	}

}
