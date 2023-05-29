package gr.aueb.cf2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 534;

//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d", i);
//
//        System.out.print("Result =" +i);
//        System.out.println("Result =" +i);
//        System.out.printf("Result + %d%n", i);

        System.out.printf("%010d", i); // αν ειχα %4d αυτο σημαινει οτι το i θα πιασει 4 θεσεις μαζι με το 12 με κενα
                                    // αν ειχα %04d θα επιανε 4 θεσεις με μηδενικα, δλδ 0012
    }
}
