package ch.iso.m120.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class User {

	private SimpleIntegerProperty key = new SimpleIntegerProperty();
	private SimpleStringProperty firstname = new SimpleStringProperty();
	private SimpleStringProperty lastname = new SimpleStringProperty();
	private SimpleStringProperty username = new SimpleStringProperty();
	private SimpleStringProperty password = new SimpleStringProperty();

	public User(int key, String firstname, String lastname, String username, String password) {
		super();
		this.setKey(key);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setUsername(username);
		this.setPassword(password);
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
	
	public final SimpleStringProperty firstnameProperty() {
		return this.firstname;
	}

	public final String getFirstname() {
		return this.firstnameProperty().get();
	}

	public final void setFirstname(final String firstname) {
		this.firstnameProperty().set(firstname);
	}

	public final SimpleStringProperty lastnameProperty() {
		return this.lastname;
	}

	public final String getLastname() {
		return this.lastnameProperty().get();
	}

	public final void setLastname(final String lastname) {
		this.lastnameProperty().set(lastname);
	}

	public final SimpleStringProperty usernameProperty() {
		return this.username;
	}

	public final String getUsername() {
		return this.usernameProperty().get();
	}

	public final void setUsername(final String username) {
		this.usernameProperty().set(username);
	}

	public final SimpleStringProperty passwordProperty() {
		return this.password;
	}

	public final String getPassword() {
		return this.passwordProperty().get();
	}

	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}

}
