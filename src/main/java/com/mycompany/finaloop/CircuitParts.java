
package com.mycompany.circuitsfordummies;

import java.util.Scanner;

public class CircuitParts {
    Scanner scanner = new Scanner(System.in);
        
    public void circuitPartsChoice(){
        int choice = 0;
        
        while (choice != 7){
            System.out.println("\nWhat part of circuits do you want to learn?:\n"
                    + "1. Breadboard \n" 
                    + "2. Resistors\n" 
                    + "3. Capacitors\n" 
                    + "4. Transistors (PNP, NPN)\n" 
                    + "5. Diodes (LED, Sensors, etc.)\n" 
                    + "6. Jumper Wires\n" 
                    + "7. Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("description abt breadboard");
                    break;
                case 2:
                    System.out.println("description abt resistors");
                    break;
                case 3:
                    System.out.println("description abt capacitors");
                    break;
                case 4:
                    System.out.println("description abt transistors");
                    break;
                case 5:
                    System.out.println("description abt diodes");
                    break;
                case 6:
                    System.out.println("description abt jumper wires");
                    break;
                case 7:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
            }
        }
    } 
}
