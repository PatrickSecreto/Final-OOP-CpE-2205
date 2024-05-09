package com.mycompany.finaloop;

import java.util.Scanner;

public class DeterminantMatrices {
    
    public void ChoiceDeterminantMatrices(){
        Scanner scanner = new Scanner(System.in);
        int rows,cols;
        
        while (true){
            System.out.println("""
                               
                               ---------------------------------------
                               |        DETERMINANT CALCULATOR       |
                               ---------------------------------------
                               """);
            
            System.out.println("The calculator can compute 1x1, 2x2, and 3x3 matrices!\n");
            rows = getValidInput("\nEnter number of rows for the Matrix: ", scanner);
            cols = getValidInput("Enter number of columns for the Matrix: ", scanner);
            if (rows != cols){
                System.out.println("\nERROR: Rows and Columns must be same.");
            }else{
                if (rows >= 4 || cols >= 4){
                System.out.println("\nERROR: Rows and Columns must be 1x1, 2x2, or 3x3 only.");
                continue;
                }
            break;
            }
        }
        
        int[][] matrix = inputMatrix("Matrix", rows, cols, scanner);
        
        System.out.println("\n--------------------");
        System.out.println("    CURRENT MATRIX");
        System.out.println("--------------------");
        System.out.println("\nMATRIX:");
        displayMatrix(matrix);
        
        System.out.println("\nDeterminant of the Matrix: " + determinantMatrices(matrix));
        
    }
    
    public static int getValidInput(String prompt, Scanner scanner) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Please enter a valid integer.");
            }
        }
        return input;
    }
    
    public static int[][] inputMatrix(String name, int rows, int cols, Scanner scanner) {
        System.out.println("\n------------------------------------");
        System.out.println("   ENTERING VALUES FOR " + name + ":");
        System.out.println("------------------------------------");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Preview of " + name + ":");
                displayMatrix(matrix);
                System.out.println("\n------------------------------------");
                matrix[i][j] = getValidInput("Enter value at position [" + (i + 1) + "][" + (j + 1) + "]: ", scanner);
                System.out.println("------------------------------------");
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("-------+");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d  | ", matrix[i][j]);
            }
            System.out.println();
            System.out.print("+");
            for (int j = 0; j < cols; j++) {
                System.out.print("-------+");
            }
            System.out.println();
        }
    }
    
    public static int determinantMatrices(int[][] matrix){
        int rows = matrix.length;
        int det = 0;
        int x,y,z;
        
        switch (rows){
            case 1:
                det = matrix[0][0];
                return det;
                
            case 2:
                det = (matrix[0][0] * matrix [1][1]) - (matrix[0][1] * matrix [1][0]);
                return det;
                
            case 3:
                x = matrix[0][0] * (matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1]);
                y = matrix[0][1] * (matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0]);
                z = matrix[0][2] * (matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
                
                det = x-y+z;
                return det;

        } 
        return det;
    }
}
