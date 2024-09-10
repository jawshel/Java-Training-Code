package TaskSheet119;

import java.util.Scanner;

public class Arithmetic{

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("first number: ");
        double num1 = input.nextDouble();

        System.out.print("second number: ");
        double num2 = input.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + difference);
        System.out.println("Multiplication result: " + product);
        System.out.println("Division result: " + quotient);

        input.close();
    }



}
