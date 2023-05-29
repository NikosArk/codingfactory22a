package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν έτος
 * είναι δίσεκτο ή όχι
 */

public class LeapYearExcersice {
    public static void main(String[] args) {

        //Δήλωση Μεταβλητών
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;



        //Εντολές
        System.out.println("please give a year");
        year = in.nextInt();

        leapYear = ( year % 4 == 0 && ( year % 100 != 0)) || (( year % 4 == 0) && ( year % 100 == 0) && ( year % 400 == 0));
        System.out.println("το έτος αυτό είναι δίσεκτο "+ leapYear);


    }
}
