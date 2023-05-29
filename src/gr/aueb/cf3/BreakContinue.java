package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Δείχνει την χρήση των break και
 * continue
 */
public class BreakContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("please provide a num");
            num = in.nextInt();

            if ( num == 5) {
                continue;       // στελνει απευθειας την επαναληψη στην αρχη του λουπ, δηλαδη στον sentinel, χωρις να υπολογιζει τα παρακατω
            }
            sum += num;

            if (num == 10) {
                System.out.println("Bingo!!");
                break;
            }

        }

        System.out.println("sum " + sum);
    }
}
