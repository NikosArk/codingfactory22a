package gr.aueb.cf.ch6;


/**
 * Αναπτύξτε μια μέθοδο εύρεσης μεγίστου
 * ενός πίνακα
 */
public class ExcersiceCh6 {

    public static int getMaxPosition(int[] arr, int low, int high){
        int maxPosition = low;
        int maxValue = 0;

        if ((arr == null) ||( low < 0 ) || (high > arr.length -1) ) {
            System.out.println("Error in array, check again");
            return -1;
        }
        maxValue = arr[low];
        for (int i = 1; i < arr.length; i++ ) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;


    }
}
