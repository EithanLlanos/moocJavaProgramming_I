
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = Math.sqrt(Integer.valueOf(scanner.nextLine())+ Integer.valueOf(scanner.nextLine()));
        
        System.out.println(number);
    }
}
