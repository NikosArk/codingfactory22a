package nikos.practice;

import java.util.Scanner;

public class AddPositivesAPP {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;

        int positiveNumbers = 0;

        System.out.println("please give a positive number(or negative to exit");
        n = in.nextInt();

        while (n>=0) {
            System.out.println("a positive has been inserted");
            positiveNumbers++;
            n = in.nextInt();

        }
        System.out.println("you have given a negative numer");
        System.out.println("the positives number you have given is" + positiveNumbers);


    }
}
