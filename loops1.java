//Andrew Sala
//loops1.java
import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        int i = 0;
        while(i <51){
            System.out.println(i ++);
        }
        System.out.println("\n------------\n");
        int count = 0;
        while(count < 100){
            System.out.println(count +=5);
        }
        System.out.println("\n------------\n");


        int check = 5;
        while(check == 5){
            System.out.println("Guess a number between 1 and 5");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            int cpu = (1 + (int) (Math.random() * 5));
            if (guess != cpu) {
                System.out.println("wrong");
            }
            else{
                System.out.println("Correct");
                check = 4;
            }
        }

        while(5 == 5){
            System.out.println("Would you like a fun fact?");
            Scanner input1 = new Scanner(System.in);
            String facts = input1.nextLine();
            if(facts.equals("yes")){
                int rand = (1 + (int) (Math.random() * 6));
                if(rand == 1){
                    System.out.println("hey");
                }
                if(rand == 2){
                    System.out.println("hey");
                }
                if(rand == 3){
                    System.out.println("hey");
                }
                if(rand == 4){
                    System.out.println("hey");
                }
                if(rand == 5){
                    System.out.println("hey");
                }
                if(rand == 6){
                    System.out.println("hey");
                }
            }
            else if(facts.equals("no")){
                System.out.println("bye");
                break;
            }
        }

    }
}
