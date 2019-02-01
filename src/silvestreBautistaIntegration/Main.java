package silvestreBautistaIntegration;

import java.util.Scanner;
// Hi, I am Jose Silvestre-Bautista ctrl+shift+f for formatting
// This program is filled with exercises I have completed and it serves as a reference.
// I will change the purpose of the program once I have a theme picked out


public class Main {

  public static void main(String[] args) {

    System.out.println("Hello, I am a program.");
    System.out.println("Please, allow me to get to know you.");
    System.out.println("What is your name?");

    // final locks in the value of a variable, but a reference to it can be
    // modified

    Scanner scan = new Scanner(System.in);
    final String name = scan.next();

    System.out.println("Hello " + name + ", how old are you?");
    int age = scan.nextInt();
    System.out.println("Thank you!");
    
    System.out.println("Did you know");
    double halfAge = age / 2.0;
    System.out.println("Half your age is " + halfAge);
    
    System.out.println("True or false, 2+2 is 4.");
    boolean answer = scan.nextBoolean();
    if (answer == true)
      System.out.println("Correct!");
    else
      System.out.println("Wrong!"); 


  }
}

// Casting: forcing java to treat a variable as another data type

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

