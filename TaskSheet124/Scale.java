package TaskSheet124;

public class Scale {

  public static void main(String[] args) {
    Point a = new Point(32, 32);
    for (int i = 0; i < 5; i++) {
      a.scale();
      a.print();
    }
  }

}

class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void print() {
    System.out.println("(" + x + "," + y + ")");
  }

  public void scale() {
    x = x / 2;
    y = y / 2;
  }
}