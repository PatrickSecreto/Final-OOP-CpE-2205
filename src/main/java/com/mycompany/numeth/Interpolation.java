
package com.mycompany.numeth;

/**
 *
 * @author eurek
 * File for managing input of interpolation; avoid repeating code between NewtonDivided & LagRange
 */

import java.util.Scanner;

public class Interpolation {

    private double[] x;
    private double[] fx;
    private double xToFind;

    public void InterpolationInput() {
        Scanner input = new Scanner(System.in);

        // Get the number of data points
        System.out.print("Enter the number of data points: ");
        int n = input.nextInt();

        // Initialize arrays to store x and f(x) values
        x = new double[n];
        fx = new double[n];

        // Input x and f(x) values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + i + ": ");
            x[i] = input.nextDouble();
            System.out.print("Enter f(x" + i + "): ");
            fx[i] = input.nextDouble();
        }

        // Get the value of x to find f(x) for
        System.out.print("Enter the value of x to find f(x) for: ");
        xToFind = input.nextDouble();
    }

    // Getter methods
    public double[] getX() {
        return x;
    }

    public double[] getFx() {
        return fx;
    }

    public double getXToFind() {
        return xToFind;
    }
}
