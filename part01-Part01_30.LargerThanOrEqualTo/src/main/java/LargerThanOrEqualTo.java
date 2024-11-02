
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int val1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int val2 = Integer.valueOf(scan.nextLine());
        
        if (val1 > val2) {
            System.out.println("Greater number is : "+val1);
        } else if (val2 > val1) {
            System.out.println("Greater number is : "+val2);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
