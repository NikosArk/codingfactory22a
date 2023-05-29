package gr.aueb.cf2;

import java.util.Scanner;

/**
 *  Διαβάζει ώρες , λεπτά και δεύτερα και
 *  μετατρέπει σε δευτερόλεπτα.
 */

public class SecondsApp {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSecs = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours and seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSecs = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE +inputSeconds;

        System.out.printf("%d hours, %d minutes, %d seconds = %,d total seconds", inputHours, inputMinutes,
                inputSeconds, totalSecs); // το κομμα στο %,d ειναι για να μ βαλει κομμα επειδη ειναι μεγαλο νουμερο
                                            // και να με βοηθησει στο να το διαβασω.


    }

}
