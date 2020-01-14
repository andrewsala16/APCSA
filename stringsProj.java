// Andrew Sala
// stringsProj.java

public class stringsProj {
    private static void miniProj4(String name) { // format name
        System.out.println(name); // original input
        int comma = name.indexOf(","); // finds where the comma is in the string
        String first = name.substring(comma+2); // the FIRST name if everything AFTER the comma
        String last = name.substring(0,comma); // the LAST name if everything BEFORE the comma
        System.out.println(first + " " + last); // prints each variable after
        // easy
    }

    private static void miniProj5(String s) { // reverse each
        System.out.println(s); // original sentance
        String[] words = s.split(" "); // splits each word in sentance by the spaces
        String reverseString = ""; // blank string that will be appended to
        for (String word : words) { // for
            String reverseWord = ""; // blank string that will be each word
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j); // adding the letter of each word starting from the last letter
            }
            reverseString += reverseWord + " "; // adds each reverse word to the first blank string
        }

        System.out.println(reverseString); // sentance with reversed words
        // still easy
    }


    private static void miniProj6 (String phrase){ // how many multiples
        System.out.println(phrase); // original phrase
        int counter = 0;
        String [] array = new String[phrase.length()];
        for (int i = 0; i < array.length; i++){
            array[i] = "word";
        }
        for (int i = 0; i < phrase.length(); i++){
            String letter = phrase.substring(i, i + 1);
            int p = phrase.length() - phrase.replace(letter, "").length();

            if (p >= 2){
                array[counter] = (phrase.substring(i, i + 1) + " repeats " + (p) + " times");
                counter++;
            }

        }

        if (counter == 0){
            System.out.println("No repeats");
        }
        for (int i = 0; i < array.length; i++){
            String arrayval = array[i];
            for(int j = 0; j < array.length; j++){
                if (array[j].equals(arrayval) && j != i){
                    array[j] = "word1";
                }
            }
        }
        for (String k: array){
            if (!k.equals("word") && !k.equals("word1")){
                System.out.println(k);
            }
        }
        // not easy
    }





    public static void main(String[] args) {
        miniProj4("Bloomberg, Mike");
        System.out.println("----------------------------");
        miniProj5("Hey guy how ya been");
        System.out.println("----------------------------");
        miniProj6("hello world");
    }
}
