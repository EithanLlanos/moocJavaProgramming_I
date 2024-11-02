
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] arr = scanner.nextLine().split(" ");
            if(arr[0].equals("")) break;
            System.out.println(arr[0]);
        }

    }
}
