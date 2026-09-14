package a_conversion;


import java.util.Scanner;

// { dictates the start of a block, not indentation changing inwards
public class SampleBranching {
    static void main() {
        // Scanner to provide access to input from user
        Scanner input = new Scanner(System.in);
        // Declare the type of the variable too!
        int value = 20;

        System.out.println("Welcome to the number guessing game!");

        // For loop specifies:
        //  - Variable to use within loop (usually a loop counter)
        //  - Start value for that variable
        //  - End Condition for loop
        //  - Increment to be used on loop variable
        // Each part is separated with ;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number between 1 and 50: ");
            // Need to specify the type of data being read in. Most common are:
            //  - readInt() for ints
            //  - readDouble() for doubles
            //  - readLine() for Strings
            int guess = input.nextInt();

            if (guess == value) {
                System.out.println("Correct!");
                break;
            }
            // else if, not elif!
            else if (guess < value) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high!");
            }
            // } dictates the end of a block, not indentation changing outwards
        }
    }
}
