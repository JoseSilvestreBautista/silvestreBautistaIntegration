// Jose Silvestre-Bautista
public class YearClassification {

  private int credits;

  public YearClassification() {
    credits = 0;

  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public int getCredits() {
    return credits;
  }

  /**
   * This method prints your classification based on the credits entered.
   */
  public void print() {

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
