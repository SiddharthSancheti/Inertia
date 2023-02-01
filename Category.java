package Inertia;

import java.util.*;

public class Category {
    private ArrayList<Assignments> Homework = new ArrayList<>();
    private double weight;
    private String name;

    public Category(double weight, String name){
        this.weight = weight;
        this.name = name;

    }
    public void setName(String a, int key){
        if (key == 123456789) {
            name = a;
        }
    }
    public String returnName(){
        return name;
    }
    public String toString(){
        return name + " " + weight;
    }
    public void addAssignment(Assignments a, int key){
        if (key == 123456789) {
            Homework.add(a);
        }
    }
    public void removeAssignment(Assignments a, int key){
        if (key == 123456789) {
            Homework.remove(a);
        }
    }
    public void showAssignments(){
        for (int i = 0; i < Homework.size(); i++){
            System.out.print(i + " ");
            System.out.println(Homework.get(i).toString());
        }
    }
    public double returnCategoryGrade(int key){
        if (key == 123456789) {
            double x = 0.0;
            for (Assignments i : Homework) {
                x += i.getscore();

            }
            x /= Homework.size();
            x *= weight;
            return x;
        }
        else{
            return -1.0;
        }
    }
    public ArrayList returnHomework(int key){
        if (key == 123456789) {
            return this.Homework;
        }
        else return null;
    }

}
