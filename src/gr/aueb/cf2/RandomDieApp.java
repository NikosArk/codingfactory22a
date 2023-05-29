package gr.aueb.cf2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die2 = (int) (Math.random()*6)+1;
        int die = (int) (Math.random() * 6) + 1; // ekana typecast (int) giati to mathrandom tha epistrepsei float.
                                                // to mathrandom einai {0,0.99), ara me ti mathrandom*6 pairnw
                                                // {0,5.99) kai me to +1dld to min paei {0,6.99)
        System.out.println(die);
        System.out.printf("%d", +die2);
    }
}