
package application;

import java.util.*;
public class Periods {
    private ArrayList<Student> Students = new ArrayList<>();
    private int whichperiod;
    private String ClassCourse;
    public Periods(String b, int a){
        ClassCourse = b;
        whichperiod = a;
    }
    public void addStudent(Student a){
        Students.add(a);

    }
    public void printallStudents(){
        for (int i = 0; i < Students.size(); i++){
            System.out.print("Number: "+ i + " ");
            System.out.println(Students.get(i).toString());
        }
    }
    public void removeStudent(int i){
        Students.remove(i);
    }
    public Student returnStudent(int i){
        return Students.get(i);
    }
    public int returnwhichperiod(){
        return whichperiod;
    }
    public void setwhichperiod(int i){
        whichperiod = i;
    }
    public String returnClassCourse(){
        return ClassCourse;
    }
}
