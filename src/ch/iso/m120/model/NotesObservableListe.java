package ch.iso.m120.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class NotesObservableListe {

	private final static ObservableList<Notes> data = FXCollections.observableArrayList();
	private static TableView<Notes> table = null;

	private static String connectionString = "jdbc:mysql://localhost/pwmanagerdb?useSSL=false";
	private static String connectionUser = "root";
	private static String connectionPassword = "";

	public static void loadData() {

		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery( "SELECT noteskey, notesUserId, notesText FROM notes;");

			while (rs.next()) {
				Integer noteskey = rs.getInt("noteskey");
				Integer notesUserId = rs.getInt("notesUserId");
				String addName = rs.getString("notesText");

				data.add(new Notes(noteskey, notesUserId, addName));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static TableView<Notes> getTable() {
		return table;

	}

	public static void setTable(TableView<Notes> table) {
		NotesObservableListe.table = table;
	}

}
