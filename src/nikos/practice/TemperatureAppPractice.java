package nikos.practice;

import java.util.Scanner;

public class TemperatureAppPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isSnowing = false;

        System.out.println("please give a temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);
        System.out.println("is snowing: "+ isSnowing);
    }
}
