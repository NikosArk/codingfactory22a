package gr.aueb.cf2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε Days,
 * Hours, Minutes, Secs
 */

public class SecondsDemo {
    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        final int DAYS_SECS = 24 * 3600;
        final int HOURS_SECS = 3600;
        final  int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert the total amount seconds");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds /   DAYS_SECS;
        remainingSeconds = remainingSeconds % DAYS_SECS;

        hours = remainingSeconds / HOURS_SECS;
        remainingSeconds = remainingSeconds % HOURS_SECS;

        minutes = remainingSeconds / MINUTES_SECS;
        remainingSeconds = remainingSeconds % MINUTES_SECS;

        System.out.printf("%,d input seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds); // το κομμα στο %,d ειναι για να μ
                                                                        // βαλει κομμα επειδη ειναι μεγαλο νουμερο
                                                                        // και να με βοηθησει στο να το διαβασω.





    }
}
