
public class YearClassification {


  private int credits;
  private int firstYear;

  public YearClassification() {
    credits = 0;

  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public int getCredits() {
    return credits;
  }

  public void print() {

    String classification;
    if (credits <= 30) {
      System.out.println("You are a Freshmen.");
    } else if (credits <= 60) {
      System.out.println("You are a Sophomore.");
    } else if (credits <= 90) {
      System.out.println("You are a Junior.");
    } else if (credits <= 120) {
      System.out.println("You are a Senior.");
    } else {
      System.out.println("Error");
    }

  }

}
