package gr.aueb.cf6;

import java.util.Arrays;

/**
 * makes an array copy by using
 * utility methods
 */
public class ArrayCopyApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int[] arr3;

//        System.arraycopy(arr, 0, arr2, 0, arr.length);     ( 1os τροπος, ετοιμη μεθοδος)
         // ειναι μια ετοιμη μεθοδος που σου ζηταει απο ποιον πινακα θες να αντιγραψεις (arr)
        // απο ποια θεση θες να αντιγραωεις (0), σε ποιον πινακα θες να αντιγταψεις (arr2), απο ποια θεση θες να ξεκινησεις παλι, και το length

        //Arrays class
        arr3 = Arrays.copyOf(arr, arr.length); // 2ος τροπος
        arr3 = Arrays.copyOfRange(arr, 0, arr.length);  //3οσ τροπος, πιο ευελικτος γιατι του λεμε απο που να ξεκιναει και που να τελειωνει
    }
}
