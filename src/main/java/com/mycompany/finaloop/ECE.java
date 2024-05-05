package com.mycompany.finaloop;

import java.util.Scanner;

public class ECE {
    
    public static void LessonsInECE(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 3){
            System.out.println("\nWhat lesson in ECE do you want to learn?\n"
                    + "1. Basic Circuitries\n"
                    + "2. Diode Application\n"
                    + "3. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    BasicCircuitries bc = new BasicCircuitries();
                    
                    bc.ChoiceBasicCircuitries();
                    break;
                    
                case 2:
                    DiodeApplication da = new DiodeApplication();
                    
                    da.ChoicesDiodeApplication();
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
