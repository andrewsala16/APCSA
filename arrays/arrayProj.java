// Andrew Sala
// array
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class arrayProj {
    private static void blank(String[] arr) { // this method turns the array of the word's individual letters
        for (int i = 0; i < arr.length; i++) { // into empty spaces that wil to be filled
            if (arr[i].equals(" ")) { // each array has a blank index for the space
                arr[i] = " ";
            } else { // every letter will be turned into a dash
                arr[i] = ("-");
            }
        }
    }

    private static void printArray(String[] arr) { // prints array
        for (String s : arr) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        // 1st word
        String[] wordArraysub = {"c", "o", "m", "p", "u", "t", "e", "r", " ", "s", "c", "i", "e", "n", "c", "e"};
        String[] wordArraysub2 = new String[wordArraysub.length]; //duplicate array
        String sub = "Computer Science"; // full word to be guessed
        for (int i = 0; i < wordArraysub.length; i++) {
            wordArraysub2[i] = wordArraysub[i];
        }
        // 2nd word
        String[] wordFood = {"A", "P", "P", "L", "E", " ", "P", "I", "E",};
        String[] wordFood2 = new String[wordFood.length]; //duplicate array
        String food = "Apple Pie"; // full word to be guessed
        for (int i = 0; i < wordFood.length; i++) {
            wordFood2[i] = wordFood[i];
        }
        // 3rd word
        String[] wordHouse = {"A", "L", "A", "R", "M", " ", "C", "L", "O", "C", "K"};
        String[] wordHouse2 = new String[wordHouse.length]; //duplicate array
        String house = "Alarm Clock"; // full word to be guessed
        for (int i = 0; i < wordHouse.length; i++) {
            wordHouse2[i] = wordHouse[i];
        }
        int[] points = {100, 200, 300, 400, 500}; // array for points on the wheel

        // introduction
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("Category: School Subjects");
        blank(wordArraysub); // makes first word into dashed lines
        printArray(wordArraysub); // prints first word
        System.out.println(" ");

        int scoreboard = 0; // variable that will be updated for the user's score
        boolean running = false; // boolean so we can loop it
        boolean game1 = false;
        boolean game2 = false; // boolean so we can loop it
        boolean game3 = false;

        while (!running) {
            // ------- word 1 ---------
            while (!game1) {
                System.out.println(" ");
                System.out.println("Enter one of the following numbers:");
                System.out.println("1=Spin\n2=Solve\n3=Quit\n"); // user's three options for input
                System.out.println("You have " + scoreboard + " points"); // after each guess the user's score will be updated
                Scanner input = new Scanner(System.in);
                String welcome = input.nextLine();
                boolean inthere = false; // will be true if letter is in phrase
                boolean notthere = false; // will be true if letter is not in phrase

                if (welcome.equals("1")) { // if user spins the wheel
                    // random index at points
                    Random generator = new Random();
                    int randomIndex = generator.nextInt(points.length);
                    int randomPoints2 = points[randomIndex];

                    System.out.println(randomPoints2 + " points"); // the amount of points up for grabs

                    System.out.println("Enter one lowercase letter");
                    Scanner input2 = new Scanner(System.in);
                    String guess = input2.nextLine();
                    for (int i = 0; i < wordArraysub2.length; i++) {
                        // if the guessed letter is found the letter is put
                        // in the blank array revealing the letter to the user
                        if (wordArraysub2[i].equalsIgnoreCase(guess)) {
                            wordArraysub[i] = guess;
                            inthere = true; // leads to add points
                            notthere = false;

                        }

                        if (!wordArraysub2[i].equalsIgnoreCase(guess)) {
                            notthere = true;

                        }

                    }
                    if (inthere){
                        scoreboard += randomPoints2;
                        notthere = false;
                    }
                    if (notthere){
                        System.out.println("Not found");
                    }
                    printArray(wordArraysub); // prints the array after done iterating

                    if (Arrays.equals(wordArraysub, wordArraysub2)) {
                        System.out.println("You finished the puzzle! Onto round 2");
                        game1 = true;
                    }
                }
                else if (welcome.equals("2")) {
                    System.out.println("Enter the full phrase");
                    Scanner input3 = new Scanner(System.in);
                    String solve = input3.nextLine();
                    if (sub.equalsIgnoreCase(solve)) {
                        System.out.println(sub);
                        System.out.println("Correct! Onto round 2");
                        game1 = true;

                    }
                    else{
                        System.out.print("Incorrect. You lost all points");
                        scoreboard = 0;
                        printArray(wordArraysub);
                    }
                }
                else if (welcome.equals("3")) {
                    System.out.println("Thanks for playing!");
                    running = true;
                    game1 = true;
                    game2 = true;
                    game3 = true;
                }
                else{
                    System.out.println("Invalid input");

                }
            }

            // ------------ word 2 --------------
            System.out.println(" ");
            System.out.println("Category: Food");
            blank(wordFood);
            printArray(wordFood);

            while (!game2) {
                System.out.println(" ");
                System.out.print("1=Spin\n2=Solve\n3=Quit\n");
                System.out.println("You have " + scoreboard + " points");
                Scanner input = new Scanner(System.in);
                String welcome = input.nextLine();
                boolean inthere = false;
                boolean notthere = false;

                if (welcome.equals("1")) {
                    // random index at points
                    Random generator = new Random();
                    int randomIndex = generator.nextInt(points.length);
                    int randomPoints2 = points[randomIndex];

                    System.out.println(randomPoints2 + " points");
                    scoreboard += randomPoints2;
                    System.out.println("Enter a letter");
                    Scanner input2 = new Scanner(System.in);
                    String guess = input2.nextLine();
                    for (int i = 0; i < wordFood2.length; i++) {
                        // if the guessed letter is found the letter is put
                        // in the blank array revealing the letter to the user
                        if (wordFood2[i].equalsIgnoreCase(guess)) {
                            wordFood[i] = guess;
                            inthere = true;
                            notthere = false;
                        }
                        if (!wordFood2[i].equalsIgnoreCase(guess)) {
                            notthere = true;

                        }

                    }
                    if (inthere){
                        scoreboard += randomPoints2;
                        notthere = false;
                    }
                    if (notthere){
                        System.out.println("Not found");
                    }
                    printArray(wordFood);
                    if (Arrays.equals(wordFood, wordFood2)) {
                        System.out.println("You finished the puzzle! Onto round 3");
                        game2 = true;
                    }
                }
                else if (welcome.equals("2")) {
                    System.out.println("Enter the full phrase");
                    Scanner input3 = new Scanner(System.in);
                    String solve = input3.nextLine();
                    if (food.equalsIgnoreCase(solve)) {
                        System.out.println(food);
                        System.out.println("Correct! Onto round 3");
                        game2 = true;

                    }
                    else{
                        System.out.print("Incorrect. You lost all points");
                        scoreboard = 0;
                        printArray(wordFood);
                    }
                }
                else if (welcome.equals("3")) {
                    System.out.println("Thanks for playing!");
                    running = true;
                    game2 = true;
                    game3 = true;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            // ------------ word 3 --------------
            System.out.println("Category: Around the House");
            blank(wordHouse);
            printArray(wordHouse);

            while (!game3) {
                System.out.println(" ");
                System.out.print("1=Spin\n2=Solve\n3=Quit\n");
                System.out.println("You have " + scoreboard + " points");
                Scanner input = new Scanner(System.in);
                String welcome = input.nextLine();
                boolean inthere = false;
                boolean notthere = false;

                if (welcome.equals("1")) {
                    // random index at points
                    Random generator = new Random();
                    int randomIndex = generator.nextInt(points.length);
                    int randomPoints2 = points[randomIndex];

                    System.out.println(randomPoints2 + " points");
                    scoreboard += randomPoints2;
                    System.out.println("Enter a letter");
                    Scanner input2 = new Scanner(System.in);
                    String guess = input2.nextLine();
                    for (int i = 0; i < wordHouse2.length; i++) {
                        // if the guessed letter is found the letter is put
                        // in the blank array revealing the letter to the user
                        if (wordHouse2[i].equalsIgnoreCase(guess)) {
                            wordHouse[i] = guess;
                            inthere = true;
                        }
                        if (!wordHouse2[i].equalsIgnoreCase(guess)) {
                            notthere = true;

                        }

                    }
                    if (inthere){
                        scoreboard += randomPoints2;
                        notthere = false;
                    }
                    if (notthere){
                        System.out.println("Not found");
                    }
                    printArray(wordHouse); // prints the array after done iterating
                    if (Arrays.equals(wordHouse, wordHouse2)) {
                        System.out.println("You finished all three rounds");
                        running = true;
                        game3 = true;
                    }
                }
                else if (welcome.equals("2")) {
                    System.out.println("Enter the full phrase");
                    Scanner input3 = new Scanner(System.in);
                    String solve = input3.nextLine();
                    if (house.equalsIgnoreCase(solve)) {
                        System.out.println(house);
                        System.out.println("Correct! Game over");
                        System.out.println("You finished with " + scoreboard + " points.\n Thanks for playing!");
                        running = true;
                        game3 = true;
                    }
                    else{
                        System.out.print("Incorrect. You lost all points");
                        scoreboard = 0;
                        printArray(wordHouse);
                    }
                }
                else if (welcome.equals("3")) {
                    System.out.println("Thanks for playing!");
                    running = true;
                    game3 = true;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}