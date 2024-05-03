package com.mycompany.circuitsfordummies;

import java.util.Scanner;

public class ParallelDesc {
    Scanner scanner = new Scanner(System.in);
    
    public void parallelDescChoice(){
        int choice = 0;
        
        while (choice != 5){
            System.out.println("\nCircuit design for Parallel Circuits:");
            System.out.println(" ---------------------------------\n"
                             + " |        |           |          |\n"
                             + " |        |           |          |\n"
                             + "___       |           |          |\n"
                             + " _       { }         { }        { }\n"
                             + "___      { }         { }        { }\n"
                             + " _        |           |          |\n"
                             + " |        |           |          |\n"
                             + " |        |           |          |\n"
                             + " ---------------------------------");

            System.out.println("\nWhat do you want to learn about parallel circuits?\n"
                    + "1. How to calculate Voltage?\n" 
                    + "2. How to calculate Current?\n" 
                    + "3. How to calculate Resistance of each resistor?\n"
                    + "4. Calculator for Parallel Circuits\n"
                    + "5. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Formula for voltage in parallel circuits:");
                    break;
                case 2:
                    System.out.println("Formula for current in parallel circuits:");
                    break;
                case 3:
                    System.out.println("Formula for resistance in parallel circuits:");
                    break;
                case 4:
                    parallelCalculator();
                    break;
                case 5:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    
    public void parallelCalculator(){
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nParallel: What do you want to compute?\n"
                    + "1. Resistance\n"
                    + "2. Voltage\n"
                    + "3. Current\n"
                    + "4. Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                // Resistance
                case 1:
                    System.out.println("\nParallel: What do you want to know the resistance of?\n"
                            + "1. Total Resistance (Req)\n"
                            + "2. Resistance of a specific resistor");
                    
                    System.out.print("Enter your choice: ");
                    int rChoice = scanner.nextInt();
                    
                    switch (rChoice){
                        case 1:
                            float totalResistance = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();
                            
                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the resistance of Resistor " + i + ": ");
                                float r = scanner.nextFloat();
                                
                                totalResistance += 1/r;
                            }
                            
                            totalResistance = 1/totalResistance;
                            
                            System.out.println("\nTotal Resistance: " + totalResistance + " ohms");
                            break;
                            
                        case 2:
                            System.out.print("\nTotal Voltage (Veq): ");
                            float totalV = scanner.nextFloat();
                            
                            System.out.print("Current in the specific resistor (I): ");
                            float currentOfResistor = scanner.nextFloat();
                            
                            float resistanceOfResistor = totalV/currentOfResistor;
                            
                            System.out.println("\nResistance of that specific resistor: " + resistanceOfResistor + " ohms");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Voltage    
                case 2:
                    System.out.println("\nSince Veq = V1 = V2 +..., Voltage of the whole parallel circuit is the same.");
                    
                    System.out.println("\nTotal Voltage Calculator:");
                    System.out.print("Total Current: ");
                    float totalCurrent = scanner.nextFloat();
                    
                    System.out.print("Total Resistance: ");
                    float totalResistance = scanner.nextFloat();
                    
                    float totalVoltage = totalCurrent*totalResistance;
                    System.out.println("\nTotal Voltage: " + totalVoltage + " V");
                    break;
                    
                // Current    
                case 3:
                    System.out.println("\nParallel: What do you want to know the current of?\n"
                            + "1. Total Current (Ieq)\n"
                            + "2. Current of a specific resistor");
                    
                    System.out.print("Enter your choice: ");
                    int iChoice = scanner.nextInt();
                    
                    switch (iChoice){
                        case 1:
                            float totalC = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();
                            
                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the current of Resistor " + i + ": ");
                                float r = scanner.nextFloat();
                                
                                totalC += r;
                            }
                            System.out.println("\nTotal Current: " + totalC + " A");
                            break;
                            
                        case 2:
                            System.out.print("\nTotal Voltage (Veq): ");
                            float totalV = scanner.nextFloat();
                            
                            System.out.print("Resistance in the specific resistor (R): ");
                            float resistanceOfResistor = scanner.nextFloat();
                            
                            float currentOfResistor = totalV/resistanceOfResistor;
                            
                            System.out.println("\nCurrent of the specific resistor: " + currentOfResistor + " A");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Exit
                case 4:
                    break;
                    
                // Invalid Input
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
}
