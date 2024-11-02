
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        while(true){
            String[] arr = scanner.nextLine().split(",");
            if(arr[0].equals("")) break;
            else if(old<Integer.valueOf(arr[1])) old = Integer.valueOf(arr[1]);
        }
        System.out.println("Age of the oldest: "+old);
    }
}
