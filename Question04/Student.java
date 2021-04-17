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
public class Student {
    int sno;
	String sname;

    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" + "sno=" + sno + ", sname=" + sname + '}';
    }
	

}
