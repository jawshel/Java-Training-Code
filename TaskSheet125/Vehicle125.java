package TaskSheet125;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Vehicle125 {

  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    String make, model;
    int year, numberOfDoors;

    try {
      System.out.print("Enter Car Make: ");
      make = iScanner.nextLine();
      System.out.print("Enter Car Model: ");
      model = iScanner.nextLine();
      System.out.print("Enter Manufacturing Year: ");
      year = iScanner.nextInt();
      System.out.print("Enter Number of Doors: ");
      numberOfDoors = iScanner.nextInt();

      System.out.println();

      Car car = new Car(make, model, year, numberOfDoors);

      car.displayDetails();
    } catch (InputMismatchException e) {
      iScanner.next();
      System.out.println("Invalid input.");
    } finally {
      iScanner.close();
    }
  }

}


class Vehicle {

  private final String make;
  private final String model;
  private final int year;

  Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

}

class Car extends Vehicle {
  private final int numberOfDoors;

  Car(String make, String model, int year, int numberOfDoors) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void displayDetails() {
    System.out.println(this);
  }

  public String toString() {
    return "Car Details:\n" +
            "Make: " + getMake() + "\n" +
            "Model: " + getModel() + "\n" +
            "Year: " + getYear() + "\n" +
            "Number of Doors: " + numberOfDoors;
  }
}