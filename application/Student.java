<<<<<<< HEAD
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
=======
package ProjectSemester2;
import java.util.*;
public class Student extends Account {
    private Grade grade1;
    private Grade grade2;
    private Grade grade3;
    private Grade grade4;
    private Grade grade5;
    private Grade grade6;
    private String ClassPeriod1;
    private String ClassPeriod2;
    private String ClassPeriod3;
    private String ClassPeriod4;
    private String ClassPeriod5;
    private String ClassPeriod6;

    public String toString(){
        return returnusername();
    }
    public Student(String a, int b, String one, String two, String three, String four, String five, String six ){
        super(a, b);
        ClassPeriod1 = one;
        ClassPeriod2 = two;
        ClassPeriod3 = three;
        ClassPeriod4 = four;
        ClassPeriod5 = five;
        ClassPeriod6 = six;

    }
    public void setClassPeriod(int a, String b){
        if (a == 1){
            ClassPeriod1 = b;
        }
        else if (a == 2){
            ClassPeriod2 = b;
        }
        else if (a == 3){
           ClassPeriod3 = b;
        }
        else if (a == 4){
            ClassPeriod4 = b;
        }
        else if (a == 5){
            ClassPeriod5 = b;
        }
        else if (a == 6){
            ClassPeriod6 = b;
        }

    }
    public String returnClassPeriod(int a){
        if (a == 1){
            return ClassPeriod1;
        }
        else if (a == 2){
            return ClassPeriod2;
        }
        else if (a == 3){
            return ClassPeriod3;
        }
        else if (a == 4){
            return ClassPeriod4;
        }
        else if (a == 5){
            return ClassPeriod5;
        }
        else if (a == 6){
            return ClassPeriod6;
        }
        else{
            return "error, please input a correct period number (1-6)";
        }

    }
    public Grade returnGrade(int a){
        if (a == 1){
            return grade1;
        }
        else if (a == 2){
            return grade2;
        }
        else if (a == 3){
            return grade3;
        }
        else if (a == 4){
            return grade4;
        }
        else if (a == 5){
            return grade5;
        }
        else if (a == 6){
            return grade6;
        }
        return null;
    }




}
>>>>>>> origin/main
