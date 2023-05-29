package gr.aueb.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {

        File file = new File("C:U\\ers\\Nikos\\Documents\\Coding Factory\\java\tmp\\intfile.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e2) {
            System.out.println("File not Found Error");
        } catch (IOException e1) {
            //e1.printStackTrace();
            System.out.println("Read Error");  // εδω θελει προσοχη στην σειρα των catch. θελει απο το ειδικο στο πιο γενικο γιατι
        } catch (Exception e3) {               // γιατι αν βαλω πρωτα το γενικο, αυτο θα πιανει και τα πιο ειδικα και θα μ λεει οτι θα εχει ηδη πιαστει και δεν θα μπορω να βαλω την συνθηκη
            System.out.println("ooooops something went wrong");
        }
    }
}
