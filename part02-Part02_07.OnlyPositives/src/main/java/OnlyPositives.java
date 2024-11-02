
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v = -1;
        int v2 = -1;
        
        while (v != 0){
            System.out.println("Give a number:");
            v = Integer.valueOf(scanner.nextLine());
            if (v==0){
                continue;
            } else if (v<0){
                System.out.println("Unsuitable number");
                continue;
            }
            v2 = v*v;
            System.out.println(v2);
        }

    }
}
