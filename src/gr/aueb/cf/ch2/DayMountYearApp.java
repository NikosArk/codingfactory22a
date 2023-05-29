package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Δίνουμε και εκτυπώνει ημερομηνία
 * σε ημέρα, μήνα και έτος
 */
public class DayMountYearApp {
    public static void main(String[] args) {

        //Δήλωση Μεταβλητών
        Scanner in = new Scanner(System.in);
        int day1 = 0;
        int mount1 = 0;
        int year1 = 0;

        //Εντολές
        System.out.println("please give a number between 1,31");
        day1 = in.nextInt();
        System.out.println("please give a number between 1,12");
        mount1 = in.nextInt();
        System.out.println("please give a number with max two digits");
        year1 = in.nextInt();

        //Εκτύπωση
        System.out.printf("%02d/%02d/%02d", day1, mount1, year1 % 100); // για να παρω μονο τα δυο τελευταια ψηφια



    }
}
