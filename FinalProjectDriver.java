/*******************
   Name: Jennifer Byrne
   
   Date: January 26, 2020
   
   Notes: ENTD381 Final Project - Program driver to call methods from ReadFile class and WriteFile class to open, read, 
          and write/update file 'finalproject.txt'. The 'finalproject.txt' file contains data that the program will use. 
  
*******************/
// Package statement
package FinalProject;

// Imports the Java IO library
import java.io.*;
// Imports the Java Utility library
import java.util.*;

//Class declaration
public class FinalProjectDriver {
   // Main method
   public static void main(String[] args) {
      
      // Creates a new instance of ReadFile
      ReadFile readFile = new ReadFile();
      // Object variable 'readFile' calls openFile method in the ReadFile class
      readFile.openFile();
      // Header
      System.out.println("This is the data in file 'finalproject.txt'.");
      // Object variable 'readFile' calls readFile method in the ReadFile class
      readFile.readFile();
      // Object variable 'readFile' calls closeReadFile method in the ReadFile class
      readFile.closeReadFile();
      
      // Creates a new instance of WriteFile
      WriteFile writeFile = new WriteFile();
      // Object variable 'writeFile' calls modifyFile method in the WriteFile class
      writeFile.modifyFile();
      // Object variable 'writeFile' calls saveFile method in the WriteFile class
      writeFile.saveFile();
      // Object variable 'writeFile' calls  reviewFile method in the WriteFile class
      writeFile.reviewFile();
      // Program ends
      System.exit(0);
   
   }      
}      