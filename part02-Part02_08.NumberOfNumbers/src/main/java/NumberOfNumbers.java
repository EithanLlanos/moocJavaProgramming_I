
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        int cnt=-1;
        while(v!=0){
            System.out.println("Give a number:");
            v = Integer.valueOf(scanner.nextLine());
            cnt+=1;
        }
        System.out.println("Number of numbers: "+ cnt);
    }
}
