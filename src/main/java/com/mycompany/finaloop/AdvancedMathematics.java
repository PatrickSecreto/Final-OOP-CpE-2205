package com.mycompany.finaloop;

import java.util.Scanner;

public class AdvancedMathematics {
    
    public static void LessonsInAdvancedMath(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 3){
            System.out.println("\nWhat lesson in Numerical Mathematics do you want to learn?\n"
                    + "1. Add, Subtract or Multiply Matrices\n"
                    + "2. Determinants of Matrices\n"
                    + "3. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    AddSubtractMultiplyMatrices asm = new AddSubtractMultiplyMatrices();
                    
                    asm.ChoiceAddSubtractMultiplyMatrices();
                    break;
                    
                case 2:
                    int dchoice = 0;
                    while (dchoice != 3){
                        System.out.println("\nDeterminants: Calculate for?\n"
                                    + "1. Information about Determinants\n"
                                    + "2. Determinant Calculator\n"
                                    + "3. Back");
                        
                        System.out.print("\nEnter your choice: ");
                        dchoice = scanner.nextInt();
                        
                        switch(dchoice){
                            case 1:
                                System.out.println("\nThe determinant is a special number that can be calculated from \n"
                                                 + "a matrix. The determinant helps us to find the inverse of a matrix, \n"
                                                 + "telling us things about the matrix that are useful in systems of \n"
                                                 + "linear equations, calculus and more.");
                                break;
                                
                            case 2:
                                DeterminantMatrices dm = new DeterminantMatrices();
                                dm.ChoiceDeterminantMatrices();
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;    
                    
                case 3:
                    break;
                
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
}