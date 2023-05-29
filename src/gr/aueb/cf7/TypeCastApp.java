package gr.aueb.cf7;

import java.util.Scanner;

/**
 * TypeCast from string to int
 */
public class TypeCastApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a num (int)");
        lexeme = in.next(); //diavazei oles tis times mexri na brei keno
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
