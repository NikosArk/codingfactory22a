package gr.aueb.cf5;

import java.util.Scanner;

/**
 * αποφασιζει αν ενας int ειμαι αρτιος
 * ή περιττός
 */
public class EvenOddApp {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("please insert an int");
        num = in.nextInt();

        isEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isEven);


    }

    /**
     * Evaluates an int if it is even or not.
     *
     * @param n  the number (int) to evaluate
     * @return  true, if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0; // και ο πιο κατω τροπος ειναι σωστος αλλα αυτος ειναι συντομοτερος

//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
