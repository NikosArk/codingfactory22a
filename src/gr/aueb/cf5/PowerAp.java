package gr.aueb.cf5;

import java.util.Scanner;

/**
 * Υπολογίζει το α^ν
 */

public class PowerAp {

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result;

        result = pow(a, n);

        System.out.println("Result: " + result);


    }


    /**
     * Returns the power of an int
     * @param a the base.
     * @param n the power to raise.
     * @return  the power of a^n.
     */
    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
        power = power * a;
        }
        return power;

}
}
