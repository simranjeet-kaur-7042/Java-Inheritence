//Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.

class Person{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayRole() {
        System.out.println("person.");
    }
}
class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher.");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Subject: " + subject);
    }

}
class Student extends Person{
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student.");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Grade: " + grade);
    }

}
class Staff extends Person{
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff Member.");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Department: " + department);
    }
}

class SchoolSystem{
    public static void main(String agrs[]){
        Teacher t = new Teacher("Ankush Kumar", 35, "Mathematics");
        Student s = new Student("Shweta Shah", 20, "10th Grade");
        Staff st = new Staff("Pankaj Mehra", 40, "Administration");

        t.displayRole();
        System.out.println();
        s.displayRole();
        System.out.println();
        st.displayRole();
    }
}