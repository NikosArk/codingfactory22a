package gr.aueb.cf5;

/**
 * Recursive n!
 */

public class FactorialRecursiveApp {

    public static void main(String[] args) {

    }


    /**
     * Recursive solution of n!
     * @param n  n of n!
     * @return  n!.
     */
    public static int facto(int n) {
        if ( n <= 1) return 1;
        return n* facto(n-1);
//        return (n <= 1) ? 1 : n * facto(n-1); // ιδιο με το πανω, αλλα πιο ωραιο

    }
}