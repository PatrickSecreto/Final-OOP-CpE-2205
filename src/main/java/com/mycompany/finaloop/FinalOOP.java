package com.mycompany.finaloop;

import java.util.Scanner;
import com.mycompany.numeth.Main;

public class FinalOOP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("| WELCOME TO COMPUTER ENGINEERING 2ND SEMESTER STARTER PACK FOR MATHEMATICS SUBJECTS! |");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat subject do you want to learn?\n"
                    + "1. ECE\n"
                    + "2. Advanced Mathematics\n"
                    + "3. Numerical Mathematics\n"
                    + "4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    ECE ece = new ECE();
                    
                    ece.LessonsInECE();
                    break;
                case 2:
                    AdvancedMathematics am = new AdvancedMathematics();
                    
                    am.LessonsInAdvancedMath();
                    break;
                case 3:
                    Main nm = new Main();
                    
                    nm.main(args);
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
