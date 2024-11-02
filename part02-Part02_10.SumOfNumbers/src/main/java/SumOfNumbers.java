
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        int sum = 0;
        while(v!=0){
            System.out.println("Give a number:");
            v = Integer.valueOf(scanner.nextLine());
            sum += v;
        }
        System.out.println("Sum of the numbers: "+ sum);
    }
}
