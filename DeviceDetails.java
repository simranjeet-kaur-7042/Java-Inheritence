//Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.

import java.util.Scanner;
class Device{
    protected int deviceId;
    protected String status;
}
class Thermostat extends Device{
    Scanner sc=new Scanner(System.in);
    private int temperatureSetting;
    void getStatus(){
        System.out.println("----Enter the Details of device----");
        System.out.print("Enter device ID : ");
        deviceId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter device status : ");
        status=sc.nextLine();
        System.out.print("Set Temperature of device(in °C) : ");
        temperatureSetting=sc.nextInt();
    }
    void displayStatus(){
        System.out.println("\n----Details of device----");
        System.out.print("Device ID : "+deviceId+"\nDevice Status : "+status+"\nTemperature Setting : "+temperatureSetting+"°C");
    }
}
class DeviceDetails{
    public static void main(String args[]) {
        Thermostat t=new Thermostat();
        t.getStatus();
        t.displayStatus();
    }
}
