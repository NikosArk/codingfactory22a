package nikos.practice;

import java.util.Scanner;

public class RandomDice {
    public static void main(String[] args) {

        int die = (int) (Math.random()*6) +1;
        System.out.printf("το ζαρι εβγαλε το τυχαιο νουμερο %d", die);
    }
}
