package ch.iso.m120.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class TransactionObservableList {

	private final static ObservableList<Transaction> data = FXCollections.observableArrayList();
	private static TableView<Transaction> table = null;

	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static void loadData() {

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(
					"select * from transaction;");

			while (rs.next()) {
				Integer key = rs.getInt("transkey");
				Integer userId = rs.getInt("transUserId");
				String cardNumber = rs.getString("transCardNumber");
				String exoireDate = rs.getString("transExpireDate");
				String lastused = rs.getString("transLastused");

				data.add(new Transaction(key, userId, cardNumber, exoireDate, lastused));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static TableView<Transaction> getTable() {
		return table;

	}

	public static void setTable(TableView<Transaction> table) {
		TransactionObservableList.table = table;
	}

}
