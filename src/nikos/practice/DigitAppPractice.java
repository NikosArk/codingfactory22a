package nikos.practice;

import java.util.Scanner;

public class DigitAppPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int count = 0;
        int inputNumb;

        inputNumb = in.nextInt();
        a = inputNumb;


        do {
            count++;
            a = a/10;

        } while (a!=0);
        System.out.printf("to plithos twn psifion toy %d einai %d", inputNumb, count);
    }
}
