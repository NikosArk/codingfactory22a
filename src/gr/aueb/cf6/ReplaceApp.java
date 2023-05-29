package gr.aueb.cf6;

/**
 * Updates a value in an array
 */
public class ReplaceApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 15};
        replace(arr, 6, 56);
        for (int item : arr) {
            System.out.print(item + " ");
        }


    }

    /**
     * Updates oldVal with newVal, id oldVal exists
     *
     * @param arr    the given array
     * @param oldVal the value to be updated
     * @param newVal the new value
     */
    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate = -1;

        if (arr == null) return;
        positionToUpdate = getIndex(arr, oldVal);
        if (positionToUpdate == -1) return;
        arr[positionToUpdate] = newVal;
    }

    public static int getIndex(int[] arr, int value) {
        if (arr == null) return -1; // αν ειναι κενος ο πινακας δεν θα βρει την τιμη, οποτε θα επσιτρεψει -1

        int position = -1;  // δεν μπορω να το δηλωσω 0 οπως κανω συνηθως γιατι ετσι θα παρει τη θεση του πινακα 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break; // το break διακοπτει παντα iterations. οχι την if alla thn epanalipsi0
            }
        }
        return position;
    }
}
