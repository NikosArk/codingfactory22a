package nikos.practice;

import java.util.Scanner;

public class PowerAppPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int i = 1;
        int result = 1;

        a = in.nextInt();
        b = in.nextInt();

        while (i <= b) {
            result = result * a;
            i++;


        }

        System.out.printf("i dinami toy %d eis thn %d einai %d", a, b, result );


    }
}
