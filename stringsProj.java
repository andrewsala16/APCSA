import java.util.Arrays;
import java.util.LinkedHashSet;

public class stringsProj {
    private static void miniProj4(String target) {
        int comma = target.indexOf(",");
        String first = target.substring(comma+2);
        String last = target.substring(0,comma);
        System.out.println(first + " " + last);
    }

    private static void miniProj5(String s) {
        String[] words = s.split(" ");
        String reverseString = "";
        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(s);
        System.out.println(reverseString);
    }

    private static void miniProj6(String s){
        int i = 0;
        int l = 0;
        while (i < s.length()) {
            String letter = s.substring(i, i + 1);
            int p = s.length() - s.replace(letter, "").length();
            if (p >= 2) {
                String word = (letter + " appears " + p + " times");
                System.out.println(word);
                l++;
            }
            i++;
        }
    }




    public static void main(String[] args) {
        miniProj4("Bloomberg, Mikey");
        miniProj5("Hey guy how ya been");
        miniProj6("Hello World");
    }
}

