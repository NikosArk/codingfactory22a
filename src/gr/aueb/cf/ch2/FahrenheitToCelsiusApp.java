package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δίνουμε και εκτυπώνει βαθμούς σε φαρενάϊτ και
 * τους μετατρέπει σε κελσίους.
 */

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {

        //Δήλωση Μεταβλητών
        Scanner in = new Scanner(System.in);
        int f = 0;
        int c = 0;

        //Εντολές
        System.out.println("Παρακαλώ δώστε θερμοκρασία");
        f = in.nextInt();
        c = 5 * (f - 32) / 9 ;

        //Εκτύπωση Εντολών
        System.out.printf("οι βαθμοί φαρενάϊτ \u2109%d είναι \u00B0C%d σε κελσίους ", f, c);



    }
}
