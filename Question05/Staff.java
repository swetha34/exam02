/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

import java.util.Date;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Staff extends Employee {

    public String title;

    public Staff(String name, String address, String email, int phone, String office, 
            int salary, Date dateHired,String title) 
    {
        super(name, address, email, phone, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class: " + name ;
    }
    
}
