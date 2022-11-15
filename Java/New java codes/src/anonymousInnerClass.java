abstract class CovidPatient {
  abstract void eatNDrink();
}

public class anonymousInnerClass {
    public static void main(String args[]) {
      CovidPatient cv = new CovidPatient()
      {
        void eatNDrink()
      {
        System.out.println("Eat healthy");
        System.out.println("Drink healthy");
      }
    };
   cv.eatNDrink();
  }
}

