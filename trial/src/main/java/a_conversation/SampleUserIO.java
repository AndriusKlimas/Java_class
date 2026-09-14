package a_conversion;

import java.util.Scanner;

public class SampleUserIO {
    static void main() {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // Concatenation to combine fixed text with variable (no fstrings!):
        System.out.println("Hi there, " + name);

        // Newer versions of Java allow hiding of scanner with utility methods in IO class
        System.out.println("Where are you from?");
        String home = IO.readln();
        System.out.println(home + ", eh? I don't think I've been there");
    }
}
