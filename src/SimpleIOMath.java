import java.util.Scanner;

/**
 * Simple IO Math program for lab 1.02 123 ABC of AP Computer Science
 * @version 10.01.2022
 * @author 26prakash
 * Extra is on lines 65 and 53, it finds the area of a circle with the radius of the input.
 */

public class SimpleIOMath {
    // Instance variables
    private String name;
    private int age;
    private int favNumber;

    private static final double pi = 3.141596;

    /**
     * promptUser method of class SimpleIOMath
     * Method that takes user input and stores values in String name, int age, and int favNumber.
     */
    public void promptUser(){
        Scanner in = new Scanner(System.in);

        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your your favorite number? ");
        favNumber = in.nextInt();
    }

    /**
     * printInfo method of the SimpleIOMath Class
     * Prints the stored values of name, age, and favNumber
     */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber * favNumber));

        //Extra of my choosing
        System.out.println("The area of a circle with radius " + age + " (your age) is " + findArea(age));

        System.out.println("* end of program *");
    }

    /**
     * findArea method(private) of the SimpleIOMath class.
     * Extra of my choosing
     * Takes input of radius, outputs area(in double)
     * @param input Takes input of an integer
     * @return output Outputs the area of a circle with radius input
     */
    private double findArea(int input) {
        double area = pi * input * input;
        return area;
    }
    private boolean isPrime(int num){
        for (int i = 2; i < (int)(Math.sqrt(num)+1); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num)    {
        for(int i = 2; i < Math.sqrt(num) + 1; i++) {
            if(isPrime(i)) {
                if (num % i == 0) {
                    return i;
                }
            }
        }
        return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
