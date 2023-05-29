package gr.aueb.ch10;

import java.util.ArrayList;

public class CryptoApp {

    public static void main(String[] args) {
        final int KEY = 300;

        String s = "Coding#";
        String encrypted = encrypt(s, KEY).toString();
        System.out.println(encrypted);

        String decrypted = decrypt(encrypt(s,KEY), KEY).toString();
        System.out.println(decrypted);






    }

    public static ArrayList<Integer> encrypt(String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        char ch;
        int i;

        int prev = cipher(s.charAt(0), -1, key);    //s.charAt(0) διαβαζει τον integer στην θεση 0//
        encrypted.add(prev);

        i = 1;
        while ((ch = s.charAt(i)) !='#') {
            encrypted.add(cipher(ch, prev, key));
            prev = cipher(ch, prev, key);
            i++;
        }

        encrypted.add(-1);
        return encrypted;
    }

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        int token;
        int i;
        int prevToken;

        prevToken = decipher(encrypted.get(0), -1, key  ); // encrypted(0) το ιδιο με το πανω, αλλα για ch//
        decrypted.add((char) prevToken);

        i = 1;
        while ((token = encrypted.get(i)) == -1) {
            decrypted.add(decipher(token, prevToken, key));
            i++;
        }
        return decrypted;
    }


    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch; //θα επιστραφει σαν ιντετζερ οπως στην επικεφαλιδα της μεθοδου)
        return (ch + prev) % key;

    }

    public static char decipher(int cipher, int prev, int key) {
        int de;

        if (prev == -1) return (char) cipher;

        de = (cipher - prev +key) % key;
        return (char) de;

    }
}

