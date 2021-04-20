/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * @author User
 */
public class TransposeMatriks {
      public static void main(String[] args) {
        int i, j;
        int [][] matrix  = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int transpose[][] = new int [matrix[0].length] [matrix.length];
        System.out.println(" Hasil Matrix : ");
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
        for(i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println(" Hasil Transpose Matrix :");
        for(i = 0; i < matrix[0].length; i++){
             for(j = 0; j < matrix.length; j++){
               System.out.print(transpose[i][j] + "\t");
             } 
             System.out.println();
        }
        System.out.println(" Wildan Rezi");
    }
}


