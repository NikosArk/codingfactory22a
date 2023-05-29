package gr.aueb.ch9;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 *
 * Διαβάζει από ένα αρχείο με μορφή δεδομένων
 * country    city1   city2   city3....
 * country    country1    countrey2    country3...
 *
 * και γράφει κάθε γραμμή σε διαφορετικό output αρχείο
 *
 */

public class CitiesIOAP {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/Users/Nikos/Documents/Coding Factory/java/tmp");

        if(!dir.exists()) {
            if(!dir.mkdir()) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/Users/Nikos/Documents/Coding Factory/java/tmp/cities.txt"))) {
            while ((line = bf.readLine()) !=null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece" :
                        File grFile = new File(dir + "/" +cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA" :
                        File usaFile = new File(dir + "/" +cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany" :
                        File geFile = new File(dir + "/" +cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream ge = new PrintStream(geFile, StandardCharsets.UTF_8);
                        print(ge, "GE Cities");
                        print(ge, cities);
                        break;
                    default:
                        System.err.println("Error in Cities");
                        break;


                }

            }
        }catch (IOException e) {
            e.printStackTrace();
    }


        }

        public static void print(PrintStream ps, String message) {
        ps.println(message);
        }

        public static void print(PrintStream ps, String[] tokens) {
        for (int i=1; i < tokens.length; i++) {
            ps.println(tokens[i] + " ");
//            print(ps, tokens[i] + " ");
            }
        }
}
