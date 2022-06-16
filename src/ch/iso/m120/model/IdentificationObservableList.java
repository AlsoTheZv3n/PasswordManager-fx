package ch.iso.m120.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class IdentificationObservableList {

	private final static ObservableList<Identification> data = FXCollections.observableArrayList();
	private static TableView<Identification> table = null;
	
	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static void loadData() {

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM identification");

			while (rs.next()) {
				Integer key  = rs.getInt("identkey");
				Integer userId = rs.getInt("identUserId");
				String idNumber = rs.getString("identIdNumber");
				String validFrom = rs.getString("identValidFrom");
				String validUntil = rs.getString("identValidUntil");
				String country = rs.getString("identCountry");

				data.add(new Identification(key, userId, idNumber, validFrom, validUntil, country));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static TableView<Identification> getTable() {
		return table;

	}

	public static void setTable(TableView<Identification> table) {
		IdentificationObservableList.table = table;
	}

}
