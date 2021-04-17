/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Remove {
    public static void removeDuplicate(ArrayList<Integer> list){
    ArrayList<Integer> temp = new ArrayList<>();
    for(Integer numb: list){
        if(!temp.contains(numb)){
            temp.add(numb);
        }
    }
    System.out.print("The distinct integers are ");

    for(Integer num:temp){
        System.out.print(num+" ");
    }}
    public static void main(String[] args){
    System.out.println("Question 1 Output : GAHANA SWETHA SANAGALA");
    System.out.print("Enter ten integers: ");
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<10;i++){
    list.add(sc.nextInt());
    }
    removeDuplicate(list);
    }
  }
