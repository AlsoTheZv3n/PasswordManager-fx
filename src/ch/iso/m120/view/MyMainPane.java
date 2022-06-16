package ch.iso.m120.view;

import ch.iso.m120.model.Globals;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyMainPane extends BorderPane {

	public MyMainPane() {
		super();
		
		Globals.setMainPane(this);
		
		BorderPane pane = new MyPasswordBorderPane();
		
		VBox profile = new MyProfileView();
		
		VBox myTransactionView = new MyTransactionView();
		VBox myNotesView = new MyNotesView();
		VBox myIdentificationView = new MyIdentificationView();
		
		Globals.setMyProfileView(profile);
		
		VBox list = new MyNavigation();
		list.setPrefWidth(120);
		
		this.setLeft(list);
		this.setCenter(pane);
		this.setRight(profile);
		
		
 		
	}

}
