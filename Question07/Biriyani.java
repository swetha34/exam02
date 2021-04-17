/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public enum Biriyani {
    FAMILYPACK(1000),MEDIUMPPACK(700),SINGLEPACK(350);
   public int cost;

    private Biriyani(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
   
}

