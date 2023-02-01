package Inertia;

import java.util.ArrayList;

public class Grade {
    private ArrayList<Category> sum = new ArrayList<>();
    private double Grade;
    public Grade(){
        Grade = 0.0;
    }
    public void addCategory(Category a, int key) {
        if (key == 123456789) {
            sum.add(a);
        }
    }
    public void removeCategories(Category a, int key){
        if (key == 123456789) {
            sum.remove(a);
        }
    }
    public void LoadCategories(){
        for (int i = 0; i < sum.size(); i++){
            System.out.print(i + " ");
            System.out.println(sum.get(i).toString());
        }
    }
    public ArrayList returnCategories(int key){
        if (key == 123456789) {
            return sum;
        }
        else return null;
    }
    public double returnGrade(int key){
        if (key == 123456789) {
            return Grade;
        }
        else return -1.0;
    }
    public void LoadGrade(){
        for (int i = 0; i < sum.size(); i++){
            Grade += sum.get(i).returnCategoryGrade(123456789);
        }
        Grade *= 100;
    }

}
