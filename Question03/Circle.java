/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Circle {
    double area,r;
	public Circle(double r)
	{
		this.r=r;
		area();
	}
	public void area()
	{
		area=Math.PI*r*r;
	}
    @Override
	public String toString()
	{
		return "Area is : "+area;
	}

}
