/*******************
   Name: Jennifer Byrne
   
   Date: January 26, 2020
   
   Notes: ENTD381 Final Project - ReadFile class which works with FinalProjectDriver. These methods open, read, and close
          file 'finalproject.txt'.   
  
*******************/
// Package statement
package FinalProject;

// Imports the Java IO library
import java.io.*;
// Imports the Java Utility library
import java.util.*;

// Class declaration
public class ReadFile {

   // Private global variable
   private Scanner readFile;
   
   // openFile method
   public void openFile() {
      // Try statement
      try {
         // Defines 'readFile' variable using Scanner method
         readFile = new Scanner(new File("C:\\myjava\\FinalProject\\finalproject.txt"));
               
      }
      // Catch block
      catch (Exception e) {
         // If an exception is thrown, then this statement will print
         System.out.println("File does not exist.");
      }
   
   }
   
   // readFile method
   public void readFile() {
      // Loop - while object variable 'readFile' has another integer, then it will print them
      while(readFile.hasNextInt()) {
         // Assigns a variable to the integers in the finalproject.txt file
         int x = readFile.nextInt();
         int y = readFile.nextInt();
         int z = readFile.nextInt();
         // Print format to display X + Y = Z
         System.out.printf("%d + %d = %d%n", x,y,z);
      }
   
   }
   
   // closeReadFile method
   public void closeReadFile() {
      
      // Closes finalproject.txt file
      readFile.close();
      
   }
}