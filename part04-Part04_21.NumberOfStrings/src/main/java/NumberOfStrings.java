
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        int cnt = 0;
        while(true){
            if(scanner.nextLine().equals("end")) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
