package application;

import javafx.beans.property.*;

public class Attendance 
{
	private SimpleIntegerProperty absence, tardy;
	private SimpleStringProperty className;
	
	//Getter and setter for absence
	public Attendance (Integer absence, Integer tardy, String className)
	{
		this.absence = new SimpleIntegerProperty(absence);
		this.tardy = new SimpleIntegerProperty(tardy);
		this.className = new SimpleStringProperty(className);
	}
	
	//Getters and setters.
	public Integer getAbsence () { return absence.get(); }
	public void setAbsencse (SimpleIntegerProperty absence) { this.absence = absence; }
	
	public Integer getTardy () { return tardy.get(); }
	public void setTardy (SimpleIntegerProperty tardy) { this.tardy = tardy; }
	
	public String getClassName() { return className.get(); }
	public void setClassName(SimpleStringProperty className) { this.className = className; }
	
	
}