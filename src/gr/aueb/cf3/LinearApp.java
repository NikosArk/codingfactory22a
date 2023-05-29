package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Linearizes if-then-else
 */
public class LinearApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;
        boolean bingo = false;

        do {
            System.out.println("please provide a num");
            num = in.nextInt();

            if ( num != SECRET_KEY) {
                System.out.println("please try again!");
                continue;
            }

            System.out.println("Bingo");
//            break;
            bingo = true;
        } while (!bingo);
    }
}
