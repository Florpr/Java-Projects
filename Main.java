// File:Main.java
// Author: Flor A. Guadalupe
// Date: COMP 2400 OOP
// Description: This is the Main class that calls the Book class and displays the information.
public class Main{
    public static void main(String[] args){

        Book Book1 = new Book("Cat In The Hat" , "Doctor Seuss");
        Book Book2 = new Book("Horton: The Elephant" , "Doctor Seuss");
        Book Book3 = new Book("The Lorax", "Doctor Seuss");

        Book1.displayBookInfo();
        Book2.displayBookInfo();
        Book3.displayBookInfo();

        Book.displayTotalBooks();
    }
}