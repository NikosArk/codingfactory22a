package gr.aueb.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Prints with PrintStream.
 */

public class PrintStreamApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("C:/Users/Nikos/Documents/Coding Factory/java/tmp/f23.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory. Γειααα");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
