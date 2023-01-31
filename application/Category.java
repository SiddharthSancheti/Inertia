package ProjectSemester2;

import java.util.*;

public class Category {
    private ArrayList<Assignments> Homework = new ArrayList<>();
    private int weight;

    public Category(int weight){
        this.weight = weight;

    }
    public void addAssignment(Assignments a){
        Homework.add(a);

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
