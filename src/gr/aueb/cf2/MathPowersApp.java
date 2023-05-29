package gr.aueb.cf2;

import java.util.Scanner;

/**
 * Βρίσκει το τετράγωνο και τον κύβο ενός
 * ακεραίου που δίνει ο χρήστης.
 */

public class MathPowersApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please isnert num (int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square %d, cube %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3)); // τα int στις παρενθεσεις
        //ειναι γιατι η δυναμη στην java επιστρεφει double οποτε κανω typcast. Επισις πιο πανω εχω βαλει %d που ειναι
        // για int
    }
}
