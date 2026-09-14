package in_class;

import java.util.Scanner;

public class DemoUserIO {
    static void main(){


        //String
        System.out.println("Please enter name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello how are you " + name);

        //Comparing String
        if(name.equals("Fred")){
            System.out.println("You are banned");
        }else {
            System.out.println("Welcome in");
        }

        // ! means not
        if(!name.equals("Fred")){
            System.out.println("Welcome");
        }else {
            System.out.println("Get out");
        }



        // numbers

        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age <18 ) {
            System.out.println("You are too young, get out");
        } else if (age<25) {
            System.out.println("No car renteal for you");
        }else{
            System.out.println("Come in");
    }
    }

}
