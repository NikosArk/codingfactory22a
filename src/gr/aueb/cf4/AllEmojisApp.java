package gr.aueb.cf4;

public class AllEmojisApp {
    public static void main(String[] args) {

        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;
        i = emojiStart;
            while (i <= emojiEnd) {
            System.out.print(Character.toChars(i)); //εδω ουσιαστικ παιρνει το 0X1F600 kai το μεταγλωτει
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println(); // AYTO ειναι για να μου τα βαλει σε 16αδες. δλδ καθε 16 ενα ln
        }
    }
}
