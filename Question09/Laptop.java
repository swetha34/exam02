/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Laptop implements Electronicdevices{
   
    public static final String LaptopModel="HP";
    public static final int Laptopcost=500000;
    
    public void type(){
    System.out.println("Laptop model is:"+LaptopModel);
    }
    public void cost(){
        System.out.println("Laptop is cost:"+Laptopcost);
    }

    
}
