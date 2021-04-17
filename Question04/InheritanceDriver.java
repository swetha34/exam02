/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class InheritanceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 4(1) Output : GAHANA SWETHA SANAGALA");
        Student s = new Student(123,"Swetha");
        CSEStudent cs=new CSEStudent("java","webapps","northwest",124,"Gahana");
        EnggStudent es= new EnggStudent("Northwest",123,"Sanagala");
        System.out.println(s);
        System.out.println(cs);
        System.out.println(es);
    }
    
}
