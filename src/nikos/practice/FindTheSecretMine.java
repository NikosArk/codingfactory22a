package nikos.practice;

import java.util.Scanner;

public class FindTheSecretMine {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SERCRET_KEY = 12;
        int num = 0;

        for (int i = 1; i <= 10 ; i++) {
            num = in.nextInt();

            if ( num == SERCRET_KEY) {
                System.out.println("you win");
                break;
            }
                else if (i <= 9) {
                System.out.println("please try again");

            }

        }
        System.out.println("its ok try again");


    }
}
