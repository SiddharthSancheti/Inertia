package application;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller implements Initializable
{
	
	@FXML private TableView<Student> tableView;
	@FXML private TableColumn<Student, SimpleIntegerProperty> periodNumber;
	@FXML private TableColumn<Student, SimpleStringProperty> className;
	@FXML private TableColumn<Student, SimpleStringProperty> gradeLetter;
	@FXML private TableColumn<Student, SimpleDoubleProperty> gradeDouble;
	@FXML private TableColumn<Student, SimpleStringProperty> teacherName;
	
	public void changeSceneButtonPushed(ActionEvent event) throws IOException 
	{
		Parent MainUI = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
		Scene MainUIScene = new Scene(MainUI);
		
		//This line gets the stage information
		Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
	
		stage.setScene(MainUIScene);
		stage.show();
	}
	
	
	
	/**
	 * Initializes the controller class
	 */
	public void initialize(URL url, ResourceBundle rb)
	{
		periodNumber.setCellValueFactory(new PropertyValueFactory<Student, SimpleIntegerProperty>("period"));
		className.setCellValueFactory(new PropertyValueFactory<Student, SimpleStringProperty>("className"));
		gradeLetter.setCellValueFactory(new PropertyValueFactory<Student, SimpleStringProperty> ("gradeLetter"));
		gradeDouble.setCellValueFactory(new PropertyValueFactory<Student, SimpleDoubleProperty>("gradeDouble"));
		teacherName.setCellValueFactory(new PropertyValueFactory<Student, SimpleStringProperty>("teacherName"));
		
		tableView.setItems(getStudent());
	}
	
	public ObservableList<Student> getStudent()
	{
		ObservableList<Student> student = FXCollections.observableArrayList();
		student.add(new Student(1, "AP Computer Science A", 92.5, "Jan"));
		student.add(new Student(2, "AP English Lit", 95.9, "Rath"));
		student.add(new Student(3, "AP Government", 83.5, "Peterson"));
		student.add(new Student(4, "AP Music Theory", 99.6, "Jane"));
		student.add(new Student(5, "AP Art 1", 89.9, "Stampfli"));
		student.add(new Student(6, "Gender Studies", 79.9, "Fuller"));
		
		return student;
	}
	
}
