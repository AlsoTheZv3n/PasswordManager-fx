package ch.iso.m120.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Identification {

	private SimpleIntegerProperty key = new SimpleIntegerProperty();
	private SimpleIntegerProperty userId = new SimpleIntegerProperty();
	private SimpleStringProperty idNumber = new SimpleStringProperty();
	private SimpleStringProperty validFrom = new SimpleStringProperty();
	private SimpleStringProperty validUntil = new SimpleStringProperty();
	private SimpleStringProperty country = new SimpleStringProperty();

	public Identification(Integer key, Integer userId, String idNumber, String validFrom, String validUntil, String country) {
		super();
		this.setKey(key);
		this.setUserId(userId);
		this.setIdNumber(idNumber);
		this.setValidFrom(validFrom);
		this.setValidUntil(validUntil);
		this.setCountry(country);
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
	

	public final SimpleStringProperty idNumberProperty() {
		return this.idNumber;
	}
	

	public final String getIdNumber() {
		return this.idNumberProperty().get();
	}
	

	public final void setIdNumber(final String idNumber) {
		this.idNumberProperty().set(idNumber);
	}
	

	public final SimpleStringProperty validFromProperty() {
		return this.validFrom;
	}
	

	public final String getValidFrom() {
		return this.validFromProperty().get();
	}
	

	public final void setValidFrom(final String validFrom) {
		this.validFromProperty().set(validFrom);
	}
	

	public final SimpleStringProperty validUntilProperty() {
		return this.validUntil;
	}
	

	public final String getValidUntil() {
		return this.validUntilProperty().get();
	}
	

	public final void setValidUntil(final String validUntil) {
		this.validUntilProperty().set(validUntil);
	}
	

	public final SimpleStringProperty countryProperty() {
		return this.country;
	}
	

	public final String getCountry() {
		return this.countryProperty().get();
	}
	

	public final void setCountry(final String country) {
		this.countryProperty().set(country);
	}
	

}
