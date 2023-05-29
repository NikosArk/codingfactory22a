package gr.aueb.cf7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please privide a string");
//        s = in.next(); // end with whitespace (space, \t, \n)
        s = in.nextLine();

        System.out.println(s);
    }
}
