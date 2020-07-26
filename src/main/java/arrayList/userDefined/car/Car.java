package arrayList.userDefined.car;

public class Car {
  public String brand;
  public String numPlate;
  public int noOfDoors;

  public Car(String brand, String numPlate, int noOfDoors) {
    this.brand = brand;
    this.numPlate = numPlate;
    this.noOfDoors = noOfDoors;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", numberPlate='" + numPlate + '\'' +
        ", noOfDoors=" + noOfDoors +
        '}';
  }
}
