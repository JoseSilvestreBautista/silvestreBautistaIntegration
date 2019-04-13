import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
// Hi, I am Jose Silvestre-Bautista ctrl+shift+f for formatting
// This program is filled with exercises I have completed and it serves as a reference.
// I will change the purpose of the program once I have a theme picked out
// test

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, this porgram is hogwash. It is my reference for coding, enjoy.");
    System.out.println("A litle about me and my family:");
    Vehicle momsCar = new Car("CTS", "Cadillac", 2016, 160);
    Car myCar = new Car("Ford", "SE", "Apollo");
    myCar.printCarStats();
    ((Car) momsCar).momCar();

    System.out
        .println("As part of my program I have a college credit title classifier and it have four "
            + "credit year names in it:");

    YearClassification studentCredits = new YearClassification();
    String[] studentYear = {"Freshman", "Sophomre", "Junior", "Senior"};
    for (String yearNum : studentYear) {
      System.out.println(yearNum);
    }

    System.out.println("Enter how many credits you have to see your classification.");
    System.out
        .println("By the way, if you have no credits you are automactically " + "clssified as a ");
    studentCredits.print();

    int exceptionStopper = 1;
    do {
      try {
        int usersCreditAmount = scan.nextInt();
        studentCredits.setCredits(usersCreditAmount);
        if (usersCreditAmount < 0 || usersCreditAmount > 160) {
          throw new InputMismatchException();
        }
        studentCredits.print();
        exceptionStopper = 2;
      } catch (Exception ex) {
        System.out.println("Please, enter a whole number.");
        scan.next();
      }

    } while (exceptionStopper == 1);

    int[] creditClasses = {2, 15, 43, 19, 4};
    int minCredit = creditClasses[0];
    int minIndex = 0;
    for (int index = 1; index < creditClasses.length; index++) {
      if (creditClasses[index] < minCredit) {
        minCredit = creditClasses[index];
        minIndex = index;
      }
    }
    System.out.println(
        "Anyway, among my friends who have completed 2, 15, 43, 19, " + "and 4 credit hours.");
    System.out.println("The minCredit hour between them is " + minCredit);
    System.out.println("In this program code, the minCredit hour is located in element " + minIndex
        + "" + "of the array it is stored.");

    int creditSum = 0;
    for (int counter = 0; counter < creditClasses.length; counter++) {
      creditSum += creditClasses[counter];
    }
    System.out.println(
        "The total credits completed by all my friends is " + creditSum+".");

System.out.println("At lunch I set with:");

    String[][] lunchSitting = {{"Tom", "Jim"}, {"Lin", "Jose"}};
    for (int rowSeat = 0; rowSeat < lunchSitting.length; rowSeat++) {
      for (int columnsSeat = 0; columnsSeat < lunchSitting.length; columnsSeat++) {
        System.out.println("lunchSitting[" + rowSeat + "][" + columnsSeat + "]="
            + lunchSitting[rowSeat][columnsSeat]);
      }
    }

    System.out.println("By the way, at school I take: ");
    ArrayList<String> courses = new ArrayList<String>();
    courses.add("Calculus III");
    courses.add("Intermediate Mechanics");
    courses.add("Composition II");
    courses.add("Statistical Methods");
    courses.add("Intro to Programming");
    System.out.println(courses);
    
    System.out.println("Please, allow me to get to know you.");
    System.out.println("What is your name?");

    final String name = scan.next();
    // final locks in the value of a variable, but a reference to it can be
    // modified

    System.out.println("Hello " + name + ", how old are you?");
    int age = scan.nextInt();
    System.out.println("Thank you!");
    System.out.print("Did you know");
    double halfAge = age / 2.0;
    System.out.println(" half your age is " + halfAge);

    System.out.println("True or false, 2+2 is 4.");
    boolean answer = scan.nextBoolean();
    while (answer == false) {
      System.out.println("Try again");
      scan.nextBoolean();
      if (true)
        break;
    }

    // Casting: forcing java to treat a variable as another data type
    double smallPie = (int) 3.14;
    System.out.println(smallPie);

    System.out.println("Jose says, \"I love programming!\"");

    int grade = 90;
    char finalLetter = (grade >= 90) ? 'A' : 'B';
    if (grade >= 90) {
      finalLetter = 'A';
    } else if (grade >= 80) {
      finalLetter = 'B';
    } else if (grade >= 70) {
      finalLetter = 'C';
    } else {
      finalLetter = 'F';
    }
    System.out.println(finalLetter);
    Random randomGen = new Random();
    // repl.it.com
    randomGen.nextInt(54);
    System.out.println(randomGen.nextInt(54));
    System.out.println("Which pizza is the best deal?");// System.out.println() is the call
                                                        // inside print statement is the argument
    System.out.println("Enter the price and diameter of a pizza");
    System.out.println("to find out the cost per square inch.");
    System.out.println("Enter pizza diameter:");
    double pizzaDiameter = scan.nextDouble();
    System.out.println("Enter pizza price:");
    double pizzaPrice = scan.nextDouble();

    double pricePerInch = calculatePricePerInch(pizzaDiameter, pizzaPrice);
    // output the price per inch
    System.out.println("Pizza price per inch = " + pricePerInch);
    int day = 3;
    String dayOfWeek;
    switch (day) {
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
        dayOfWeek = "Invalid month";
        break;
    }
    System.out.println(dayOfWeek);
    String blurb = "abc";
    String blurb2 = "def";

    System.out.println(blurb.compareTo(blurb2));
    System.out.println(blurb == blurb2);
    // == checks if both objects point to the same memory location

    int randomNumberPicked;
    for (randomNumberPicked = 5; randomNumberPicked >= 0; randomNumberPicked--) {
      System.out.println(randomGen.nextInt(53));
    }

    int lottoNums;
    for (lottoNums = 0; lottoNums < 5; lottoNums++) {
      if (lottoNums == 13) {
        continue;
      }
      System.out.println(randomGen.nextInt(14));
    }
    // this loop will skip 13 if it appears and continue on with another number


    int count = 1;
    do {
      System.out.println(count);
      count++;
    } while (count <= 10);
    // evaluates statement before the condition even if condition is not meet

    System.out.println("enter a number between 1 and 100");
    int N = scan.nextInt();
    if (N % 2 == 1) {
      System.out.println("Weird");
    } else if (N >= 2 && N <= 5 && N % 2 == 0) {
      System.out.println("Not Weird");
    } else if (N >= 6 && N <= 20 && N % 2 == 0) {
      System.out.println("Weird");
    } else {
      System.out.println("Not Weird");
    }

    System.out.println("enter two non-negative numbers ");
    int userNum1 = scan.nextInt();
    int userNum2 = scan.nextInt();
    System.out.println("your first number plus your second number is " + (userNum1 + userNum2));

    System.out.println("enter two non-negative numbers ");
    int userNum3 = scan.nextInt();
    int userNum4 = scan.nextInt();
    System.out.println("your first number minus your second number is " + (userNum3 - userNum4));

    System.out.println("enter a number");
    int userNum5 = scan.nextInt();
    userNum5 += 1;
    System.out.println("your number plus 1 is " + userNum5);
  }

  public static double calculatePricePerInch(double pizzaDiameter, double pizzaPrice) {
    // the entire line above is a header
    // inside the parenthesis of calculatePricePerInch is the parameter
    return pizzaPrice / (Math.PI * (pizzaDiameter / 2) * (pizzaDiameter / 2));
  }
}

// inheritance is a relation between two classes: super and sub class
// inheritance allows a sub class to inherit the fields and methods of a super class
// This reduces coding time and increases organization.

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
