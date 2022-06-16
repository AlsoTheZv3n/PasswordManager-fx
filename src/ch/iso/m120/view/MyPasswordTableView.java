package ch.iso.m120.view;

import ch.iso.m120.model.Password;
import ch.iso.m120.model.PasswordObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyPasswordTableView<T> extends TableView<Password> {

	public MyPasswordTableView() {

		super();

		// Mitte Passwort Tablle
		TableColumn<Password, String> nameCol = new TableColumn<Password, String>("Name");
		nameCol.setCellValueFactory(new PropertyValueFactory<Password, String>("name"));
		nameCol.setPrefWidth(150);

		TableColumn<Password, String> categorieCol = new TableColumn<Password, String>("Categorie");
		categorieCol.setCellValueFactory(new PropertyValueFactory<Password, String>("categorie"));
		categorieCol.setPrefWidth(150);

		TableColumn<Password, Integer> lastUsedCol = new TableColumn<Password, Integer>("lastUsed");
		lastUsedCol.setCellValueFactory(new PropertyValueFactory<Password, Integer>("lastUsed"));
		lastUsedCol.setPrefWidth(150);

		Button btnAddPw = new Button("Add Password");

		// add columns
		this.getColumns().add(nameCol);
		this.getColumns().add(categorieCol);
		this.getColumns().add(lastUsedCol);

		this.setItems(PasswordObservableList.getData());

		PasswordObservableList.loadData();

		// Save references
		PasswordObservableList.setTable(this);

	}

}
