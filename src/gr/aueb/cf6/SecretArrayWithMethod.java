package gr.aueb.cf6;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα
 */
public class SecretArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);


    }

    /**
     * Επιστρέφει το index του στοιχείου που αναζητά
     * ή αν δεν το βει επιστρέφει -1
     *
     * @param arr  ο input αrray
     * @param value  η τιμη που αναζητάμε
     * @return      το index aν το στοιχείο βρεθεί, -1 otherwise
     */
    public static int  getElementPosition(int[] arr, int value) {
        if (arr == null) return -1; // αν ειναι κενος ο πινακας δεν θα βρει την τιμη, οποτε θα επσιτρεψει -1

        int position = -1;  // δεν μπορω να το δηλωσω 0 οπως κανω συνηθως γιατι ετσι θα παρει τη θεση του πινακα 0
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == value) {
                position = i;
                break; // το break διακοπτει παντα iterations. οχι την if alla thn epanalipsi0
            }
        }
            return position;



    }
}
