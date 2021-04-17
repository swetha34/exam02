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
public class Employee extends Person{
   public String office;
   public int salary;
   public Date dateHired;

    public Employee(String name, String address, String email,
            int phonenumber, String office, int salary,
            Date dateHired) {
        super(name, address, email, phonenumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee Class: " +name;
    }
}
