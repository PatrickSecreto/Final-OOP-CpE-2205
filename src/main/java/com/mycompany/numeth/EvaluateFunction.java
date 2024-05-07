/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeth;

/**
 *
 * @author eurek
 */

import com.fathzer.soft.javaluator.DoubleEvaluator; // External library (JAR File) to handle equation from string to usable code. (pwede ba ito? hehe)

public class EvaluateFunction {

    private static final DoubleEvaluator EVALUATOR = new DoubleEvaluator();

    public static double evaluate(String equation, double x) {
        // Replace 'x' in the equation with the given value
        String equationWithX = equation.replace("x", String.valueOf(x));

        // Evaluate the modified equation using Javaluator
        return EVALUATOR.evaluate(equationWithX);
    }
}
