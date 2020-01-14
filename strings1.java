// Andrew Sala
import java.util.Arrays;

public class strings1 {
    public static void iprintArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String s1 = "Hey guys*";
        boolean asterisk = (s1.endsWith("*"));
        System.out.println(asterisk);


        String s2 = "07162003";
        if (s2.length() == 8) {
            System.out.println(s2.substring(0, 2) + "/" + s2.substring(2, 4) + "/" + s2.substring(4, 8));

        } else {
            System.out.println("invalid input");
        }


        String s3 = "07-16-2003";
        if (s3.substring(2, 3).equals("-")) {
            System.out.println(s3.substring(0, 2) + s3.substring(3, 5) + s3.substring(6, 10));
        } else {
            System.out.println("invalid input");
        }


        String s4 = "1111222233334444";
        if (s4.length() == 16) {
            System.out.println(s4.substring(0, 4) + " " + s4.substring(4, 8) + " " + s4.substring(8, 12) + " " + s4.substring(12, 16));
        } else {
            System.out.println("invalid input");
        }


        String s5 = "Andrew";
        int whatIndex = s5.indexOf("z");
        if (whatIndex > 0) {
            System.out.println(whatIndex);
        } else {
            System.out.println("Letter not found");
        }


        String s6 = "Lifestyle";
        System.out.println(s6.substring(1, s6.length()) + s6.substring(0, 1));


        String s7 = "Wal";
        String s = s7.toUpperCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                System.out.println("Jolly likes");
            } else {
                System.out.println("Don't like");
                break;
            }

        }


        String s8 = "Doorbell";
        for (int i = 0; i < s8.length() - 1; i++) {
            if (s8.substring(i, i + 1).equalsIgnoreCase(s8.substring(i + 1, i + 2))) {
                String nodub = s8.replace(s8.substring(i, i + 1), "-");
                System.out.println(nodub);
            }
        }


        String[] s9arra = {"Andrew", "Alex", "John", "Cashew"};
        int min;
        String temp;
        for (int index = 0; index < s9arra.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < s9arra.length; scan++) {
                if (s9arra[scan].compareTo(s9arra[min]) > 0) {
                    min = scan;
                }
            }
            temp = s9arra[min];
            s9arra[min] = s9arra[index];
            s9arra[index] = temp;
        }
        iprintArr(s9arra);


        String s10 = "Lifestyle";
        char[] word = s10.toCharArray();
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}
