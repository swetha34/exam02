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
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5 Output : GAHANA SWETHA SANAGALA");
        Person p = new Person("Gahana", "", "", 0);
        Student s = new Student("Swetha", "", "", 0, "A");
        Employee e = new Employee("Sarika", "", "", 0, "USA", 0, null);
        Faculty f = new Faculty("Sanagala", "", "", 0, "USA", 0, null, 8, 6);
        Staff st = new Staff("Akshara", "", "", 0, "USA", 0, null, "Dr");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }
}
