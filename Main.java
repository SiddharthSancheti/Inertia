package Inertia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Assignments

        //Test Assignments

        Assignments Test2 = new Assignments("Test2", 0.82, "10/20/22", 123456789);

        // Homework Assignments

        Assignments Arrays = new Assignments("Arrays", 0.8, "10/16/22", 123456789);
        Assignments ArrayList = new Assignments("ArrayLists", 0.9, "10/18/22", 123456789);

        // Creating Categories (2)

        Category AnayHomework = new Category(0.5, "Homework");

        // Adding Assignments to Category

        AnayHomework.addAssignment(Arrays, 123456789);
        AnayHomework.addAssignment(ArrayList, 123456789);

        // Creating 2nd Category

        Category AnayTests = new Category(0.5, "Tests");

        // Adding Assignments

        AnayTests.addAssignment(Test2, 123456789);

        //Creating Grade

        Grade AnayPer3 = new Grade();

        // Adding Categories to Grade

        AnayPer3.addCategory(AnayTests, 123456789);
        AnayPer3.addCategory(AnayHomework, 123456789);

        // Creating Students

        Student NithinVjaykumar = new Student("NithinVjaykumar", 123456789, "null", "null", "AP Compsci", "null", "null", "null");
        Student TanayJain = new Student("Tanay Jain", 123456789, "null", "null", "AP Compsci", "null", "null", "null");
        Student AnayMathur = new Student("AnayMathur", 123456789, "null", "null", "AP Compsci", "null", "null", "null");

        // Adding Grade to AnayMathur Student Object

        AnayMathur.setGrade(AnayPer3, 3, 123456789);

        // Creating Period (Named Periods Object on Accident and I'm too lazy to change it)

        Periods Period3 = new Periods("AP Compsci", 3);

        // Adding Student to Period

        Period3.addStudent(NithinVjaykumar);
        Period3.addStudent(AnayMathur);
        Period3.addStudent(TanayJain);

        // Creating Teacher

        Teacher MichaelJan = new Teacher("MichaelJan", 123456789, "Michael Jan", 123456789, "AP Compsci");

        // Adding the Period to the Teacher

        MichaelJan.addPeriod(Period3);

        // Creating ClassCourse (Added the Teacher)

        ClassCourse APCompsci= new ClassCourse("AP Compsci", 123456789,MichaelJan, 5.0);

        // Returning AnayMathur's Grade in Period 3 Compsci

        MichaelJan.returnPeriod(0).returnStudent(1).returnGrade(3).LoadGrade();
        System.out.println(MichaelJan.returnPeriod(0).returnStudent(1).returnGrade(3).returnGrade(123456789));

    }
}
