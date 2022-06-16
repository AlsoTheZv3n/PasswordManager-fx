module Projekt_Javafx_M120 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;
	
	opens ch.iso.m120.view to javafx.graphics, javafx.fxml, javafx.base;
	opens ch.iso.m120.model to javafx.graphics, javafx.fxml, javafx.base;
	opens ch.iso.m120.controller to javafx.graphics, javafx.fxml, javafx.base;

}
