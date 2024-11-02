
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        int cnt=-1;
        int sum = 0;
        while(v!=0){
            System.out.println("Give a number:");
            v = Integer.valueOf(scanner.nextLine());
            cnt+=1;
            sum +=v;
        }
        System.out.println("Number of numbers: "+ cnt);
        System.out.println("Sum of the numbers: "+ sum);
    }
}
