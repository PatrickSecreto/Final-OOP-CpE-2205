package com.mycompany.numeth;

/**
 *
 * @author eurek
 * oki na
 */

import java.util.Scanner;

public class LagRange {

    public static void LagRangeMethod(Scanner input) {
        // Calls for the input from Interpolation.java
        Interpolation interpolation = new Interpolation();
        interpolation.InterpolationInput();

        double[] x = interpolation.getX();
        double[] fx = interpolation.getFx();
        double xToFind = interpolation.getXToFind();

        int n = x.length;

        // Calculate Lagrange interpolation polynomial
        System.out.print("Lagrange interpolation polynomial: f(x) = ");
        double result = 0; // Define the result variable
        for (int i = 0; i < n; i++) {
            double term = fx[i];
            double totimes = 1;
            System.out.print("(");
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    totimes *= (xToFind - x[j]) / (x[i] - x[j]);
                    if (x[j] == 0) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("(x - " + x[j] + ")");
                    }
                    System.out.print(" / ");
                    if (x[i] == 0) {
                        System.out.print("(x)");
                    } else {
                        System.out.print("(" + x[i] + " - " + x[j] + ")");
                    }
                }
            }
            System.out.print(")");
            if (i < n - 1) {
                System.out.print(" + ");
            }
            result += totimes * term; // Update the result within the loop
        }
        // Display the result
        System.out.println("\nf(" + xToFind + ") = " + result);
    }
}
