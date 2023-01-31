package application;
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
