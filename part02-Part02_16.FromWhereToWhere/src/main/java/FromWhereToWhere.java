
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int v1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int v2 = Integer.valueOf(scanner.nextLine());
        
        for (int i = v2; i <= v1; i++) {
            System.out.println(i);
            
        }
    }
}
