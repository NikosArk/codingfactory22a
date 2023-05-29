package gr.aueb.cf6;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Array Populate from file
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/Nikos/Documents/Coding Factory/java/tmp/intfile.txt"); //συνδεεται με εαν αρχειο, στην συγκεκριμενη περιπτωση txt π
        Scanner in = new Scanner(file); // π εχει μεσα πεντα ακεραιους( 1, 2, 3, 4, 5,) και τους εκτυπωνει
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
