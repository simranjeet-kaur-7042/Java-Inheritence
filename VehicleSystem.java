//Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
// Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.

class Vehicles{
    int maxSpeed;
    String model;

    Vehicles(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model + "\nMax Speed: " + maxSpeed + " km/h");
    }
}
class ElectricVehicle extends Vehicles{
    String color;
    boolean isCharging;
    ElectricVehicle(int maxSpeed, String model, String color) {
        super(maxSpeed, model);
        this.color = color;
        this.isCharging = true;
    }

    void charge() {
        isCharging = true;
        System.out.println(model + " is charging the battery.");
    }
   void displayInfo() {
        System.out.println("\n----Electric Vehicle Info----");
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Charging: " + (isCharging ? "Yes" : "No"));
    }
}

interface Refuelable{
 void refuel();
}

class PetrolVehicle extends Vehicles implements Refuelable{
    double fuelCapacity;
    PetrolVehicle(int maxSpeed, String model, double fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling petrol. Capacity: " + fuelCapacity + " liters.");
    }

    void displayInfo() {
        System.out.println("\n----Petrol Vehicle Info----");
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
class VehicleSystem{
    public static void main(String args[]){
        ElectricVehicle obj=new ElectricVehicle(150, "Tesla Model 3", "Red");
        PetrolVehicle obj2=new PetrolVehicle(180, "Honda Civic", 50);
        obj.displayInfo();
        obj.charge();

        obj2.displayInfo();
        obj2.refuel();
    }
}