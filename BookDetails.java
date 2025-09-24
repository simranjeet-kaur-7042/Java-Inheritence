//Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.

import java.util.Scanner;
class Book{
    protected String title;
    protected int publicationYear;
}
class Author extends Book{
    Scanner sc=new Scanner(System.in);
    private String name,bio;
    
    void getInfo(){
        System.out.println("----Enter the Details of Book and its Author----");
        System.out.print("Enter the title of book : ");
        title=sc.nextLine();
        System.out.print("Enter the Publication year : ");
        publicationYear=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the author of book : ");
        name=sc.nextLine();
        System.out.print("Enter the Bio of author : ");
        bio=sc.nextLine();
    }

    void displayInfo(){
        System.out.println("\n----Details of Book and its Author----");
        System.out.print("Book Title : "+title+"\nBook Publication Year : "+publicationYear+"\nAuthor Name : "+name+"\nAuthor Bio : "+bio);
    }
}
class BookDetails{
    public static void main(String[] args) {
        Author a=new Author();
        a.getInfo();
        a.displayInfo();
        
    }
}
