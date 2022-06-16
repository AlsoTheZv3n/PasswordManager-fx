package ch.iso.m120.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class ItemObservableList {

	private final static ObservableList<ItemObservableList> data = FXCollections.observableArrayList();
	private static TableView<ItemObservableList> table = null;

	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static ObservableList<ItemObservableList> getData() {
		return data;

	}

	public static void loadData() {

		data.clear();

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt
					
					// working

			while (rs.next()) {
				
				//working 
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static TableView<ItemObservableList> getTable() {
		return table;

	}

	public static void setTable(TableView<ItemObservableList> table) {
		ItemObservableList.table = table;
	}

}
