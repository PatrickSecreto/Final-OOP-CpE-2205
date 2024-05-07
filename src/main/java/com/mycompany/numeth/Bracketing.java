package numeth;

/**
 *
 * @author eurek
 * Input for Bracketing methods: Bisection & False position
 * 
 */

import java.util.Scanner;

public class Bracketing {

    public static double xl, xu, Ea_percentage;
    public static String equation;

    public static void BracketingInput(Scanner input) {
        System.out.print("Enter the equation in terms of x: ");
        equation = input.nextLine(); // Read the equation 

        System.out.print("Enter the lower bound (xl): ");
        xl = input.nextDouble();

        System.out.print("Enter the upper bound (xu): ");
        xu = input.nextDouble();

        System.out.print("Enter the desired percentage relative error (Ea_percentage): ");
        Ea_percentage = input.nextDouble();

        // Printing table; not needed but para lang makita kung nagana talaga
        System.out.println("Iteration   xl      xm      xu      f(xl)     f(xm)     f(xu)      Ea");
        System.out.println("------------------------------------------------------------------------");
    }

    public static double evaluateFunction(double x) {
        // Call evaluate function from EvaluateFunction class
        return EvaluateFunction.evaluate(equation, x);
    }
}

