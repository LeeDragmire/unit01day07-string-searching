// nicely done
import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        System.out.println("Enter HTMl Text here: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Now enter tag to search for: ");
        String search = scanner.nextLine();
        int textPos = text.indexOf(search);
        int closePos = text.indexOf("</", textPos);
        int endClosePos = text.indexOf(">", closePos);
        if (text.substring(closePos + 2, endClosePos).equals(search)) {
            int startPos = text.indexOf(">", textPos);
            int endPos = text.indexOf("<", textPos + 1);
            System.out.println(text.substring(startPos + 1, endPos));
        } else {
            System.out.println("there are no '" + search + "' tags in the entered HTML");
        }
        

        scanner.close();
    }
}