
package application;

import java.util.*;
public class Assignments {
    private String name;
    private double score;


    public Assignments(String name, double score){
        this.name = name;
        this.score = score;
    }
    public void setname(String name){
        this.name = name;

    }
    public String getname(){
        return this.name;
    }
    public void setscore(int score){
        this.score = score;

    }
    public double getscore(){
        return this.score;

    }
}
