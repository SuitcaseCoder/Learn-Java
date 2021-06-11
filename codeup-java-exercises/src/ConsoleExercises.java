
//import Scanner class

import java.util.Scanner;

public class ConsoleExercises {
//        sout : shortcut for logging

    public static void main(String[] args) {

//   CURRICULUM
//   printing to the console
//        String name = "codeup";
//        // System is a class and .out prints OUT to the console and .printf
//        // prints formatted string
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//
//        String greeting = "Salutations";
//        String secondName = "codeup";
//        System.out.printf("%s, %s!", greeting, secondName);


//    getting input from the user in the terminalSystem.out.print("Enter something: ");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
////        if I enter 'suitcase coder' into the input field in the console, then .next() returns only 'suitcase as a string
//        String userInput = scanner.next();
////        if I enter 'suitcase coder' into the input field in the console, then .nextLine() returns 'suitcase coder' as a
////        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
// // CONSOLE INPUT OUTPUT EXERCISES
//        1. copy this into main method & Write some Java code that uses the variable pi to output the following:
//           The value of pi is approximately 3.14.
//        double pi = 3.14159;
////
//        System.out.format("%.2f%n", pi);

//        Explore the Scanner class
//        1. Prompt a user to enter a integer and store that value in an
//        int variable using the nextInt method
//        commented the one above out, so I can practice and use it here
//        in the exercise
        Scanner scanner = new Scanner(System.in);
//        this tells the user to actually type something out in the console
//        System.out.print("Enter an integer: ");
//        this tells the scanner to grab the first int
//        String intInput = scanner.next();
//        this prints out the integer the user input
//        System.out.println("You entered: --> \"" + intInput + "\" <--");

//        2. Prompt a user to enter 3 words, and store each of them in a
//        separate variable. Then, display them back in the console, each
//        on a newline
//        System.out.print("enter three separate words: ");
//        String inputOne = scanner.next();
//        String inputTwo = scanner.next();
//        String inputThree = scanner.next();
//
//        System.out.println("your first word is: " + inputOne + "\n" +
//                " your second word is: " + inputTwo + "\n" + " your " +
//                "third word is: " + inputThree);

//        3. Prompt a user to enter a sentence, then store that sentence in
//        a String variable using the next method. Then, display that
//        sentence back to the user.
//        System.out.println("enter a sentence");
//        String userSent = scanner.nextLine();
//        System.out.println(userSent);

//        THIRD SET OF EXERCISES
//        Calculate the perimeter and area of Codeup's classrooms.
//        1. Prompt the user to enter values of length and width of a
//        classroom at Codeup.Use the nextLine method to get user input and
//        parse the resulting string to a numeric type

        System.out.println("enter the length and the width of the " +
                "classroom: ");
        String inputWidth = scanner.nextLine();
        String inputLength = scanner.nextLine();
        int width = Integer.parseInt(inputWidth);
        int length = Integer.parseInt(inputLength);

        System.out.println("length and width is: " + width + " " + length);


    }
}
