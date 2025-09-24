//Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().


class Persons{
    String name;
    int id;

    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayRole() {
        System.out.println("Person");
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Persons implements Worker {
    double salary;

    public Chef(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes in the kitchen.");
    }

    @Override
    public void displayRole() {
        System.out.println("Chef:");
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Waiter extends Persons implements Worker {
    double tip;

    public Waiter(String name, int id, double tip) {
        super(name, id);
        this.tip = tip;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }

    @Override
    public void displayRole() {
        System.out.println("Waiter:");
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Tip: " + tip);
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Rajesh", 101, 5000.0);
        Waiter waiter = new Waiter("Pawan", 102, 150.0);

        chef.performDuties();
        chef.displayRole();

        System.out.println();

        waiter.performDuties();
        waiter.displayRole();
    }
}
