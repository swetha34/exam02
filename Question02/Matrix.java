/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

import java.util.Scanner;

/**
 *
 * @author Gahana Swetha Sanagala
 */
public class Matrix {

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list1[][] = new int[3][3];
        int list2[][] = new int[3][3];
        System.out.println("Question 2 Output : GAHANA SWETHA SANAGALA");
        System.out.println("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = sc.nextInt();
            }

        }
        sc.close();

        boolean res;

        res = equals(list1, list2);

        if (res == true) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }
}
