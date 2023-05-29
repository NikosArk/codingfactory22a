package gr.aueb.cf5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του  (n!)
 * με την μέθοδο  facto()
 *
 */

public class FactorialApp {

    public static void main(String[] args) {
        int n;
        int result;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert n (int)");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("%d! = %d", n, result);


    }

    /**
     *
     * returns n!
     * @param n     the number (n) of n!
     * @return      1 * 2 * 3 * .... * n
     */
    public static int facto(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;





    }
}
