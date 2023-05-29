package nikos.practice;

import java.util.Scanner;

public class SnowingPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("please give a temperature");
        temp = in.nextInt();

        System.out.println("please tell us if is raining (true/false");
        isRaining = in.nextBoolean();

        isSnowing = (temp <0) && isRaining;
        System.out.println("xionizei: " + isSnowing);
    }
}
