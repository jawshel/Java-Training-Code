package TaskSheet115;

public class Task115 {

  public static void main(String[] args) {
    String A = new String("WOW");
    String B = "WOW";
    String C = A;
    String D = C;

    boolean B1 = A.equals(B);
    boolean B2 = !D.equals(B + "!");
    boolean B3 = C == A;
    if (B1 && B2 && B3) {
      System.out.println("SUCCESS!");
    }
  }

}