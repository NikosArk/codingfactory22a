package gr.aueb.cf5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές doyble από τον χρήστη, τις a,b,c
 * όπου a είναι η υποτείνουσα και b, c οι δύο πλευρές
 * El;egxei dld an to tr;igvno e;inai oruo;gvnio, dld
 *
 */

public class RightTriangleApp {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        final double EPSILON = 0.000006;

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON) { //ΛΟΙΠΟΝ!! εδω συγκρινω με την σταθερα epsilon, π την εχω βαλει επιτηδες με τοσα δεκαδικα, γιατι ετσι αναγκαζω να τσεκαρει μεχρι 6 δεκαδικους
            //διαφορετικα αν ηταν 0.00005 και 0.00006 αυτα τα θεωρει ισα γιατι ειναι πλ μικρα. Ετσι ομως το αναγκαζω να τα τσεκαρει
            System.out.println("ειναι ορθογώνιο");
        } else {
            System.out.println("δεν ειναι ορθογωνιο");
        }

    }
}

