package com.mycompany.finaloop;

import java.util.Scanner;

public class NumericalMathematics {
    
    public static void LessonsInNumMath(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat lesson in Numerical Mathematics do you want to learn?\n"
                    + "1. Error Computations\n"
                    + "2. Bracketing Methods\n"
                    + "3. Open Methods\n"
                    + "4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    ErrorComputation ec = new ErrorComputation();
                    
                    ec.ChoiceErrorComputation();
                    break;
                    
                case 2:
                    BracketingMethod bm = new BracketingMethod();
                    
                    bm.ChoicesBracketingMethod();
                    break;
                    
                case 3:
                    OpenMethod om = new OpenMethod();
                    
                    om.ChoicesOpenMethod();
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
