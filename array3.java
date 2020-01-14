// Andrew Sala
//array3
public class array3 {
    public static void iprintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
                48, 49, 50};

        int[] unSortedArray = {86, 57, 33, 88, 55, 20, 43, 98, 93, 28, 3,
                32, 83, 97, 81, 15, 19, 49, 9, 21, 95, 18, 73, 6, 34, 58, 66,
                13, 45, 56, 44, 62, 67, 82, 52, 59, 36, 76, 89, 11, 63, 69, 94,
                74, 23, 99, 41, 77, 7, 10, 79, 40, 90, 26, 61, 38, 75, 5, 14,
                68, 85, 16, 64, 39, 35, 53, 54, 50, 22, 51, 29, 17, 12, 25, 84,
                42, 87, 47, 2, 96, 31, 65, 71, 48, 4, 70, 24, 46, 60, 92, 72,
                80, 100, 8, 78, 37, 1, 27, 30, 91,};

        //binary search

        int search = 19;
        int search2 = 51;
        int foundorr = -1;
        int low = 0, high = sortedArray.length - 1, middle = (low + high) / 2;

        while(sortedArray[middle] != search && low <= high){
            if (search < sortedArray[middle]){
                high = middle-1;
            }
            else{
                low = middle + 1;
            }
            middle = (low+high)/2;
        }
        if(sortedArray[middle]==search){
            foundorr = middle;
        }
        if (foundorr >= 0){
            System.out.println(search + " is at index " + middle);
        }
        else{
            System.out.println("We could not fint that number");
        }

        while(sortedArray[middle] != search2 && low <= high){
            if (search2 < sortedArray[middle]){
                high = middle-1;
            }
            else{
                low = middle + 1;
            }
            middle = (low+high)/2;
        }
        if(sortedArray[middle]==search2){
            foundorr = middle;
        }
        else{
            foundorr = -1;
        }
        if (foundorr >= 0){
            System.out.println(search2 + " is at index " + middle);
        }
        else{
            System.out.println("We could not find that number");
        }

        //linear search
        int linear = 39;
        boolean found = false;
        int index = -1;


        for(int i = 0; i < unSortedArray.length; i++){
            if(unSortedArray[i] == linear){
                found = true;
                index = i;
            }
        }
        if(found){
            System.out.println(linear+" is at index "+ index);
        }
        else{
            System.out.println("We could not find it");
        }

        iprintArr(unSortedArray);
        System.out.println("\n----------\n");
        int min, temp;

        for(int index1 = 0; index1 < unSortedArray.length-1; index1++){
            min =index1;

            for (int scan = index1+1; scan < unSortedArray.length; scan++){
                if (unSortedArray[scan] < unSortedArray[min]){
                    min = scan;
                }
            }
            temp = unSortedArray[min];
            unSortedArray[min] = unSortedArray[index1];
            unSortedArray[index1] = temp;

        }
        iprintArr(unSortedArray);




    }
}
