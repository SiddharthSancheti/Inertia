package ProjectSemester2;
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
    private int ID;

    public Teacher(String a, int b,String name, int ID, String ClassCourse){
        super(a, b);
        this.name = name;
        this.ID = ID;
        this.ClassCourse = ClassCourse;

    }

}
