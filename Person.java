class Vehicle {
  String brand;
  int speed;
  Vehicle(String brand,int speed){
    this.brand=brand;
    this.speed=speed;
  }
  void displayInfo(){
    System.out.println("Brand: " + brand);
    System.out.println("Speed: " + speed + " km/h");
  }
}
class Car extends Vehicle{
    int doors;
    Car(String brand,int speed,int doors){
      super(brand,speed);
      this.doors=doors;
    }
    void displayCar(){
      displayInfo();
      System.out.println("Doors: " + doors);
    }
}
class Bike extends Vehicle{
  boolean hasCarrier;
  Bike(String brand,int speed,boolean hasCarrier){
   super(brand,speed);
   this.hasCarrier=hasCarrier; 
  }
  void displayBike(){
    displayInfo();
     System.out.println("Has Carrier: " + hasCarrier);
  }
}

public class Person {
  public static void main(String[] args){
    Car car=new Car("Audi",150,4);
    System.out.println("Car Details:");
    car.displayCar();
    System.out.println();
    Bike bike=new Bike("Honda",90,true);
    System.out.println("Bike Details:");
    bike.displayBike();
  }
}