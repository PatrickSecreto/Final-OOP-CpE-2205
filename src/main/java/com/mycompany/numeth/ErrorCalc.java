/*
*
*
* @author eurek
* ALL OKAY. CALLS FOR RELATIVE ERROR, APPROXIMATE & THE PERCENTAGES
*/
package numeth;

import java.util.Scanner;

public class ErrorCalc {
    public static void computeErrors(Scanner input) {
        float trueval, approx;
        System.out.print("Enter the true value: ");
        trueval = input.nextFloat();
        System.out.print("Enter the approximate value: ");
        approx = input.nextFloat();
        
        System.out.println("Choose an error to compute:");
        System.out.println("1. Percent Relative Error");
        System.out.println("2. Approximate Error");
        int errorop = input.nextInt();
        
        switch (errorop) {
            case 1:
                float Et_percent = ErrorCalc.relativeError(trueval, approx);
                System.out.println("Et percent: " + Et_percent);
                break;
            case 2:
                float Ea_percent = ErrorCalc.approximateError(trueval, approx);
                System.out.println("Ea percent: " + Ea_percent);
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }
    
    public static float relativeError(float trueval, float approx) {
        return (trueval - approx) / trueval * 100;
    }

    public static float approximateError(float trueval, float approx) {
        return trueval - approx;
    }
}



