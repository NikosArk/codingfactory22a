package gr.aueb.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriterApp {

    public static void main(String[] args) {

       try (PrintStream ps = new PrintStream("C:/Users/Nikos/Documents/Coding Factory/java/tmp/test1.txt");
           PrintWriter pw = new PrintWriter("C:/Users/Nikos/Documents/Coding Factory/java/tmp/test2.txt")) {
           ps.println("Hello CD! from print stream");
           pw.println("Hello CF! from print writer");

       } catch (FileNotFoundException e) {
           System.out.println("File path not faound");
       }

    }
}
