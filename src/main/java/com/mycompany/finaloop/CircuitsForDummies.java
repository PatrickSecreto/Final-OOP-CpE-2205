package com.mycompany.circuitsfordummies;

import java.util.Scanner;

public class CircuitsForDummies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Circuits Dummies!\n");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("What do you want to learn today? \n"
                    + "1. Circuitry Parts\n"
                    + "2. Parallel Circuits\n"
                    + "3. Series Circuits\n"
                    + "4. Quit\n");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    CircuitParts cp = new CircuitParts();
                    
                    cp.circuitPartsChoice();
                    break;
                case 2:
                    ParallelDesc p = new ParallelDesc();
                    
                    p.parallelDescChoice();
                    break;
                case 3:
                    SeriesDesc c = new SeriesDesc();
                    
                    c.seriesDescChoice();
                    break;
                case 4:
                    System.out.println("Thank you for using Circuit for Dummies!");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
}
