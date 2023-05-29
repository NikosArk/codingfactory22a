package gr.aueb.cf6;

/**
 * Replaces all array digits with the next digit
 */
public class ReplaceNextDigitApp {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 8};
        shiftLeftByOne(arr, 0); // 2, 9, 8, 0
    }

    public static void shiftLeftByOne(int[] arr,int low) {
        if ( arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // ousiastika του λεω να παρει την θεση ι και βαλει την επομενη
            // dld to 5 θα παρει την 2, η 2 την 9 και η 9 την 8. για την arr[3] δεν με νοιαζει γιατι θα παρει την 0
            // για αυτο στην for το length sthn arr einai -1

        }

        arr[arr.length -1] = 0;

    }
}
