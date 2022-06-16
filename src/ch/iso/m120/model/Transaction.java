
package ch.iso.m120.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Transaction {

	private SimpleIntegerProperty key  = new SimpleIntegerProperty();
	private SimpleIntegerProperty userId  = new SimpleIntegerProperty();
	private SimpleStringProperty cardNumber  = new SimpleStringProperty();
	private SimpleStringProperty expireDate  = new SimpleStringProperty();
	private SimpleStringProperty lastused   = new SimpleStringProperty();


	public Transaction(Integer key, Integer userId, String cardNumber, String expireDate, String lastused) {
		super();
		this.setKey(key);
		this.setUserId(userId);
		this.setCardNumber(cardNumber);
		this.setExpireDate(expireDate);
		this.setExpireDate(lastused);

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
	


	public final SimpleStringProperty cardNumberProperty() {
		return this.cardNumber;
	}
	


	public final String getCardNumber() {
		return this.cardNumberProperty().get();
	}
	


	public final void setCardNumber(final String cardNumber) {
		this.cardNumberProperty().set(cardNumber);
	}
	


	public final SimpleStringProperty expireDateProperty() {
		return this.expireDate;
	}
	


	public final String getExpireDate() {
		return this.expireDateProperty().get();
	}
	


	public final void setExpireDate(final String expireDate) {
		this.expireDateProperty().set(expireDate);
	}
	


	public final SimpleStringProperty lastusedProperty() {
		return this.lastused;
	}
	


	public final String getLastused() {
		return this.lastusedProperty().get();
	}
	


	public final void setLastused(final String lastused) {
		this.lastusedProperty().set(lastused);
	}
	


}
