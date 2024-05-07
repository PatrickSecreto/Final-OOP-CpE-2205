package numeth;

/*
 *
 * @author eurek
 * OK NA. NO EXTERNAL CLASS NEEDED
*
*/

// SIGNIIFCANT FI,GURE COUNTER

import java.util.Scanner;

public class SigFigs {
    public static void evaluateSigFigs(Scanner input) {
        // Input number as a string
        System.out.print("Enter a number: ");
        String numberString = input.nextLine();

        // Remove leading and trailing zeros
        numberString = numberString.replaceAll("^0+(?!\\.|$)", "").replaceAll("0+$", "");

        // Initialize significant figures count
        int significantFigures = 0;

        // Count significant figures before decimal point
        int beforeDecimal = 0;
        while (beforeDecimal < numberString.length() && numberString.charAt(beforeDecimal) != '.') {
            if (Character.isDigit(numberString.charAt(beforeDecimal))) {
                significantFigures++;
            }
            beforeDecimal++;
        }

        // If there is a decimal point, include the figures after it
        if (beforeDecimal < numberString.length()) {
            int afterDecimal = beforeDecimal + 1;
            while (afterDecimal < numberString.length() && Character.isDigit(numberString.charAt(afterDecimal))) {
                significantFigures++;
                afterDecimal++;
            }
        }

        // Print the count of significant figures
        System.out.println("Number of Significant Figures: " + significantFigures);
    }
}
