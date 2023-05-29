package gr.aueb.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("C:/Users/Nikos/Documents/Coding Factory/java/tmp/istockphoto");
        Path targetPath = Paths.get("C:/Users/Nikos/Documents/Coding Factory/java/tmpistockphotoout");

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
