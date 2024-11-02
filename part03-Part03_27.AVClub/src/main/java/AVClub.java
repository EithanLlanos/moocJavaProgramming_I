
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] arr = scanner.nextLine().split(" ");
            if (arr[0].equals("")) break;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].contains("av")) System.out.println(arr[i]);
            }
        }

    }
}
