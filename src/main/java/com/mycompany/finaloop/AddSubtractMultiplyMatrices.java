package com.mycompany.finaloop;

import java.util.Scanner;

public class AddSubtractMultiplyMatrices {
    
    public static void ChoiceAddSubtractMultiplyMatrices() {
        Scanner scanner = new Scanner(System.in);
        char operation;
        while (true) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("                OPERATIONS OF MATRICES");
            System.out.println("--------------------------------------------------------");
            System.out.println("A - Addition");
            System.out.println("S - Subtraction");
            System.out.println("M - Multiplication");
            System.out.println("--------------------------------------------------------");
            System.out.print("Choose the letter of the operation for your matrices: ");
            operation = scanner.next().toUpperCase().charAt(0);
            if (operation == 'A' || operation == 'S' || operation == 'M') {
                break;
            } else {
                    System.out.println("ERROR: Please choose ONLY the letters between the three options only.");
            }
        }

        // Prompt user to input number of rows for matrices
        int rowsA, colsA, rowsB, colsB;

        while (true) {
            rowsA = getValidInput("\nEnter number of rows for Matrix A: ", scanner);
            colsA = getValidInput("Enter number of columns for Matrix A: ", scanner);

            if (rowsA <= 0 || colsA <= 0){
                System.out.println("\nERROR: Matrices cannot have rows/colmuns of 0.");
                continue;
            }

            if (operation == 'M') {
                rowsB = getValidInput("\nEnter the number of rows for Matrix B: ", scanner);
                colsB = getValidInput("Enter the number of columns for Matrix B: ", scanner);

                if (colsA != rowsB) {
                    System.out.println("    >ERROR: Incompatible dimensions for matrix multiplication.");
                    System.out.println("    >NOTE: In MULTIPLICATION, the number of columns in the first matrix must be equal to the number of rows in the second matrix");
                    char newOperation;
                    while (true) {
                        System.out.println("\n--------------------------------------------------------");
                        System.out.println("A - Addition");
                        System.out.println("S - Subtraction");
                        System.out.println("M - Multiplication");
                        System.out.println("--------------------------------------------------------");
                        System.out.print("Choose the letter of the operation for your matrices: ");
                        newOperation = scanner.next().toUpperCase().charAt(0);
                        if (newOperation == 'A' || newOperation == 'S' || newOperation == 'M') {
                            operation = newOperation;
                            break;
                        } else {
                            System.out.println("ERROR: Please choose ONLY the letters between the three options only.");
                        }
                    }
                    continue;
                }
            } else {
                rowsB = rowsA;
                colsB = colsA;
            }
                
            // Input matrices
            int[][] matrixA = inputMatrix("Matrix A", rowsA, colsA, scanner);
            int[][] matrixB = inputMatrix("Matrix B", rowsB, colsB, scanner);

            // Display both of the matrices
            System.out.println("\n--------------------");
            System.out.println("  CURRENT MATRICES");
            System.out.println("--------------------");
            System.out.println("\nMATRIX A:");
            displayMatrix(matrixA);
            System.out.println("\nMATRIX B:");
            displayMatrix(matrixB);

            // Perform operation based on user's choice
            int[][] result = null;
            switch (operation) {
                case 'A' -> result = addMatrices(matrixA, matrixB);
                case 'S' -> result = subtractMatrices(matrixA, matrixB);
                case 'M' -> result = multiplyMatrices(matrixA, matrixB);
                default -> System.out.println("Invalid operation choice.");
            }
                
            if (result != null) {
                System.out.println("\n----------");
                System.out.println("  ANSWER:");
                System.out.println("----------");
                displayMatrix(result);
            }
            break;
        }
    }
    

    // Method to validate and get input from user
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

    // Method to input matrix values and display the matrix as it's being filled
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

    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix subtraction
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Display matrix with lines separating rows and columns
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
}
