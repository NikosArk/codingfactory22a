package nikos.practice;

import java.util.Scanner;

public class MaxOfThreePractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.printf("το μέγιστο των τριών αριθμών %d, %d, %d είναι %d", a, b, c, Math.max(a, Math.max(b,c)));
    }
}
