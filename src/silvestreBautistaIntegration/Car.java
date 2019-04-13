
public class Car extends Vehicle {

  private String model;
  private String make;
  private int year;

  public Car(String model, String make, String vehicleName) {
    this.model = model;
    this.make = make;
    super.setVehicleName(vehicleName);
  }

  public Car(String model, String make, int year, int topSpeed) {
    this.make = make;
    this.model = model;
    this.year = year;
    super.setTopSpeed(topSpeed);
  }

  public Car() {

  }

  public void momCar() {
    System.out.println("My mom has a " + make + " " + model + " " + year + " "
        + "and it has a top speed of" + " " + super.getTopSpeed() + "mph.");

  }

  public void printCarStats() {
    System.out.println("I have a " + make + " " + model + " " + "and my car's name is "
        + super.getVehicleName() + ".");
  }
}
