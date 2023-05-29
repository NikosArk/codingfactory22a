package nikos.practice;

import java.util.Scanner;

public class LightsOnPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int Max_Speed = 100;
        int speed = 0;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("please tell us if it is rainging(true/false)");
        isRaining = in.nextBoolean();

        System.out.println("please tell us if it is dark(true/false)");
        isDark = in.nextBoolean();

        System.out.println("please give us the speed");
        speed = in.nextInt();

        lightsOn = isRaining && ((speed > Max_Speed) || isDark);
        System.out.println("anoixte ta fwta " + lightsOn);





    }
}
