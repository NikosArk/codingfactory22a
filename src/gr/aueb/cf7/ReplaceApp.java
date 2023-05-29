package gr.aueb.cf7;


/**
 * Replace a string
 */
public class ReplaceApp {

    public static void main(String[] args) {

        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace(" ", "-");
        System.out.println(dashedTitle);
    }
}
