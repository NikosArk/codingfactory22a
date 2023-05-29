package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάσει τρεις μεταβλητές:
 * αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον
 * απο τα επόμενα: είναι σκοτάδι Ή τρέχουμε (speed > 100 ).
 * Τις τιμλες αυτές τις λαμβάνουμε απο τον χρήστη (stdin).
 *
 */

public class LightsOnApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean LigtsOn= false;
        final int MAX_SPEED = 100;

        System.out.println("Please isnert if it is raining (true/false");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();


        isRunning = (speed > MAX_SPEED);
        LigtsOn = isRaining && ( isDark || isRunning);
        System.out.println("Lights On:" + LigtsOn );
    }
}
