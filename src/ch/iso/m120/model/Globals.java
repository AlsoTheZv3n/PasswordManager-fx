package ch.iso.m120.model;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Globals {

	private static BorderPane root = new BorderPane();
	private static BorderPane mainPane = new BorderPane();
	private static TextField userTextField = new TextField();
	private static PasswordField pwBox = new PasswordField();
	private static User loggedInUser = new User(0,"","","","");
	private static VBox MyProfileView = new VBox();
	private static VBox MyTransactionView = new VBox();
	private static VBox MyNotesView = new VBox();
	private static VBox MyIdentificationView = new VBox();
	

	private static String username;
	private static String firstname;
	private static String lastname;

	private static Integer cardNumber;
	private static Integer validFrom;
	private static Integer validUntil;
	private static String name;
	
	private static Integer idNumber;
	private static String country;
	

	public static Integer getIdNumber() {
		return idNumber;
	}

	public static void setIdNumber(Integer idNumber) {
		Globals.idNumber = idNumber;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Globals.country = country;
	}

	public static Integer getCardNumber() {
		return cardNumber;
	}

	public static void setCardNumber(Integer cardNumber) {
		Globals.cardNumber = cardNumber;
	}

	public static Integer getValidFrom() {
		return validFrom;
	}

	public static void setValidFrom(Integer validFrom) {
		Globals.validFrom = validFrom;
	}

	public static Integer getValidUntil() {
		return validUntil;
	}

	public static void setValidUntil(Integer validUntil) {
		Globals.validUntil = validUntil;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Globals.name = name;
	}

	public static BorderPane getRoot() {
		return root;
	}

	public static void setRoot(BorderPane root) {
		Globals.root = root;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Globals.username = username;
	}

	public static String getFirstname() {
		return firstname;
	}

	public static void setFirstname(String firstname) {
		Globals.firstname = firstname;
	}

	public static String getLastname() {
		return lastname;
	}

	public static void setLastname(String lastname) {
		Globals.lastname = lastname;
	}

	public static BorderPane getMainPane() {
		return mainPane;
	}

	public static void setMainPane(BorderPane mainPane) {
		Globals.mainPane = mainPane;
	}

	public static TextField getUserTextField() {
		return userTextField;
	}

	public static void setUserTextField(TextField userTextField) {
		Globals.userTextField = userTextField;
	}

	public static PasswordField getPwBox() {
		return pwBox;
	}

	public static void setPwBox(PasswordField pwBox) {
		Globals.pwBox = pwBox;
	}

	public static User getLoggedInUser() {
		return loggedInUser;
	}

	public static void setLoggedInUser(User loggedInUser) {
		Globals.loggedInUser = loggedInUser;
	}

	public static VBox getMyProfileView() {
		return MyProfileView;
	}

	public static void setMyProfileView(VBox myProfileView) {
		MyProfileView = myProfileView;
	}

}
