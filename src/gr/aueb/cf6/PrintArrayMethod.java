package gr.aueb.cf6;

/**
 * Εκτυπώνει ενα πινακα με την χρηση μεθοδου
 */

public class PrintArrayMethod {

    public static void main(String[] args) {

        int[] ages = {19, 25, 34, 42};
        printArray(ages);
        System.out.println();
        printArray(ages,2,3); //του λεω να ξεκινησει με low την δευτερη τιμη και high την τριτη, αρα θα μ δωσει
                                        // 34,42 γιατι ειναι 0,1,2,3 kai to 2,3 antistoizxei sto 34,42
    }

    public static void printArray(int[]arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high){
//        if (arr == null) return; // ουσιαστικα ελεγχω αν υπαρχει τιμη στη θεση του πινακα που το κανω σε μια εντολη αμεσως πιο κατω
        if ((arr == null)  || low < 0 || high > arr.length - 1) return; //  ουσιαστικα του λεω αν arr --> ( , , , ) η arr{} h {1 , 2, 3, 4, 5) που πιο πανω εχω  τεσσερις
        // to arr.length - 1 ειναι: αν εχω πινακα 10 θεσεων, ειναι απο το 0 εως 10-1, π ειναι δεκα θεσεις

        // εδω στην void εχουμε return που κανονικα δεν εχουμε, αλλα εδω σημαινει οτι αν ειναι λαθος απλα βγες.

        for(int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
