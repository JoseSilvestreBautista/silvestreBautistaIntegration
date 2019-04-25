
/**
 * This class describes vehicles driven.
 * 
 * @author Jose Silvestre-Bautista
 *
 */
public class Car extends Vehicle { // this is derived class or sub class
  // This class inherits the fields and methods of class Vehicle because of the word extends.
  private String model;
  private String make;
  private int year;



  /**
   * This Constructor is for jose.
   * 
   * @param model variation of the make.
   * @param make company who made the car.
   * @param vehicleName nickname for the car.
   */
  public Car(String model, String make, String vehicleName) {
    this.model = model;
    this.make = make;
    super.setVehicleName(vehicleName);
    // this allows us to place our input in the Vehicle class even thought the field is private
  }

  /**
   * This constructor is for momscar.
   * 
   * @param model is a variation of the make.
   * @param make the company who created the car.
   * @param year the time the car was created.
   * @param topSpeed the top speed the car can reach.
   */
  public Car(String model, String make, int year, int topSpeed) {
    this.make = make;
    this.model = model;
    this.year = year;
    super.setTopSpeed(topSpeed);
  }

  public Car() {

  }

  /**
   * This prints the info from moms car.
   */
  public void momCarStats() {
    System.out.println("My mom has a " + make + " " + model + " " + year + " "
        + "and it has a top speed of" + " " + super.getTopSpeed() + "mph.");

  }

  public void printCarStats() {
    System.out.println("I have a " + make + " " + model + " " + "and my car's name is "
        + super.getVehicleName() + ".");
  }
}
