package gr.aueb.cf5;

import java.util.Scanner;

/**
 * Ελέγχει ισότητα / ανισότητα στους
 * floating points
 */

public class DoubleCompareApp {
    public static void main(String[] args) {

        double d1;
        double d2;
        final double EPSILON = 0.005;
        Scanner in = new Scanner(System.in);

        System.out.println("please give two doubles");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if (Math.abs(d2 - d1) <= EPSILON) { //to Math.abs ειναι το απολυτο και το εβαλα γιατι δεν ξερω το αποτελεσμα θα μ δωσει ξ πραξη
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        }
    }
