package gr.aueb.cf6;


/**
 * Array sort with Selection Sort Time
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 14, 3, 25, 12};

        int minVal;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            // Find min value
            minPosition = i;
            minVal = arr[i];
            for (int j = i + 1; j < arr.length; j++) {   //i + 1 γιατι δεν κανω συγκριση στην πρωτη τιμη αφου  την εχω θεωρησει ελαχιστη
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            // swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;

        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}


