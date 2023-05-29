package nikos.practice;

import java.util.Scanner;

public class FactorialPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 1;
        int i = 0;

        n = in.nextInt();


        while (i <= n) {
            result = result * i;
            i++;
        }

    }
}
