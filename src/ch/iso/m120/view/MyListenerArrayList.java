package ch.iso.m120.view;

import ch.iso.m120.model.ItemObservableList;
import ch.iso.m120.model.Password;
import ch.iso.m120.model.PasswordObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyListenerArrayList {

	public MyListenerArrayList() {
		super();

		// Arrayliste Rechts
		TableColumn<ItemObservableList, String> numberCol = new TableColumn<ItemObservableList, String>("Number");
		numberCol.setCellValueFactory(new PropertyValueFactory<ItemObservableList, String>("number"));
		numberCol.setPrefWidth(150);

		TableColumn<ItemObservableList, String> entryCol = new TableColumn<ItemObservableList, String>("Entry");
		entryCol.setCellValueFactory(new PropertyValueFactory<ItemObservableList, String>("Entry"));
		entryCol.setPrefWidth(150);

		// add columns
		this.getColumns().add(numberCol);
		this.getColumns().add(entryCol);

		this.setItems(ItemObservableList.getData());

		ItemObservableList.loadData();

		// Save references
		ItemObservableList.setTable(this);

	}

}
