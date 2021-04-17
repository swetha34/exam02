/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class EnumDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Question 7 Output : GAHANA SWETHA SANAGALA");
      Scanner scan =new Scanner(System.in); 
      System.out.println("Choose the Biriyani needed: ");
      System.out.println("1.FAMILYPACK");
      System.out.println("2.MEDIUMPPACK");
      System.out.println("3.SINGLEPACK");
      String name=scan.next().toUpperCase();
      while((!name.equals("FAMILYPACK"))&&
      (!name.equals("MEDIUMPPACK"))&&(!name.equals("SINGLEPACK"))){
      System.out.println("Choose valid Size of Biriyani: ");
      System.out.println("1.FAMILYPACK");
      System.out.println("2.MEDIUMPPACK");
      System.out.println("3.SINGLEPACK");
      name=scan.next().toUpperCase();
      }
      System.out.println("The price of " +name+"is" +Biriyani.valueOf(name).getCost());
}
} 
    

