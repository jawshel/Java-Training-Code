package TaskSheet129;

public class Gorilla129 {
  public static void main(String[] args) {
    Gorilla gori = new Gorilla();
    gori.groom();
    if (gori.feed(true)) {
      System.out.println("Gorilla fed.");
    }
    try {
      gori.pet();
    } catch (GorillafartException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
  }
}

interface Animal {
  boolean feed(boolean timeToEat);

  void groom();

  void pet();
}

class Gorilla implements Animal {

  public boolean feed(boolean timeToEat) {
    // put gorilla food into cage
    return true;
  }

  public void groom() {
    // lather, rinse, repeat
  }

  public void pet() throws GorillafartException {
    // pet at your own risk
    double goriPettingSkills = Math.random() * 100;

    if (goriPettingSkills > 75) return;

    throw new GorillafartException();
  }

}

class GorillafartException extends RuntimeException {
  GorillafartException() {
    super("Gorilla Fart so Bad.");
  }
}