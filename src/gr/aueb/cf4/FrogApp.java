package gr.aueb.cf4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * ο frog βρίσκεται στη θέση X και θέλει να φτάσει στη
 * θέση Y ( ή σε θέση > Υ ). Ο frog jumps a fixed distance D.
 * Bρίσκει τον ελάχιστο αριθμο jumps που πρέπει να κάνει ώστε να φτασει( ή να ξεπεράσει) τον στόχο
 *
 * π.χ
 * Χ = 10
 * Υ = 85
 * Δ = 30
 *
 * τοτε θα χρειαστει 3 jumps giati:
 * starts at 10, και μετα το 1ο jumps πάει στην θεση 10+30=40
 * στο δευτερο παει 40 + 30 = 70
 * και στο τριτο jump παει  70 + 30 = 100
 */

public class FrogApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int d = 0;
        int jumps = 0;

        System.out.println("please give start, end, step");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

        // jumps = (int) Math.ceil((y-x)/ (double) jumps; θα μποροθσα να κανω αυτο

        for (int i = x; i < y; i = i + d) {
            jumps++;
        }
        System.out.println("xreiastike tosa jumps: " + jumps);


    }
}





