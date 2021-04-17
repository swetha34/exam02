/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Student extends Person{
   public String grade;
   public final String classStatus = "Graduate";

        public Student(String name, String address, String email, 
                int phonenumber, String grade) {
            super(name, address, email, phonenumber);
            this.grade = grade;
        }

    @Override
    public String toString() {
        return "Student Class: " + name;
    }
}
