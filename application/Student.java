package application;
import java.util.*;
public class Student {
	
	private Integer period;
	private String className;
	private String gradeLetter;
	private Double gradeDouble;
	private String teacherName;

    public Student(Integer period, String className, Double gradeDouble, String teacherName)
    {
    	this.period = period;
    	this.className = className;
    	this.gradeDouble = gradeDouble;
    	this.teacherName = teacherName;
    	
    	gradeLetter = returnletterGrade(gradeDouble);
    }
    
    //Getter and setter for period.
    public Integer getPeriod () { return period; }
    public void setPeriod (Integer period) { this.period = period; }
    
    //Getter and setter for class name.
    public String getClassName () { return className; }
    public void setClassName (String className) { this.className = className; }
    
    //Getter and setter for the grade letter.
    public String getGradeLetter () { return gradeLetter; }
    public void setGradeLetter (String gradeLetter) { this.gradeLetter = gradeLetter; }
    
    //Getter and setter for gradePercentage.
    public Double getGradeDouble () { return gradeDouble; }
    public void setGradeDouble (Double gradeDouble) { 
    	this.gradeDouble = gradeDouble;
    	gradeLetter = returnletterGrade(gradeDouble);
    }
    
    //Getter and setter for the teacher name.
    public String getTeacher () { return teacherName; }
    public void setTeacher (String teacherName) { this.teacherName = teacherName; }
    
    
    public String returnletterGrade(double a) {
        if (a >= 90)
            return "A";
        else if (a >= 80 && a < 90) 
            return "B"; 
        else if (a >= 70 && a < 80) 
            return "C";
        else if (a >= 60 && a < 70) 
            return "D";
        else if (a < 60) 
            return "F";
        else
            return "error";
    }
}