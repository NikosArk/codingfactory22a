package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Ο χρήστης να δίνει το πλήθος των stars n
 * που θα εμφανίζονται σε οριζόντια θέση
 */

public class StarsExcersice1 {
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
                    System.out.print('*');
                }
            }
        } while (n <= 0) ;
    }
}
