package application;

import java.util.ArrayList;

public class Grade {
    private ArrayList<Category> sum = new ArrayList<>();
    private int Grade;
    public Grade(){
        Grade = 100;
    }
    public void addCategory(Category a) {
        sum.add(a);

    }
    public ArrayList returnCategories(){
        return sum;
    }
    public double returnGrade(){
        double x = 0.0;
        for (int i = 0; i < sum.size(); i++){
           x += sum.get(i).returnCategoryGrade();
        }
        return x;
    }

}
