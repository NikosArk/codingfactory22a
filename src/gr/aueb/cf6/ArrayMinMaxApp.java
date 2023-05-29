package gr.aueb.cf6;


/**
 * Αναζητά το ελάχιστο και το μέγιστο
 * στοιχείο ενός πίνακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {

        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {  //εδω ξεκινησα με i=1 γιατι εχω δωσει ηδη την πρωτη τιμη σαν την ελαχιστη και χρειαζεαι να την συγκρινβ
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, Min position: %d,", minValue, minPosition + 1); //για use friendly readabily που δεν ξερει οτι ειναι το arr[3]
    }
}
