package Inertia;

import java.util.ArrayList;

public class ClassCourse {
    private String name;
    private int ID;
    private double gpaweight;
    private Teacher teacher;
    public ClassCourse(String name, int ID, Teacher teacher, double gpaweight){
        this.name = name;
        this.ID = ID;
        this.teacher = teacher;
        this.gpaweight = gpaweight;


    }
    public void setName(String name){
        this.name = name;
    }
    public String returnname(){
        return name;
    }
    public void setID(int a ){
        ID = a;
    }
    public int returnID(){
        return ID;

    }
    public Teacher returnteacher(){
        return teacher;
    }
    public String teachername(){
        return teacher.returnname();
    }
}
