package nikos.practice;

import java.util.Scanner;

public class IntDigitsPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;
        int leftDigit = 0;
        int rightDigit= 0;
        int sum = 0;

        System.out.println("please give a number with two digits");
        a = in.nextInt();
        leftDigit = a/10;
        rightDigit = a%10;
        sum = leftDigit + rightDigit;

        System.out.printf("το αποτελεσμα του αριστερου %d και του δεξι %d ειανι", leftDigit, rightDigit, sum);




    }
}
