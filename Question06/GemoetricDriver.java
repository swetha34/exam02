/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class GemoetricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 6 Output : GAHANA SWETHA SANAGALA");
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1 ");
        int side1 = sc.nextInt();
        System.out.println("Enter side2 ");
        int side2 = sc.nextInt(); 
        System.out.println("Enter side3 ");
        int side3 = sc.nextInt();
        System.out.println("Enter color ");
        sc.nextLine();
        String color = sc.nextLine();
        System.out.println("Is filled ");
        boolean isFilled = sc.nextBoolean();
        sc.close();
        Triangle tri = new Triangle(side1, side2, side3, color, isFilled);
        System.out.println(tri.toString());
    }
    }
    

