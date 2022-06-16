package ch.iso.m120.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Notes {
	
	private SimpleIntegerProperty key = new SimpleIntegerProperty();
	private SimpleIntegerProperty userId = new SimpleIntegerProperty();
	private SimpleStringProperty text = new SimpleStringProperty();

	public Notes(Integer key, Integer userId, String text) {
		super();
		this.setKey(key);
		this.setUserId(userId);
		this.setText(text);

	}

	public final SimpleIntegerProperty keyProperty() {
		return this.key;
	}
	

	public final int getKey() {
		return this.keyProperty().get();
	}
	

	public final void setKey(final int key) {
		this.keyProperty().set(key);
	}
	

	public final SimpleIntegerProperty userIdProperty() {
		return this.userId;
	}
	

	public final int getUserId() {
		return this.userIdProperty().get();
	}
	

	public final void setUserId(final int userId) {
		this.userIdProperty().set(userId);
	}
	

	public final SimpleStringProperty textProperty() {
		return this.text;
	}
	

	public final String getText() {
		return this.textProperty().get();
	}
	

	public final void setText(final String text) {
		this.textProperty().set(text);
	}
	

}
