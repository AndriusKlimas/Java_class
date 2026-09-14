package a_conversion;

// Imports specify the package name/path and end with ;
import java.util.Scanner;

// CapWords naming for classes
public class SampleTypes {
    static void main() {
        // Create a scanner to access input from user
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        // nextLine() to read in Strings
        // camelCase naming for variables and methods - no underscores unless all caps!
        String itemName = input.nextLine();

        System.out.println("How much are they?");
        // nextDouble() to read in decimal numbers
        double unitPrice = input.nextDouble();

        System.out.println("How many of " + itemName + " do you need?");
        // nextInt() to read in whole numbers
        int quantity = input.nextInt();

        System.out.println("Your total today is: €" + (quantity*unitPrice));
    }
}
