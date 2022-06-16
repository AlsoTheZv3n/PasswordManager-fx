package ch.iso.m120.model;

import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class PasswordObservableList {

	private final static ObservableList<Password> data = FXCollections.observableArrayList();
	private static TableView<Password> table = null;

	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static ObservableList<Password> getData() {
		return data;
	}

	public static void loadData() {

		data.clear();
		
		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(
					"select passPassword, passCategorie, passLastused from password where passUserId = " + Globals.getLoggedInUser().getKey() + ";");

			while (rs.next()) {
				String password = rs.getString("passPassword");
				String categorie = rs.getString("passCategorie");
				String lastused = rs.getString("passLastused");

				data.add(new Password(password, categorie, lastused));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static TableView<Password> getTable() {
		return table;

	}

	public static void setTable(TableView<Password> table) {
		PasswordObservableList.table = table;
	}

}
