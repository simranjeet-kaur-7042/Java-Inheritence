//Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.

class Employee {
    protected int id;
    protected String name;
    protected double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("----MANAGER DETAILS----");
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n----DEVELOPER DETAILS----");
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

class Intern extends Employee {
    int time_duration;

    Intern(int id, String name, double salary, int time_duration) {
        super(id, name, salary);
        this.time_duration = time_duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n----Intern DETAILS----");
        super.displayDetails();
        System.out.println("Time Duration(in months) : " + time_duration);
    }
}

class Employee_Details {
    public static void main(String args[]) {
        Employee m = new Manager(101, "Ankush Shah", 60000, 30);
        Employee d = new Developer(202, "Dhruv Kumar", 50000, "Java");
        Employee i = new Intern(303, "Naveen Sharma", 20000, 6);
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();

    }
}