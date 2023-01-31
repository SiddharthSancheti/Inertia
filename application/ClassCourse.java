
package application;

import java.util.ArrayList;

public class ClassCourse {
    private String name;
    private int ID;
    private Teacher teacher;
    private ArrayList<Periods> Periods= new ArrayList<>();
    public ClassCourse(String name, int ID, Teacher teacher){
        this.name = name;
        this.ID = ID;
        this.teacher = teacher;
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
}
