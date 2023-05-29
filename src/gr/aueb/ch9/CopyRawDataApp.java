package gr.aueb.ch9;

import java.io.*;

public class CopyRawDataApp {

    public static void main(String[] args) {


        int b = 0;
        int count = 0;
        byte[] buffer = new byte[8192];
        long start, end;
        double elapsed;

        try (BufferedInputStream in = new BufferedInputStream( new FileInputStream("C:/Users/Nikos/Documents/Coding Factory/java/tmp/istockphoto.jpg"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/Users/Nikos/Documents/Coding Factory/java/tmp/istockphotoout.jpg"))) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + "secs");
            System.out.printf("%f, .2f KB", Math.ceil((double) count / 1024));
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




    }

