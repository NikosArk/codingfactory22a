package gr.aueb.ch8;

import java.io.IOException;

/**
 * Demonstrates tje usage of Exceptions
 */
public class ExceptApp {
//
        // 1os tropos
//    public static void main(String[] args) throws IOException {
//        int ch = System.in.read(); //ΕΔΩ ΘΑ ΜΟΥ ΕΒΓΑΖΕ ΚΟΚΚΙΝΟ ΤΟ READ το οποιο ειναι checked error. για να το βγαλω
//                                    //αυτο o πρωτος τροπος ειναι να βγαζει throw h main που εχω βαλει στην main
//    }
//
//      2os tropos
// public static void main(String[] args) {
//    try {
//        int ch = System.in.read();
//    } catch (IOException ex){
//        //StdErr
//        ex.printStackTrace();
//    }
//}
//  Για μεθοδο:
public static void main(String[] args) {
    int ch;
    int[] arr = new int[10];

    try {
        ch = getNextChar();
        System.out.println(ch);
    } catch (IOException e) {
        System.out.println("Error in I/O");
    }

    for (int i = 0; i <= arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
}

    public  static int getNextChar() throws IOException {
        int ch = ' ';

        try {
            ch = System.in.read();
            return  ch;

        } catch (IOException e) {
            // 1.Rollback
            // 2.Logging
            e.printStackTrace();
            // Rethrow
            throw e;
        }
    }

}
