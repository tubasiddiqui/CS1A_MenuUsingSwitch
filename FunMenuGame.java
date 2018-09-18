//=================================================================================================
//File Name: FunGameMenu.java
//Author: Tuba Siddiqui
//Copyright: Copyright 2018 by Tuba Siddiqui
//Description: the purpose of this program is to use various methods to have a functioning menu driven game that will output different results depending on user input and their game selection
//Revision History:
//Date                  Version           Author                  Description                                                                       Errors fixed 
//06-09-18                1.0            Tuba Siddiqui           Initial creation using Scanner, do while, and switch statements                     putting all the switch statements and calling Scanner inside the main body
//06-09-18                1.1            Tuba Siddiqui           Addition of the different methods and using loops and nested if else statements     correcting calculations 
//06-10-18                1.2            Tuba Siddiqui           Invoking a private method for the verifyLeapYear option
//=================================================================================================

import java.util.Scanner;

public class FunMenuGame {
   
      
   public static void main (String [] args) { 
      char userInput = '0';
  
     do
     {
           Scanner scanner = new Scanner(System.in);
           
           displayMenu();
           
           userInput = scanner.next().charAt(0);
          
           switch (userInput) {
           case 'S':
           case 's':     sumIntegers ();
               break;
           case 'V':    
           case 'v':     verifyLeapYear ();
               break;
           case 'C':
           case 'c':     countVowels ();
               break;
           case 'Q':
           case 'q':     quitGame ();
               break;
           default:   invalidSelection ();
               break;
      }
     }
      while (userInput != 'Q');
   }
 
   public static void sumIntegers () {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Please enter a natural integer");
     int number = scanner.nextInt();
     int sum =0;
     for ( int run=1; run<=number; run=run+1) {
          sum = sum + run;
     }
     
     System.out.println("The sum of " + number  + " integers is " + sum);
     System.out.println('\n');
     
   }

   public static void verifyLeapYear () {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Please enter a year");
      int year = scanner.nextInt();
      
      if(isLeapYear(year) == true) {
         System.out.println(year + " is a leap year");
      }
      else {
         System.out.println(year + " is not a leap year");
      }
      
   }
   
   private static boolean isLeapYear (int year) {
      if (year % 4 != 0) {
        return false;
      } 
      else if (year % 400 == 0) {
         return true;
      }
      else if (year % 100 == 0 )
      {
         return false;
      }
      else {
         return true;
      }
   }
  
   public static void countVowels () {
      String word;
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Please enter a String");
      word = scanner.next();
      char[] words = word.toCharArray();
      
      int vowels = 0;
      
      for (char w: words) {
         if( w== 'a' || w =='e' || w == 'i' || w == 'o' || w =='u' || w == 'A' || w == 'E' || w == 'I' || w == 'O' || w == 'U') {
            vowels++;
         
         }
      }
      
      System.out.println("Number of vowels in " + word + " is: " + vowels);
      System.out.println('\n');    
      
   }
   
   public static void displayMenu() {
      System.out.println("\t\t********************");
      System.out.println("\t\t*     FUN MENU     * ");
      System.out.println("\t\t********************");
      System.out.println("\tPlease make a selection");
      System.out.println('\n');
      System.out.println("\t\t<S>um of natural integers");
      System.out.println("\t\t<V>erify leap year");
      System.out.println("\t\t<C>ount vowels");
      System.out.println("\t\t<Q>uit");
   }
   
   public static void quitGame () {
      System.out.println("The fun is over. Have a nice day!!!");
      System.exit(0);    
   }
   
   public static void invalidSelection () {
      System.out.println("Error: invalid choice entered. Please enter S,s or V,v or C,c, or Q,q only");
      System.out.println('\n');
   }
   
}


