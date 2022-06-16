package ch.iso.m120.view;

import ch.iso.m120.model.Globals;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyProfileView extends VBox {

	public MyProfileView() {
		super();
		

		VBox rightVBox = new VBox();
		rightVBox.setSpacing(10);

		Label profile = new Label("Profil");

		rightVBox.setMargin(profile, new Insets(0, 10, 0, 0));

		Image image = new Image("C:\\Users\\Sven Weidenmann\\Desktop\\javafx\\bild1.jpeg");
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		
		rightVBox.setPadding(new Insets(10));
	


		rightVBox.setMargin(imageView, new Insets(0, 0, 10, 0));

		rightVBox.getChildren().addAll(profile, imageView);

		GridPane grid = new GridPane();

		Label textUsername = new Label();
		textUsername.setText(Globals.getLoggedInUser().getUsername());
		Label textFirstname = new Label();
		textFirstname.setText(Globals.getLoggedInUser().getFirstname());
		Label textLastname = new Label();
		textLastname.setText(Globals.getLoggedInUser().getLastname());
		
		grid.setPadding(new Insets(10));

		HBox rightHboxInner = new HBox();

		grid.add(textUsername, 2, 1);
		grid.add(textFirstname, 2, 2);
		grid.add(textLastname, 2, 3);

		VBox right = new VBox();
		right.getChildren().addAll(rightVBox, grid);

		this.getChildren().addAll(right);

		this.setAlignment(Pos.CENTER_RIGHT);

	}

}
