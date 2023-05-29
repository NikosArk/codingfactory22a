package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Ternary operator
 */
public class AbsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please provide a num");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;
//        abs = (num > 0) ? num : (num < 0) ? -num : 0 ; το ιδιο με το απο πανω αλλα πιο ακριβες στη επεξηγηση

        System.out.println("Abs: " + abs);
    }
}
