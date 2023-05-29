package gr.aueb.cf3;

import java.util.Scanner;

/**
 * Αποφασίζει αν ενα ετος ειναι δισεκτο οπου δισκετο σημαινει
 *  το ετος να διαιρειται με το 4, να μην διαιρειται με το 100, και να διαιρειται
 *  και με το 400
 */
public class LeapYearApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("please provide a year (int)");
        isLeap = year % 4 == 0 && (year % 100 !=0 || year % 400 == 0);
    }
}
