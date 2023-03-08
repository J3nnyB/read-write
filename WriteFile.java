/*******************
   Name: Jennifer Byrne
   
   Date: January 26, 2020
   
   Notes: ENTD381 Final Project - WriteFile class that works with FinalProjectDriver. These methods modify, save, and rename
          file finalproject.txt.   
  
*******************/
// Package statement
package FinalProject;

// Imports the Java IO library
import java.io.*;
// Imports the Java Utility library
import java.util.*;
// Imports the Java Lang library
import java.lang.*;

// Class declaration
public class WriteFile {
   
   // Creates a new Scanner object for user input
   static Scanner sc = new Scanner(System.in);
   
   // Global private variable
   private File additionFile;
   // Global private variable
   private File additionFileNew;

   // modifyFile method
   public void modifyFile() {
      // Try statement
      try {
      // Defines 'additionFile' variable
      additionFile = new File("C:\\myjava\\FinalProject\\finalproject.txt");
      // Creates new instance of PrinterWriter
      PrintWriter pw = new PrintWriter(additionFile);
      
      // Writes the following lines of numbers in finalproject.txt file
      pw.printf("%d %d %d%n", 2, 2, 4);
      pw.printf("%d %d %d%n", 3, 3, 6);
      pw.printf("%d %d %d%n", 5, 5, 10);
      // Writes the data in buffer to the hard drive
      pw.flush();
      // System informing user of what is going on to the file
      System.out.println("System has added the following lines to the file:");
      System.out.println("2 2 4");
      System.out.println("3 3 6");
      System.out.println("5 5 10");      
      }// Catch block
      catch(FileNotFoundException e) {
         // If exception is thrown, then this statement will print
         System.out.println("File 'finalproject.txt' does not exist.");
      
      }
   }
   // saveFile method
   public void saveFile() {
      // Asks user if they want to save to a CSV file
      System.out.println("Save results to a CSV file? Y or N: ");
      // User input
      String userSave = sc.nextLine();
      // Conditional statement - if user inputs "Y" or "y"
      if(userSave.equalsIgnoreCase("Y")) {
         // Then finalproject.txt will be renamed to Math_Results.csv  
         additionFile.renameTo(new File("C:\\myjava\\FinalProject\\Math_Results.csv"));
         // System informs user that file has been created
         System.out.println("File 'Math_Results.csv' created.");
         
      }
      else {
         // System informs user if file was not created
         System.out.println("CSV file was not created.");
  
      }
      
   } 
   // reviewFile method     
   public void reviewFile() {
      //Try statement
      try {
      // New instance of object variable for file Math_Results.csv using the Scanner method
      Scanner additionFileNew = new Scanner(new File("C:\\myjava\\FinalProject\\Math_Results.csv"));   
      // System asks user if they want to review the data on Math_Results.csv
      System.out.println("Review the results? Y or N: ");
      // User input
      String userReview = sc.nextLine();
      // Conditional statement - if user inputs "Y" or "y"
         if (userReview.equalsIgnoreCase("Y")) {
            // Then while object additionFileNew has an integer, it will print
            while(additionFileNew.hasNextInt()) {
            // Assigns a variable to the integers in the Math_Results.csv file
            int x = additionFileNew.nextInt();
            int y = additionFileNew.nextInt();
            int z = additionFileNew.nextInt();
            // Print format to display X + Y = Z
            System.out.printf("%d + %d = %d%n", x,y,z);      
            }
         
         }
         else {
            // If user inputs "N", then the Math_Results.csv will close
            additionFileNew.close();
            
         }
      }// Catch block
      catch(FileNotFoundException e) {
         // If exception is thrown, then system will print this statement
         System.out.println("File 'Math_Results.csv' does not exist.");
      
      }
      
   }
         
}