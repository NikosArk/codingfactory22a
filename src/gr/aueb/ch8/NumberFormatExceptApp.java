package gr.aueb.ch8;

import java.util.Scanner;

public class NumberFormatExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;

        try {
            System.out.println("Please insert an int");
            inputStr = in.nextLine();
            inputNum = Integer.parseInt(inputStr); //μετατροπη απο str σε ακεραιο
            System.out.println("Input num " + inputNum);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Error in input");
        }
    }
}