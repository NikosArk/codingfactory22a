package gr.aueb.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try (in) {  // το ιν παει για το scanner static in
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
//            e.printStackTrace();
            System.out.println("Ooops error!");
        }
    }
}
