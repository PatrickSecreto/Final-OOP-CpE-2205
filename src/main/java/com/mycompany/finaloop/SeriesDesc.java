package com.mycompany.circuitsfordummies;

import java.util.Scanner;

public class SeriesDesc {
    Scanner scanner = new Scanner(System.in);
    
    public void seriesDescChoice(){
        int choice = 0;
        
        while (choice != 5){
            System.out.println("\nCircuit design for Series Circuits:");
            System.out.println(" --------------{  }---------------\n"
                             + " |                               |\n"
                             + " |                               |\n"
                             + "___                              |\n"
                             + " _                              { }\n"
                             + "___                             { }\n"
                             + " _                               |\n"
                             + " |                               |\n"
                             + " |                               |\n"
                             + " --------------{  }---------------");

            System.out.println("\nWhat do you want to learn about series circuits?\n"
                    + "1. How to calculate Voltage?\n" 
                    + "2. How to calculate Current?\n" 
                    + "3. How to calculate Resistance of each resistor?\n"
                    + "4. Calculator for Series Circuits\n"
                    + "5. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Formula for voltage in series circuits:");
                    break;
                case 2:
                    System.out.println("Formula for current in series circuits:");
                    break;
                case 3:
                    System.out.println("Formula for resistance in series circuits:");
                    break;
                case 4:
                    seriesCalculator();
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
    
    public void seriesCalculator(){
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nSeries: What do you want to compute?\n"
                    + "1. Resistance\n"
                    + "2. Voltage\n"
                    + "3. Current\n"
                    + "4. Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                // Resistance
                case 1:
                    System.out.println("\nSeries: What do you want to know the resistance of?\n"
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
                                
                                totalResistance += r;
                            }
                            System.out.println("\nTotal Resistance: " + totalResistance + " ohms");
                            break;
                            
                        case 2:
                            System.out.print("\nVoltage in that specific resistor (V): ");
                            float voltageOfResistor = scanner.nextFloat();
                            
                            System.out.print("Total Current (Ieq): ");
                            float totalI = scanner.nextFloat();
                            
                            float resistanceOfResistor = voltageOfResistor/totalI;
                            
                            System.out.println("Resistance of that specific resistor: " + resistanceOfResistor + " ohms");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Voltage    
                case 2:
                    System.out.println("\nSeries: What do you want to know the voltage of?\n"
                            + "1. Total Voltage (Veq)\n"
                            + "2. Voltage of a specific resistor");
                    
                    System.out.print("Enter your choice: ");
                    int vChoice = scanner.nextInt();
                    
                    switch (vChoice){
                        case 1:
                            float totalV = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();
                            
                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the voltage of Resistor " + i + ": ");
                                float r = scanner.nextFloat();
                                
                                totalV += r;
                            }
                            System.out.println("\nTotal Voltage: " + totalV + " V");
                            break;
                            
                        case 2:
                            System.out.print("\nTotal Current (Ieq): ");
                            float totalI = scanner.nextFloat();
                            
                            System.out.print("Resistance in the specific resistor (R): ");
                            float resistanceOfResistor = scanner.nextFloat();
                            
                           float voltageOfResistor = totalI*resistanceOfResistor;
                            
                            System.out.println("\nVoltage of the specific resistor: " + voltageOfResistor + " V");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Current    
                case 3:
                    System.out.println("\nSince Ieq = I1 = I2 +..., Current of the whole series circuit is the same.");
                    
                    System.out.println("\nTotal Current Calculator:");
                    System.out.print("Total Voltage: ");
                    float totalVoltage = scanner.nextFloat();
                    
                    System.out.print("Total Resistance: ");
                    float totalResistance = scanner.nextFloat();
                    
                    float totalCurrent = totalVoltage/totalResistance;
                    System.out.println("\nTotal Current: " + totalCurrent + " A");
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