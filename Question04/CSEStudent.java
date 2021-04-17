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
public class CSEStudent extends EnggStudent {
    String sub1,sub2;

    public CSEStudent(String sub1, String sub2, String collegename, int sno, String sname) {
        super(collegename, sno, sname);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    @Override
    public String toString() {
        return "CSEStudent{" + "sub1=" + sub1 + ", sub2=" + sub2 + '}';
    }
	
}
