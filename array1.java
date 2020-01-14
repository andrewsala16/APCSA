// Andrew Sala
// array1.java

import java.util.Random;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        numArray[0] = 3;
        numArray[1] = 6;
        numArray[2] = 9;
        numArray[3] = 12;
        numArray[4] = 15;
        // standard for loop
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        System.out.println("\n-----\n");
        // enhanced for loop
        for (int i : numArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----\n");
        // odd number indicies
        for (int i = 1; i < numArray.length; i+=2) {
            System.out.println(numArray[i]);
        }
        System.out.println("\n-----\n");
        //num array 2
        int[] numArray2 = new int[10];
        for (int i = 0; i < numArray2.length; i++) {
            numArray2[i] = (int)(Math.random()*19);
        }
        for (int i = 0; i < numArray2.length; i++) {
            System.out.println(numArray2[i]);
        }
        System.out.println("\n-----\n");
        int sum = 0, avg;
        for (int i = 0; i < numArray2.length; i++) {
            sum += numArray2[i];
        }
        avg = sum/numArray2.length;
        System.out.println("Average: " + avg);

        String [] hogwartsArray = new String[4];
        hogwartsArray[0] = "Gryffindor";
        hogwartsArray[1] = "Gryffindor";
        hogwartsArray[2] = "Gryffindor";
        hogwartsArray[3] = "Gryffindor";
        System.out.println("\n-----\n");
        Scanner name = new Scanner(System.in);
        System.out.println("Input your name");
        String username = name.nextLine();
        Random r = new Random();
        String house = hogwartsArray[(int)(Math.random()*hogwartsArray.length)];
        System.out.println(username + " you have been selected to " + house);
        System.out.println("\n-----\n");
        int []histogramArray = new int[5];
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
