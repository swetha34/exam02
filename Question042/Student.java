/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question042;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Student {
    public static class students
    {
        public static void student1(){
            System.out.println("Student Name");
        }

       
    }
    public static class EnggStudent extends students
    {
        public static void student1(){
            System.out.println("College Name: ");
        }
    }
    public static class CSEStudent extends students
    {
        public static void student1(){
            System.out.println("Cse Subjects: ");
        }
        
   
        
        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 4(2) Output : GAHANA SWETHA SANAGALA");
        students s1= new students();
        students s2= new EnggStudent();
        students s3= new CSEStudent();
        
        s1.student1();
        s1.student1();
        s1.student1();
        
        
    }

    }
}

    
    
    
	

