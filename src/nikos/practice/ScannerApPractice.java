package nikos.practice;

import java.util.Scanner;

public class ScannerApPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int sum = 0;

        System.out.println("please give two int number");
        a = in.nextInt();
        b = in.nextInt();
        sum = a + b;

        System.out.println(a + "+" + b + "=" + sum);

    }
}
