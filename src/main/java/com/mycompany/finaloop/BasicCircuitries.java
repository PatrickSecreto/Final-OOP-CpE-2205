package com.mycompany.finaloop;

import java.util.Scanner;

public class BasicCircuitries {

    public static void ChoiceBasicCircuitries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Basic Circuitries!");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat do you want to learn from Basic Circuitries? \n"
                    + "1. Circuitry Parts\n"
                    + "2. Parallel Circuits\n"
                    + "3. Series Circuits\n"
                    + "4. Quit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    circuitPartsChoice();
                    break;
                case 2:
                    parallelDescChoice();
                    break;
                case 3:
                    seriesDescChoice();
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
    
    public static void circuitPartsChoice(){
        Scanner scanner = new Scanner(System.in);
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
    
    public static void parallelDescChoice(){
        Scanner scanner = new Scanner(System.in);
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
    
    public static void parallelCalculator(){
        Scanner scanner = new Scanner(System.in);
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
    
    public static void seriesDescChoice(){
        Scanner scanner = new Scanner(System.in);
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
    
    public static void seriesCalculator(){
        Scanner scanner = new Scanner(System.in);
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
