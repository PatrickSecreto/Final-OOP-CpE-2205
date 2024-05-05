package com.mycompany.finaloop;

import java.util.Scanner;

public class AdvancedMathematics {
    
    public static void LessonsInAdvancedMath(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat lesson in Numerical Mathematics do you want to learn?\n"
                    + "1. Add or Subtract Matrices\n"
                    + "2. Multiply Matrices\n"
                    + "3. Determinants of Matrices\n"
                    + "4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    AddingSubtractingMatrices am = new AddingSubtractingMatrices();
                    
                    am.ChoiceAddingSubtractingMatrices();
                    break;
                    
                case 2:
                    MultiplyingMatrices mm = new MultiplyingMatrices();
                    
                    mm.ChoicesMultiplyingMatrices();
                    break;
                    
                case 3:
                    DeterminantsOfMatrices dm = new DeterminantsOfMatrices();
                    
                    dm.ChoicesDeterminantsOfMatrices();
                    break;    
                    
                case 4:
                    break;
                
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
}
