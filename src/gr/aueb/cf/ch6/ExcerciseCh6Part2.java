package gr.aueb.cf.ch6;


/**
 * Αναπτύξτε ένα πρόγραμμα που βρίσκει το 2ο
 * μικρότερο στοιχειο ενός πίνακα
 */
public class ExcerciseCh6Part2 {
    public static void main(String[] args) {
        int arr [] = {12, 54, 10, 56, 1, 66} ;
        int minValue;
        int minPosition = 0;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            // Find min value
            minPosition = i;
            minValue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {   //i + 1 γιατι δεν κανω συγκριση στην πρωτη τιμη αφου  την εχω θεωρησει ελαχιστη
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }

            // swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;

        }
        System.out.println("Η δεύτερη μικρότερη τιμή είναι: " + arr[1]);
        }
    }
