package a_conversion;

import java.util.ArrayList;
import java.util.Random;

public class SampleMethods {
    // static: method that does not belong to a specific object/instance
    // void: method that does not return
    // Parameter types are not hints in Java, they are REQUIRED
    public static void search(ArrayList<Integer> numbers, int target){
        // boolean, not bool!
        boolean found = false;

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == target){
                System.out.println(target + " was found in position " + i);
                found = true;
                break;
            }
        }

        // Java uses ! for not, not the word
        if(!found) {
            System.out.println(target + " was not found in the list");
        }
    }

    // static: method that does not belong to a specific object/instance
    // int: method that returns an int (specified BEFORE the method name)
    // Parameter and return types are not hints in Java, they are REQUIRED
    public static int count(ArrayList<Integer> numbers, int target){
        int count = 0;

        // Can also use a foreach style loop in Java with lists (and arrays!)
        for (Integer number : numbers) {
            if (number == target) {
                count++;
            }
        }

        return count;
    }


    static void main() {
        ArrayList<Integer> numbers = new ArrayList();
        Random randomGenerator = new Random();

        // In intelliJ : fori and tab will create a standard for loop
        for (int i = 0; i < 10; i++) {
            int random = randomGenerator.nextInt(101);
            numbers.add(random);
        }

        System.out.println("Number list:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ") " + numbers.get(i));
        }

        // Search for the number 5 in the randomly populated list
        SampleMethods.search(numbers, 5);

        // Count the number of times 12 appears in the randomly populated list and display
        int target = 12;
        // As the method is in the same file, we don't NEED the class name in front (but can use it if we want to)
        int count = count(numbers, target);
        System.out.println(target + " was found " + count + " times in the numbers list");
    }
}
