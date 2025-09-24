class Animal{
    String name;
    int age;
    void getData(String n,int a){
        name = n;
        age = a;
    }
    void sound(){
         System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The name of Dog is : "+name+"\nAge is : "+age);
        System.out.println("Dogs Bark.");
    }

}
class Cat extends Animal{
    void sound(){
         System.out.println("The name of Cat is : "+name+"\nAge is : "+age);
         System.out.println("Cats meow.");
    }
}
class Bird extends Animal{
    void sound(){
         System.out.println("The name of Bird is : "+name+"\nAge is : "+age);
         System.out.println("Birds Chirp.");
    }
}
class AnimalExample{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        a1.getData("Tommy", 3);
        a1.sound();
        a2.getData("Kitty", 2);
        a2.sound(); 
        a3.getData("ChiChi", 1);
        a3.sound(); 
    }
}