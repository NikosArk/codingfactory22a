package gr.aueb.cf6;

/**
 *Δήλωση, αρχικοποίηση και Populate ( εισαγωγή στοιχείων)
 */
public class PopulateArray {

    public static void main(String[] args) {

        //Δήλωση και αρχκοποίηση πίνακα με length
        int[] arr = new int[3];
        arr[0] = 5; //εδω και στα επομενα τρια κανουμε set
        arr[1] = 7;
        arr[2] = 8;

//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]); για να μην γραφω ολο αυτο, ακολουθω το ακριβως απο κατω

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // εδω κανουμε get
        }

        //Enchanced for
        for (int item : arr) {  // ιδιο με το πιο πανω και δεν υπαρχει περιπτωση να κανω λαθος, αλλα ειναι μονο για ολα τα στοιχεια
            System.out.println(item + " "); // ουσιαστικα του λες sout  για ολα τα items της array
        }



        //Unsized Initialization ( 2os τροπος να κανω population )
        int[] arr2 = {1, 5, 8, 9, 12};

        // Array Initializer
        int[] arr3;
        arr3 = new int[]{4, 6, 9, 10};
    }
}
