// Andrew Sala
// loops2.java
import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            System.out.println(i);
        }
        System.out.println("\n-----------\n");
        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("\n-----------\n");
        for(int i=0; i<110; i+=10){
            System.out.println(i);
        }
        System.out.println("\n-----------\n");
        for(int i=0; i<10; i++){
            System.out.println(1 +(int)(Math.random()*16));
        }
        System.out.println("\n-----------\n");
        String hey = "";
        for(int i=0; i<20; i++){
            System.out.print("*" );
        }
        System.out.println("\n-----------\n");
        System.out.println("Enter a number");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        for(int i=number; i<101; i++){
            System.out.println(i);
        }
        System.out.println("\n-----------\n");
        System.out.println("Enter your name");
        Scanner name = new Scanner(System.in);
        String x = name.nextLine();
        System.out.println("How many times ");
        Scanner times = new Scanner(System.in);
        int time = times.nextInt();
        for(int i=0; i<time; i++){
            System.out.println(x);
        }
        System.out.println("\n-----------\n");
        //bonus dont work
        int rows = 7;
        for(int i=1; i<=rows; i++){
            for(int l=1; l<=i; l++){
                System.out.print(l + "*");
            }
        }
    }
}
