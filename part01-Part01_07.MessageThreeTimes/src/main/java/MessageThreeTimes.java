
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String txt = scanner.nextLine();
        System.out.println(txt);
        System.out.println(txt);
        System.out.println(txt);

    }
}
