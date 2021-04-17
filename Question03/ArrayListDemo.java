/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 Output : GAHANA SWETHA SANAGALA");
        ArrayList al = new ArrayList();
        Date d = new Date();
        String s= new String("GAHANA SWETHA");
        al.add(new Loan("2344567", 200000, 50000));
        al.add(d);
        al.add(s);
        al.add(new Circle(7));

        for (Object o : al) {
            System.out.println(o);
        }

    }

}
