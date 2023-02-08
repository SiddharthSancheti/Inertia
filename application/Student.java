package application;
import javafx.beans.property.*;
public class Student 
{	
	private SimpleIntegerProperty period;
	private SimpleStringProperty className, gradeLetter, teacherName;
	private SimpleDoubleProperty gradeDouble;

    public Student(Integer period, String className, Double gradeDouble, String teacherName)
    {
    	this.period = new SimpleIntegerProperty(period);
    	this.className = new SimpleStringProperty(className);
    	this.gradeDouble = new SimpleDoubleProperty(gradeDouble);
    	this.teacherName = new SimpleStringProperty(teacherName);
    	
    	gradeLetter = returnletterGrade(gradeDouble);
    }
    
    //Getter and setter for period.
    public Integer getPeriod () { return period.get(); }
    public void setPeriod (SimpleIntegerProperty period) { this.period = period; }
    
    //Getter and setter for class name.
    public String getClassName () { return className.get(); }
    public void setClassName (SimpleStringProperty className) { this.className = className; }
    
    //Getter and setter for the grade letter.
    public String getGradeLetter () { return gradeLetter.get(); }
    public void setGradeLetter (SimpleStringProperty gradeLetter) { this.gradeLetter = gradeLetter; }
    
    //Getter and setter for gradePercentage.
    public Double getGradeDouble () { return gradeDouble.get(); }
    public void setGradeDouble (SimpleDoubleProperty gradeDouble) { this.gradeDouble = gradeDouble; }
    
    //Getter and setter for the teacher name.
    public String getTeacher () { return teacherName.get(); }
    public void setTeacher (SimpleStringProperty teacherName) { this.teacherName = teacherName; }
    
    
    public SimpleStringProperty returnletterGrade(double a) {
    	
    	String letter;
    	if (a >= 90)
    		letter = "A";
        else if (a >= 80 && a < 90) 
            letter = "B"; 
        else if (a >= 70 && a < 80) 
            letter = "C";
        else if (a >= 60 && a < 70) 
        	letter =  "D";
        else if (a < 60) 
        	letter =  "F";
        else
        	letter =  "error";
    	
    	SimpleStringProperty finalGrade = new SimpleStringProperty(letter);
    	return finalGrade;
    }
}
