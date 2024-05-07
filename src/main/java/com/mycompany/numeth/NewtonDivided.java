    package com.mycompany.numeth;

    /**
     *
     * @author eurek
     * oki na
     */

    import java.util.Scanner;

    public class NewtonDivided {

        public static void NewtonMethod(Scanner input) {
            // Calls for input from Interpolation.java
            Interpolation interpolation = new Interpolation();
            interpolation.InterpolationInput();

            double[] x = interpolation.getX();
            double[] fx = interpolation.getFx();
            double xToFind = interpolation.getXToFind();

            int n = x.length;
            
            // Calculate divided differences
            double[][] dividedDifferences = new double[n][n];
            for (int i = 0; i < n; i++) {
                dividedDifferences[i][0] = fx[i];
            }

            for (int j = 1; j < n; j++) {
                for (int i = 0; i < n - j; i++) {
                    dividedDifferences[i][j] = (dividedDifferences[i + 1][j - 1] - dividedDifferences[i][j - 1]) / (x[i + j] - x[i]);
                }
            }

            // Display the divided differences table
            System.out.println("\nx\tf(x)\t\t?y\t\t?^2y\t\t?^3y\t\t...(?^(n-1)y)");
            for (int i = 0; i < n; i++) {
                System.out.print(x[i] + "\t" + fx[i] + "\t\t");
                for (int j = 0; j < n - i; j++) {
                    System.out.print(dividedDifferences[i][j] + "\t\t");
                }
                System.out.println();
            }

            // Print the interpolation polynomial
            System.out.println("\nInterpolation polynomial:");
            System.out.print("f(" + xToFind + ") = ");
            for (int i = 0; i < n; i++) {
                System.out.print(dividedDifferences[0][i]);
                if (i > 0) {
                    System.out.print("(" + xToFind + "- " + x[i - 1] + ")");
                }
                if (i < n - 1) {
                    System.out.print(" + ");
                }
            }

            // Calculate Newton's polynomial; does it by term
            // for is dependent on the values
            double result = fx[0];
            double term = 1;
            for (int i = 1; i < n; i++) {
                term *= (xToFind - x[i - 1]);
                result += (dividedDifferences[0][i] * term);
            }

            // Display the result
            System.out.println("\n\nf(" + xToFind + ") = " + result);

        }
    }
