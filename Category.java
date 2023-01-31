package Inertia;

import java.util.*;

public class Category {
    private ArrayList<Assignments> Homework = new ArrayList<>();
    private int weight;
    private String name;

    public Category(int weight, String name){
        this.weight = weight;
        this.name = name;

    }
    public void setName(String a){
        name = a;
    }
    public String returnName(){
        return name;
    }
    public String toString(){
        return name + " " + weight;
    }
    public void addAssignment(Assignments a){
        Homework.add(a);

    }
    public void removeAssignment(Assignments a){
        Homework.remove(a);
    }
    public void showAssignments(){
        for (int i = 0; i < Homework.size(); i++){
            System.out.print(i + " ");
            System.out.println(Homework.get(i).toString());
        }
    }
    public double returnCategoryGrade(){
        double x = 0.0;
        for (Assignments i : Homework){
            x += i.getscore();

        }
        x /= Homework.size();
        x *= weight;
        return x;

    }
    public ArrayList returnHomework(){
        return this.Homework;
    }

}
