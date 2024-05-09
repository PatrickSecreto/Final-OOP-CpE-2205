package com.mycompany.numeth;
import java.util.Scanner;

/**
 *
 * @author eurek
 * CALLS ALL NEEDED CLASSES
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Compute Errors");
        System.out.println("2. Significant Figures");
        System.out.println("\n - BRACKETING METHODS -");
        System.out.println("3. Bisection Method");
        System.out.println("4. False Position Method");
        System.out.println("\n - INTERPOLATION METHODS -");
        System.out.println("5. Newton's Divided Difference (Linear, Quadratic, 3rd Degree Onwards)");
        System.out.println("6. LagRange Interpolation");

        int option = 0;
        while (option < 1 || option > 3) {
            System.out.print("\n----------------------\n");
            System.out.print("Enter your choice: ");
            if (input.hasNextInt()) {
                option = input.nextInt();
                input.nextLine(); // Consume newline character
            } else {
                input.nextLine(); // Manage invalid input
            }
            
            switch (option) {
                case 1:
                    ErrorCalc.computeErrors(input);
                    break;
                case 2:
                    SigFigs.evaluateSigFigs(input);
                    break;
                case 3:
                    Bisection.bisectionMethod(input);
                    break;
                case 4:
                    FalsePosition.falseposMethod(input);
                    break;
                case 5:
                    NewtonDivided.NewtonMethod(input);
                    break;
                case 6:
                    LagRange.LagRangeMethod(input);
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }
}

