package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάσει
 * τη θερμοκρασία. Αν ξ θερμοκρασία
 * είναι <0, τότε χιονίζει, αλλίως δεν
 * χιονίχει. Ο χρήστης δίνει την θερμοκρασία.
 */

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing:" + isSnowing);


    }
}
