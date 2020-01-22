// Andrew Sala
// loopsProj.java
// Vault 2.0
import java.util.Random; import java.util.Scanner;
public class loopsProj {
    public static void main(String[] args) {
            String pin = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()"; // All the characters that could possibly be in the pin
            StringBuilder pass = new StringBuilder(); //StringBuilder basically a String that can be modified
            Random rand = new Random(); //  use new so it can be used in index
            int length = 6; // length of the pin
            while (pass.length() < length){ // length of the random string; loop will end when pass length is 6
                int index = (int)(rand.nextFloat() * pin.length());
                pass.append(pin.charAt(index));} // adds the random character
        String realPin = pass.toString(); // variable for pin; this converts StringBuilder to String
        System.out.println("See if you can guess the random pin.");// Welcome user
        System.out.println("The pin has 6 characters consisting of\nnumbers, special characters, and capital letters.\nEnter \"Quit\" at any time to exit the program");
        while(length < 10){ // Using length variable to active while loop (unrelated to actual length)
            Scanner input = new Scanner(System.in);
            String guess = input.next(); // User input ^
            if (guess.equals(realPin)) {
                System.out.println("Correct! The pin was " + realPin); // This prints if user guesses correctly
            }
            if (guess.equals("Quit")){ // Allows user to quit
                System.out.println("Goodbye");
                System.out.println("The pin was " + realPin); // Prints the pin
                length = 11; // Makes while condition false ending the program
            }
            else {
                System.out.println("Incorrect"); // This prints after every time the user enters the wrong answer
            }
        }
    }
}