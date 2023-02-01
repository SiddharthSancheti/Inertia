package Inertia;
import java.util.*;
public class Assignments {
    private String name;
    private double score;

    private String date;


    public Assignments(String name, double score, String date, int key){
        if (key == 123456789) {
            this.name = name;
            this.score = score;
            this.date = date;
        }
    }
    public void setname(String name, int key){
        if (key == 123456789) {
            this.name = name;
        }
        else{

        }


    }
    public String getname(){
        return this.name;
    }
    public void setscore(int score, int key){
        if (key == 123456789) {
            this.score = score;
        }
        else{

        }

    }
    public double getscore(){
        return this.score;

    }
    public String getDate(){
        return date;
    }
    public void setDate(String a, int key){
        if (key == 123456789){
            this.date = a;
        }
    }
    public String toString(){
        return name + " " + score + " " + date;
    }
}
