public class arrayTwo {
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void iprintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        String [] strArray = {"Peanut", "Walnut", "Coconut",
        "Macadamia", "New Jersey", "Cashew",
        "Pistachio", "Almond", "Hazelnut", "Chestnut"};
        String [] strArray2 = {"Rhode Island", "New Jersey",
        "Delaware", "Vermont",
        "New York", "Massachusetts", "New Hampshire", "Maine", "Maryland", "New Mexico"};

        String target = "hey";
        Boolean found = false;

        for(int i = 0; i < strArray.length; i++){
            if (strArray[i].equals(target)){
                found = true;

            }
        }
        if (found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

        for(int i = 0; i < strArray2.length; i++){
            if (strArray2[i].equals(target)){
                found = true;
            }
        }
        if (found){
            System.out.println("Found\n");
        }
        else{
            System.out.println("Not Found\n");
        }
        System.out.println("\n------------\n");
        int index = -1;
        int index2 = -1;
        for(int i = 0; i < strArray.length; i++){
            for(int j = 0; j < strArray2.length;j++){
                if (strArray2[j].equals(strArray[i])){
                    found = true;
                    index = j;
                    index2 = i;
                }
            }
        }
        if (found){
            System.out.println("\nCommon Elements! Found at index " + index + " in strArray and index " + index2 + " in strArray2\n");
        }
        else{
            System.out.println("No Common Elements\n");
        }
        System.out.println("\n------------\n");
        target = "Peanut";
        for(int i = 0; i < strArray.length; i++){
            if (strArray[i].equals(target)){
                strArray[i] = "#removed";
            }
        }
        printArr(strArray);
        System.out.println("\n------------\n");
        strArray[0] = "Peanut";
        for(int i = 0; i < strArray.length/2; i++){
            String temp = strArray[i];

            strArray[i] = strArray[strArray.length - i - 1];

            strArray[strArray.length - i - 1] = temp;
        }
        printArr(strArray);
        System.out.println("\n------------\n");
        String [] strArray2v2 = new String[strArray2.length];
        strArray2v2 = strArray2;
        printArr(strArray2v2);

        int[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] intArray1 = {12, 13, 15, 17, 19, 20, 21, 22, 29, 28};

        int iTarget = 12;
        Boolean ifound = false;
        System.out.println("\n------------\n");
        for(int i = 0; i < intArray.length; i++){
            if (intArray[i] == iTarget){
                ifound = true;

            }
        }
        if (ifound){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println("\n------------\n");
        int iindex = -1;
        int iindex2 = -1;
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray1.length;j++){
                if (intArray1[j] == (intArray[i])){
                    ifound = true;
                    iindex = j;
                    iindex2 = i;
                }
            }
        }
        if (ifound){
            System.out.println("\nCommon Elements! Found at index " + iindex + " in intArray and index " + iindex2 + " in intArray1\n");
        }
        else{
            System.out.println("No Common Elements\n");
        }
        System.out.println("\n------------\n");
        for(int i = 0; i < intArray.length/2; i++){
            int temp = intArray[i];

            intArray[i] = intArray[intArray.length - i - 1];

            intArray[intArray.length - i - 1] = temp;
        }
        iprintArr(intArray);

        for(int i = 0; i < intArray1.length/2; i++){
            int temp = intArray1[i];

            intArray1[i] = intArray1[intArray1.length - i - 1];

            intArray1[intArray1.length - i - 1] = temp;
        }
        iprintArr(intArray1);
        System.out.println("\n------------\n");
        int [] dupIntArray2;
        dupIntArray2 = intArray;
        iprintArr(dupIntArray2);
        System.out.println("\n------------\n");

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < intArray1.length; i++){
            if (intArray1[i] < min){
                min = intArray1[i];
                index = i;
            }
        }
        System.out.println("intArray1 " + index + " is " + min);





    }
}
