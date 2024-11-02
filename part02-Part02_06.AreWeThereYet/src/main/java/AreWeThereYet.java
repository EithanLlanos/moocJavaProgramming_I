
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1= 0;
        while (v1!= 4){
            System.out.println("Give a number:");
            v1 = Integer.valueOf(scanner.nextLine());
        }
    }
}
