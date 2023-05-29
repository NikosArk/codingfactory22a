package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι
 * με βάση όχι μόνο την θερμοκρασία
 * αλλά και το αν βρέχει. Αν βρέχει και βρέχει και η
 * θερμοκρασία είναι >0, τότε χιονίζει, αλλίως όχι.
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRainging = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRainging = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRainging && (temp<0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
