
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String oldest = "";
        while(true){
            String[] arr = scanner.nextLine().split(",");
            if(arr[0].equals("")) break;
            else if(old<Integer.valueOf(arr[1])) {
                old = Integer.valueOf(arr[1]);
                oldest = arr[0];
        }
        System.out.println("Name of the oldest: "+oldest);
    }
    }
}
