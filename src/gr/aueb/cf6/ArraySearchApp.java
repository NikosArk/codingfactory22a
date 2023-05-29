package gr.aueb.cf6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

//        for( int item : arr) {
//            if (item == SECRET) {
//                secretIsFound = true;
//                break;
//            }
//        } o ενας τροπος να το γραψω

        for ( int i = 0; i < arr.length; i++) {
            if ( SECRET == arr[i] ) {
                    secretIsFound = true;
                    break; // αλλα καλυτερα το πιο πανω γιατι δεν προκειται να κανει λαθος στο νουμερο των κελιων
            }
        }


        if (secretIsFound) {
            System.out.println("Secret Key was found");
        } else {
            System.out.println("Secret key was not found");
        }
    }
}
