package com.mycompany.finaloop;

import java.util.Scanner;

public class DiodeApplication {
    
    public void ChoicesDiodeApplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Diode Applications!");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat do you want to learn from Diode Application? \n"
                    + "1. Rectifiers\n"
                    + "2. Clippers\n"
                    + "3. Clampers\n"
                    + "4. Quit");
            
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    rectifierChoice();
                    break;
                case 2:
                    clipperChoice();
                    break;
                case 3:
                    clamperDescChoice();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
    
    public static void rectifierChoice(){
        
    }
    
    public static void clipperChoice(){
        
    }
    
    public static void clamperDescChoice(){
        
    }
}
