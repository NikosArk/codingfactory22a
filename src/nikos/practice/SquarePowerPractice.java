package nikos.practice;

import java.util.Scanner;

public class SquarePowerPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        num = sc.nextInt();

        System.out.printf("το τρετραγωνο του %d ειναι και ο κυβος ειανι %d ", (int) Math.pow(num,2), (int) Math.pow(num, 3));
    }
}
