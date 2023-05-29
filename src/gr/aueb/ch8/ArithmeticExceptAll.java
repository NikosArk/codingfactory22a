package gr.aueb.ch8;

import java.util.Scanner;

public class ArithmeticExceptAll {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int result;


        System.out.println("Please insert");
        num1 = in.nextInt();
        num2 = in.nextInt();

//        try {   και αυτος ο τροπος σωστος ειναι αλλα με μια if λυνονται ολα, το καναμε για δειξουμε πως ειναι το try-catch
//            result = num1/num2;
//        }catch (ArithmeticException e) {
//            System.out.println("Please ...");
//        }

        if (num2 == 0) {
            System.out.println("εισαι βλακας και εδωσες 0, δωσε κατι αλλο για να μην σε διαλυσω");
            System.exit(1);
        }

        result = num1 / num2;
        System.out.println("ψιτ ομορφε, η διαιρεση ειναι: " + result);
    }
}
