package Java.seminars.seminar_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static String getSolution(String equation) {
        String[] parts = equation.split(" = ");
        String newEquation = parts[0];
        int target = Integer.parseInt(parts[1]);

        for (int digit = 0; digit < 10; digit++) {
            try {
                String modifiedEquation = newEquation.replace("?", String.valueOf(digit));
                if (evaluateExpression(modifiedEquation) == target) {
                    return String.format("Given the equation: %s\nResult: %s = %d", equation, modifiedEquation, target);
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }

        return "No solution";
    }

    private static int evaluateExpression(String expression) {
        // Пример простой реализации вычисления арифметического выражения
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + operator);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String example1 = "? + 8 = 16";
        String example2 = "2? + 2? = 45";
        String example3 = "?20 + ?70 = 690";

        System.out.println(getSolution(example1));
        System.out.println(getSolution(example2));
        System.out.println(getSolution(example3));
    }
}