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
public class Faculty extends Employee {

   public int officeHours;
   public int noOfTeachingSubjects;

    public Faculty(String name, String address, String email,
            int phonenumber, String office, int salary, Date dateHired,
            int officeHours, int noOfTeachingSubjects) {
        super(name, address, email, phonenumber, office, salary, dateHired);
        this.officeHours = officeHours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "Faculty Class: " + name;
    }
}
