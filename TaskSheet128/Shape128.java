package TaskSheet128;

public class Shape128 {
    public static void main(String[] args) {
        Circle circ = new Circle("Pink", 2.5);
        Rectangle rec = new Rectangle("Purple", 4.2, 5.3);
    
        System.out.println("Area of Circle: " + circ.calculateArea());
        System.out.println("Perimeter of Circle: " + circ.calculatePerimeter());
    
        System.out.println("Area of Rectangle: " + rec.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rec.calculatePerimeter());
      }
    
    }
    
    interface Shape {
      double calculateArea();
    
      double calculatePerimeter();
    }
    
    abstract class AbstractShape implements Shape {
      protected String color;
      protected double length;
      protected double width;
    
      AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
      }
    
      public abstract double calculateArea();
    
      public abstract double calculatePerimeter();
    }
    
    class Rectangle extends AbstractShape {
    
      Rectangle(String color, double length, double width) {
        super(color, length, width);
      }
    
      public double calculateArea() {
        return length * width;
      }
    
      public double calculatePerimeter() {
        return (2 * length) + (2 * width);
      }
    
    }
    
    class Circle extends AbstractShape {
      private final double radius;
    
      Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
      }
    
      public double calculateArea() {
        return Math.PI * radius * radius;
      }
    
      public double calculatePerimeter() {
        return 2 * Math.PI * radius;
      }
    }
