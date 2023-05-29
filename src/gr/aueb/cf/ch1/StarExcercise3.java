package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Eκτυπώνει n γραμμες με n αστερακια σε καθε γραμμη
 *
 */


public class StarExcercise3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Please give the number of stars");
            n = in.nextInt();
            if (n < 0) {
                System.out.println("Invalid Number");
                continue;
            } else if (n == 0) {
                System.out.println("Zero Stars");
                continue;
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                    System.out.print('*');
                }
                    System.out.println("");
                    }

            }
        } while (n <= 0) ;
    }
}
