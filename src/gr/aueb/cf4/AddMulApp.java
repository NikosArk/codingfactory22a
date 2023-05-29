package gr.aueb.cf4;

import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζει
 * n πρώρους ακεραίους. το n το
 * δίνει ο χρήστης
 */
public class AddMulApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Plesae insert a num (int)");
        n = in.nextInt();

        for ( int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }
        System.out.println("Sum: " +sum);
        System.out.printf("Mul: %,d ", result);
    }
}
