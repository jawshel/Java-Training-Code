package TaskSheet121;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.InputMismatchException;

  public class MathOperations {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);

    int num1, num2;
    System.out.println();

    try {

      System.out.print("Enter first number: ");
      num1 = iScanner.nextInt();
      System.out.print("Enter second number: ");
      num2 = iScanner.nextInt();

      System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

      System.out.print("Sum:\t\t");
      System.out.println(add(num1, num2));

      System.out.print("Difference:\t");
      System.out.println(subtract(num1, num2));

      System.out.print("Product:\t");
      System.out.println(multiply(num1, num2));

      System.out.print("Quotient:\t");
      System.out.println(divide(num1, num2));

      System.out.println("\n Math Operations Computed");
    } catch (InputMismatchException e) {
      iScanner.next();
      System.out.println("Invalid input.");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    
    } finally {
      iScanner.close();
    }
  }

  public static int add(int a, int b) {
    return addExact(a, b);
  }

  public static int subtract(int a, int b) {
    return subtractExact(a, b);
  }

  public static int multiply(int a, int b) {
    return multiplyExact(a, b);
  }

  public static float divide(int a, int b) throws ArithmeticException {
    return floorDiv(a, b);
  }

}