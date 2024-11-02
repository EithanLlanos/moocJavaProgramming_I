
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int val1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int val2 = Integer.valueOf(scanner.nextLine());
        System.out.println(val1 + " + " + val2 + " = " + (val1+val2));

    }
}
