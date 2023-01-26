import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phrase here: ");
        String text = scanner.nextLine();
        System.out.println("Enter letter to search for: ");
        String letter = scanner.nextLine();
        if (text.indexOf(letter) == -1) {
            System.out.println("letter not in sentence");
        } else {
            int index = text.indexOf(letter);
            
            if (index != text.length() - 1) {
                int ending = text.indexOf(" ", index);
                String newText = text.substring(0,ending);
                int start = newText.lastIndexOf(" ");
                System.out.println(text.substring(start + 1, ending));
            } else {
                System.out.println(text.substring(index - 5, index) + letter);
            }
            
        }
    }
}
