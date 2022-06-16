package ch.iso.m120.model;

import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserObservableList {

	private final static ObservableList<User> data = FXCollections.observableArrayList();

	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static void loadData() {

		data.clear();
		
		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from user;");

			while (rs.next()) {
				int key = rs.getInt("userkey");
				String firstname = rs.getString("userFirstname");
				String lastname = rs.getString("userLastname");
				String username = rs.getString("userUsername");
				String password = rs.getString("userPassword");

				data.add(new User(key, firstname, lastname, username, password));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void saveData(String firstname, String lastname, String username, String password) {

		try {
			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			stmt.executeUpdate("insert into user (userFirstname, userLastname, userUsername, userPassword) values ('"
					+ firstname + "', '" + lastname + "', '" + username + "', '" + password + "');");

			stmt.close();

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static ObservableList<User> getData() {
		return data;
	}
}
