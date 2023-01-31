package Inertia;

import java.util.ArrayList;

public class Grade {
    private ArrayList<Category> sum = new ArrayList<>();
    private double Grade;
    public Grade(){
        Grade = 100.0;
    }
    public void addCategory(Category a) {
        sum.add(a);

    }
    public void removeCategories(Category a){
        sum.remove(a);
    }
    public void LoadCategories(){
        for (int i = 0; i < sum.size(); i++){
            System.out.print(i + " ");
            System.out.println(sum.get(i).toString());
        }
    }
    public ArrayList returnCategories(){
        return sum;
    }
    public double returnGrade(){
        return Grade;
    }
    public void LoadGrade(){
        for (int i = 0; i < sum.size(); i++){
            Grade += sum.get(i).returnCategoryGrade();
        }
    }

}
