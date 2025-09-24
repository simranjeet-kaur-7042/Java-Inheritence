//Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
// Tasks:Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.

class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Fuel Type : "+fuelType);
    }
}
class Car extends Vehicle{
    private int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    void displayInfo(){
        System.out.println("----CAR DETAILS----");
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }

}
class Truck extends Vehicle{
    private int horsepower;
    Truck(int maxSpeed,String fuelType,int horsepower){
        super(maxSpeed,fuelType);
        this.horsepower=horsepower;
    }
    void displayInfo(){
        System.out.println("----TRUCK DETAILS----");
        super.displayInfo();
        System.out.println("Horse Power : "+horsepower+" hp");
    }
}
class Motorcycle extends Vehicle{
    private String model;
    Motorcycle(int maxSpeed,String fuelType,String model){
        super(maxSpeed,fuelType);
        this.model=model;
    }
    void displayInfo(){
        System.out.println("----MOTORCYCLE DETAILS----");
        super.displayInfo();
        System.out.println("Model : "+model);
    }
}
class VehicleDetails{
    public static void main(String args[]) {
        Vehicle c=new Car(180, "Petrol", 5);
        Vehicle t=new Truck(120, "Diesel", 400);
        Vehicle m =new Motorcycle(150, "Petrol", "Royal Enfield");
        Vehicle[] obj={c,m,t};

        for(int i=0;i<obj.length;i++){
           obj[i]. displayInfo();
            System.out.println();

        }

    }
}
