package nikos.practice;

import java.util.Scanner;

public class MenyDoWhilePractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("epilekste ena apo ta parakatw");
            System.out.println("1/ eisagwgh proionto");
            System.out.println("2. den kerwt ti");
            System.out.println("3. gia eksodos");
            a = in.nextInt();
        }    while ( a!= 3); ;

        System.out.println("euxaristoyme");
    }
}
