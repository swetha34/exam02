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
public class EnggStudent extends Student {
    String collegename;

    public EnggStudent(String collegename, int sno, String sname) {
        super(sno, sname);
        this.collegename = collegename;
    }

    @Override
    public String toString() {
        return "EnggStudent{" + "collegename=" + collegename + '}';
    }
	
}

