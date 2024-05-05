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
                    ChoiceErrorComputation();
                    break;
                    
                case 2:
                    ChoicesBracketingMethod();
                    break;
                    
                case 3:
                    ChoicesOpenMethod();
                    break;    
                    
                case 4:
                    break;
                
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
    
    
    public static void ChoiceErrorComputation(){
        
    }
    
    
    public static void ChoicesBracketingMethod(){
        
    }
    
    
    public static void ChoicesOpenMethod(){
        
    }
}
