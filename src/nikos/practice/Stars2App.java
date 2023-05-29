package nikos.practice;

import java.util.Scanner;

public class Stars2App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("please a number of times");
        n = in.nextInt();

        while (i <= n) {
            System.out.printf("*");
            i++;
        }
    }
}
