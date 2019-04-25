import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
// Hi, I am Jose Silvestre-Bautista ctrl+shift+f for formatting
// This program is filled with exercises I have completed and it serves as a reference.
// I will change the purpose of the program once I have a theme picked out

public class Main {

  /**
   * This my first java program ever. I am not too proud of it,yet. I will revisit this program and
   * give a better theme and efficient coding.
   * 
   * @param args This is a reference for future coding issues.
   * @author Jose Silvestre-Bautista
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, this porgram is hogwash. It is my reference for coding, enjoy.");
    System.out.println("A litle about me and my family:");
    Vehicle momsCar = new Car("CTS", "Cadillac", 2016, 160);// this is polymorphism
    Car myCar = new Car("Ford", "SE", "Apollo");
    myCar.printCarStats();
    ((Car) momsCar).momCarStats();
    System.out
        .println("As part of my program I have a college credit title classifier and it have four "
            + "credit year names in it:");

    String[] studentYear = {"Freshman", "Sophomre", "Junior", "Senior"};
    for (String yearNum : studentYear) {
      System.out.println(yearNum); // this a simple array that prints everything in its list
    }
    YearClassification studentCredits = new YearClassification(); // creating an object
    System.out.println("Enter how many credits you have to see your classification.");
    System.out
        .println("By the way, if you have no credits you are automactically " + "clssified as a ");
    studentCredits.print(); // uses the parameterless constructor, kinda like default

    int exceptionStopper = 1;// this variable runs the while loop
    // this loop is way for handling exception, that way the program does not crash
    // not handling the exception cause the crash
    do {
      try {
        int usersCreditAmount = scan.nextInt();
        studentCredits.setCredits(usersCreditAmount);
        if (usersCreditAmount < 0 || usersCreditAmount > 160) {
          throw new InputMismatchException();// this allows selective input, it restrict the
        } // the amount of credits
        studentCredits.print();
        exceptionStopper = 2;// this change in the loop ends it
        break;// I added the break just to safe
      } catch (Exception ex) {
        System.out.println("Please, enter a whole positive number.");
        scan.next();
      }

    } while (exceptionStopper == 1);

    int[] creditClasses = {2, 15, 43, 19, 4};
    int minCredit = creditClasses[0];
    int minIndex = 0; // this loop finds the min value in the array
    // it compare the first element in
    // the index to the next until it finds the smallest
    // by cycling through all the elements
    for (int index = 1; index < creditClasses.length; index++) {
      if (creditClasses[index] < minCredit) {
        minCredit = creditClasses[index];
        minIndex = index;
      }
    }
    System.out.print("\n");
    System.out.println(
        "Anyway, among my friends who have completed 2, 15, 43, 19, " + "and 4 credit hours.");
    System.out.println("The minCredit hour between them is " + minCredit);
    System.out.println("In this program code, the minCredit hour is located in element " + minIndex
        + "" + " of the array it is stored.");

    int creditSum = 0;
    for (int counter = 0; counter < creditClasses.length; counter++) {
      creditSum += creditClasses[counter];
    } // this loops sums up all the number in the array creditClasses
    System.out
        .println("The total credits completed by all my friends is " + creditSum + " credits.");
    System.out.println("Moreover, During lunch I set with:");
    System.out.print("\n");
    String[][] lunchSitting = {{"Tom", "Jim"}, {"Lin", "Jose"}};
    for (int rowSeat = 0; rowSeat < lunchSitting.length; rowSeat++) {
      for (int columnsSeat = 0; columnsSeat < lunchSitting.length; columnsSeat++) {
        System.out.println("lunchSitting[" + rowSeat + "][" + columnsSeat + "]="
            + lunchSitting[rowSeat][columnsSeat]);
      } // I have to fix the 2d array search
    }
    System.out.print("\n");
    System.out.println("By the way, during 2019 spring semester I took: ");
    ArrayList<String> courses = new ArrayList<String>();// this an array list
    courses.add("Calculus III");// all I did was print what was in the list
    courses.add("Intermediate Mechanics");// by the way vector like brackets are called generic
    courses.add("Composition II");
    courses.add("Statistical Methods");
    courses.add("Intro to Programming(my favorite class)");
    System.out.println(courses);
    System.out.print("\n");
    System.out.println("Enough about me.");
    System.out.println("What is your name?");
    int exceptionStopper10 = 1;
    do {
      try {
        final String Name = scan.next();
        // final locks in the value of a variable, but a reference to it can be
        // modified
        System.out.println("Hello " + Name + ", how old are you?");
        exceptionStopper10 = 2;
        break;
      } catch (Exception ex) {
        System.out.println("Try using only letters.");
        scan.next(); // this clears what was just type, so an infinite loop does not occur!
      }
    } while (exceptionStopper10 == 1);

    int exceptionStopper2 = 1;
    do {
      try {
        int userAge = scan.nextInt();
        System.out.println("Cool you're " + userAge);
        exceptionStopper2 = 2;
        break;
      } catch (Exception ex) {
        System.out.println("Please, enter a whole positive number.");
        scan.next();
      }
    } while (exceptionStopper2 == 1);
    System.out.println("Lets do some trivia, don't worry it's easy.");
    System.out.println("True or false, 2+2 is 4.");
    int exceptionStopper3 = 1;
    do {
      try {
        boolean answer = scan.nextBoolean();
        if (answer == false) {
          throw new InputMismatchException();
        }
        exceptionStopper3 = 2;
        break;
      } catch (Exception ex) {
        System.out.println("Wrong, true or false only?");
        scan.next();
      }
    } while (exceptionStopper3 == 1);
    System.out.println("True is correct!");

    System.out.println("Did you know if rounded PI to the nearest whole number it becomes: ");
    double smallPie = (int) 3.14; // Casting: forcing java to treat a variable as another data type
    System.out.println(smallPie);
    System.out.println("By the way \"I love programming!\"");
    // this shows how to use quotes within quotes when writing in System.out.println()
    int grade = 90; // this example of using a if else statement
    char letterGrade = (grade >= 90) ? 'A' : 'B'; // the colon is like an if else statement too
    if (grade >= 90) {
      letterGrade = 'A';
    } else if (grade >= 80) {
      letterGrade = 'B';
    } else if (grade >= 70) {
      letterGrade = 'C';
    } else {
      letterGrade = 'F';
    }
    System.out.println("As a random side note I got an " + letterGrade + " on my last math test.");
    Random randomGen = new Random(); // random class
    System.out.println("Did you know my favorite number is  " + randomGen.nextInt(54));
    System.out.print("\n");
    System.out.println("Hey, do want know how to till a good pizza deal?");
    System.out.println("Judge by the price per inch, see for yourslef.");
    // System.out.println() is the call
    // inside print statement is the argument
    System.out.println("Enter the price and diameter of a pizza");
    System.out.println("to find out the cost per square inch.");
    System.out.println("Enter pizza diameter:");

    int exceptionStopper4 = 1;
    do {
      try {
        double pizzaDiameter = scan.nextDouble();
        System.out.println("Enter pizza price:");
        double pizzaPrice = scan.nextDouble();
        double pricePerInch = calculatePricePerInch(pizzaDiameter, pizzaPrice);
        // output the price per inch
        System.out.println("Pizza price per inch = " + pricePerInch);
        exceptionStopper4 = 2;
        break;
      } catch (Exception ex) {
        System.out.println("Please, enter a positve number for price and diamter ");
        scan.next();
      }
    } while (exceptionStopper4 == 1);

    int day = 4;
    String dayOfWeek;
    switch (day) { // an example of a switch based on a numbering of the week
      case 1:
        dayOfWeek = "Sunday";
        break;
      case 2:
        dayOfWeek = "Monday";
        break;
      case 3:
        dayOfWeek = "Tuesday";
        break;
      case 4:
        dayOfWeek = "Wednesday";
        break;
      case 5:
        dayOfWeek = "Thursday";
        break;
      case 6:
        dayOfWeek = "Friday";
        break;
      case 7:
        dayOfWeek = "Saturday";
        break;
      default:
        dayOfWeek = "Invalid day";
        break;
    }
    System.out.print("\n");
    System.out.println("Did you know when I finished this program it was " + dayOfWeek);
    String palindromeForward = "solos";
    String palindromeBackward = "solos";

    System.out.println(palindromeForward.compareTo(palindromeBackward));
    System.out.print("\n");
    System.out.println("Did you know the word: solos is a palindrome?"
        + "Meaning reading the word backward and forward is the same, it's ");
    System.out.println(palindromeForward == palindromeBackward);
    // == checks if both variables point to the same memory location

    int randomNumberPicked;
    for (randomNumberPicked = 5; randomNumberPicked >= 0; randomNumberPicked--) {
      System.out.println("You know what, the next time you play the lotto you should use:"
          + randomGen.nextInt(53));// makes random numbers between 0 and 52
    }


    int[] countingByTen = {10, 20, 30, 40, 50};

    for (int skip : countingByTen) {
      if (skip == 30) {
        continue;
      }
      System.out.print(skip);
      System.out.print("\n");// this creates a new line each time
      // this loop will skip 13 if it appears and continue on with another number


      int exceptionStopper5 = 1;
      do { // evaluates statement before the condition even if condition is not meet
        try {
          System.out.println("Enter a number and I'll tell describe your number");
          int usersNumber = scan.nextInt();
          if (usersNumber % 2 != 0) { // this determines odd and even using the modulus
            System.out.println("odd number");
          } else if (usersNumber >= 2 && usersNumber <= 5 && usersNumber % 2 == 0) {
            System.out.println("Your number is even and between 2 and 5");
          } else if (usersNumber >= 6 && usersNumber <= 20 && usersNumber % 2 == 0) {
            System.out.println("Your number is even and between 6 and 20 ");
          } else {
            System.out.println("even number that bigger than 20");
          }
          exceptionStopper5 = 2;
          break;
        } catch (Exception ex) {
          System.out.println("Please, enter a whole postive number");
          scan.next();
        }
      } while (exceptionStopper5 == 1);

      System.out.println("The program is about to end, lets do some math before you go");
      int exceptionStopper6 = 1;
      do {
        try {
          System.out.println("Lets add two numbers, enter two numbers.");
          int firstNumberWithAddition = scan.nextInt();
          int secondNumberWithAddition = scan.nextInt();
          System.out.println("your first number plus your second number is "
              + (firstNumberWithAddition + secondNumberWithAddition));
          exceptionStopper6 = 2;
          break;
        } catch (Exception ex) {
          System.out.println("Please, enter only whole positive numbers");
          scan.next();
        }
      } while (exceptionStopper6 == 1);

      int exceptionStopper7 = 1;
      do {
        try {
          System.out.println("Lets do subtraction, enter two whole positive numbers ");
          int firstSubtractionNumber = scan.nextInt();
          int secondSubtractionNumber = scan.nextInt();
          System.out.println("your first number minus your second number is "
              + (firstSubtractionNumber - secondSubtractionNumber));
          exceptionStopper7 = 2;
          break;
        } catch (Exception ex) {
          System.out.println("Please, enter a whole numbers");
          scan.next();
        }
      } while (exceptionStopper7 == 1);
      int exceptionStopper8 = 1;
      do {
        try {
          System.out.println("You won't understand but enter a number");
          int coolCodingAdditoin = scan.nextInt();
          coolCodingAdditoin += 1;
          System.out.println("Your number plus 1 is " + coolCodingAdditoin
              + ", but I added in a cool with the programming.");
          exceptionStopper8 = 2;
          break;
        } catch (Exception ex) {
          System.out.println("Please, enter a number");
          scan.next();
        }
      } while (exceptionStopper8 == 1);

      int exceptionStopper9 = 1;
      do {
        try {
          System.out.println("Let's play one last game.");
          System.out.print("I am thinking of four legged animal that meows, what is it?");
          String usersGuess = scan.next();
          String myChoosenAnimal = "cat";
          if (usersGuess.equals(myChoosenAnimal)) {
            // this compares the answers to see if they are in the same location
            System.out.println("It is a cat!");
          } else {
            throw new InputMismatchException();
          }
          exceptionStopper9 = 2;
          break;
        } catch (Exception ex) {
          System.out.println("wrong");
          scan.next();
        }
      } while (exceptionStopper9 == 1);
    }
    scan.close();

  }

  /**
   * this computes the price per inch of pizza.
   * 
   * @param pizzaDiameter The length of pizza side
   * @param pizzaPrice The cost of entire pizza.
   * @return this computes the pizza price over the area.
   */
  public static double calculatePricePerInch(double pizzaDiameter, double pizzaPrice) {
    // the entire line above is a header
    // inside the parenthesis of calculatePricePerInch is the parameter
    return pizzaPrice / (Math.PI * (pizzaDiameter / 2) * (pizzaDiameter / 2));
  }

}



// inheritance is a relation between two classes: super and sub class
// inheritance allows a sub class to inherit the fields and methods of a super class
// This reduces redundant code which save time and organizes code .

// operator precedence: certain operators are evaluated first because they have higher importance
// example: "=" has higher importance than "()"

// Variable: location in memory

// Scope: variable is only accessible in the method where it was declared

// byte: The byte data type is an 8-bit signed two's complement integer. It has minimum value of
// 128 and a maximum value of 127 (inclusive). Good for saving memory.

// short: The short data type is a 16-bit signed two's complement integer. It has a minimum value
// of -32,768 and a maximum value of 32,767 (inclusive). Good for saving memory.

// int: By default, the int data type is a 32-bit. has a minimum value of -231 and a maximum value
// of 231-1. use int data type as an unsigned integer

// long: The long data type is a 64-bit. has a minimum value of -263 and a maximum value of
// 263-1.when you need a range of values wider than those provided by int.

// float: The float data type is a single-precision 32-bit IEEE 754 floating point. Good for saving
// memory, not for precision

// The double data type is a double-precision 64-bit IEEE 754 floating point. Usually default choice
// for decimals, mot good for precision.

// boolean: The boolean data type has only two possible values: true and false.

// char: The char data type is a single 16-bit Unicode character. It has a minimum value of 0 and a
// maximum value of 65,535 inclusive.
