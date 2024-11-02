
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String txt1 = scanner.nextLine();
        System.out.println("What is their job?");
        String txt2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+txt1+", who was "+txt2+".\nOn the way to work, "+txt1+" reflected on life.\nPerhaps "+txt1+" will not be "+txt2+" forever." );
    }
}
