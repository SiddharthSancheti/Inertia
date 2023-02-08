<<<<<<< HEAD
package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException 
	{
		//Setting up the primary stage.
		primaryStage.setTitle("Inertia");
		
		//Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		//Scene scene = new Scene(root);
		//primaryStage.setScene(scene);
		//primaryStage.show();
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text scenetitle = new Text("Inertia Log-in");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 1, 2, 1);

		//User name and password boxes.
		Label userName = new Label("User Name:");
		grid.add(userName, 0, 2);
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 2);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 3);
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 3);

		
		//Creating the button to sign in.
		Button btnLogIn = new Button("Sign in");
		Button btnSignUp = new Button("Create account");
		
		HBox hbBtn = new HBox(10);
		
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(btnSignUp, btnLogIn);
		grid.add(hbBtn, 1, 5);
		
        
        btnLogIn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
            	Parent MainUI = null;
				try {
					MainUI = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		Scene MainUIScene = new Scene(MainUI);
        		
        		//This line gets the stage information
        		Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        	
        		stage.setScene(MainUIScene);
        		stage.show();
            }
        });
		
		Scene scene = new Scene(grid, 500, 500);
//		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
=======
package ProjectSemester2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Assignments a = new Assignments("Balls", 0.13);
        ArrayList<Assignments> baal = new ArrayList<>();
        ArrayList<Assignments> baala = new ArrayList<>();

    }
}
>>>>>>> origin/main
