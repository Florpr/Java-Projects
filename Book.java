//File: Book.java
//Author: Flor A. Guadalupe
//Date: Seo-24-2025
//Clas: COMP 2400 OOP
//Description: This is a class called from the Main.java class to output the book information given.
public class Book {
   protected String title;
   protected String author;

   protected static int bookCounter = 0;

   public Book(String title, String author){
       this.title = title;
       this.author = author;
       bookCounter++;

   }
   public void displayBookInfo() {
        System.out.println("Title: " + this.title + " Author: " + this.author);
    }
      public static void displayTotalBooks(){
       System.out.println("The total amount of Books are: " + bookCounter);

    }
}