package gr.aueb.cf4;

import java.util.Scanner;

/**
 * Διαβάζει εναν char με Scanner
 */
public class CharScannerApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char inputChar;

        System.out.println("please insert a char");
        inputChar = in.next().charAt(0);
        System.out.println("Char: " + inputChar);
    }
}
