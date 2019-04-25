// Jose Silvestre-Bautista
public class Vehicle {// this is a parent class or super class
  private int topSpeed;
  private String vehicleName;

  // all these are mutators and getters
  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public void setTopSpeed(int topSpeed) {
    this.topSpeed = topSpeed;
  }

  public int getTopSpeed() {
    return topSpeed;
  }


}
