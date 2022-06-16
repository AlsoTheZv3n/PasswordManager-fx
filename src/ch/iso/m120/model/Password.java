package ch.iso.m120.model;

import javafx.beans.property.SimpleStringProperty;

public class Password {

	private SimpleStringProperty name = new SimpleStringProperty();
	private SimpleStringProperty categorie = new SimpleStringProperty();
	private SimpleStringProperty lastUsed = new SimpleStringProperty();

	public Password(String name, String categorie, String lastUsed) {
		super();
		this.setName(name);
		this.setCategorie(categorie);
		this.setLastUsed(lastUsed);
	}

	public final SimpleStringProperty nameProperty() {
		return this.name;
	}

	public final String getName() {
		return this.nameProperty().get();
	}

	public final void setName(final String name) {
		this.nameProperty().set(name);
	}

	public final SimpleStringProperty categorieProperty() {
		return this.categorie;
	}

	public final String getCategorie() {
		return this.categorieProperty().get();
	}

	public final void setCategorie(final String categorie) {
		this.categorieProperty().set(categorie);
	}

	public final SimpleStringProperty lastUsedProperty() {
		return this.lastUsed;
	}

	public final String getLastUsed() {
		return this.lastUsedProperty().get();
	}

	public final void setLastUsed(final String lastUsed) {
		this.lastUsedProperty().set(lastUsed);
	}

}