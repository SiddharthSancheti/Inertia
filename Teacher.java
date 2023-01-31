package Inertia;
import java.util.*;
public class Teacher extends Account{
    private Periods periodone;
    private Periods periodtwo;
    private Periods periodthree;
    private Periods periodfour;
    private Periods periodfive;
    private Periods periodsix;
    private String ClassCourse;
    private String name;
    private int teacherID;

    private ArrayList<Periods> Periods= new ArrayList<>();

    public Teacher(String a, int b,String name, int ID, String ClassCourse){
        super(a, b);
        this.name = name;
        this.teacherID = ID;
        this.ClassCourse = ClassCourse;

    }
    public void setname(String a){
        name = a;
    }
    public String returnname(){
        return name;
    }
    public void setID(int a){
        teacherID = a;
    }
    public int returnID(){
        return teacherID;
    }
    public void setClassCourse(String a){
        ClassCourse = a;
    }
    public String returnClassCourse(){
        return ClassCourse;
    }
    public void addPeriod(Periods a){
        Periods.add(a);
    }
    public Periods returnPeriod(int a){
        return Periods.get(a);
    }
    public void showallPeriods(){
        for (int b = 0; b < Periods.size(); b++){
            System.out.print(b + " ");
            System.out.println("Period " + Periods.get(b).returnwhichperiod() + " " + Periods.get(b).returnClassCourse() );
        }

    }
    public void removePeriod(Periods a){
        Periods.remove(a);
    }


}
