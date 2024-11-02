
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int cnt = 0;
        String longest = "";
        while(true){
            String[] arr = scanner.nextLine().split(",");
            if(arr[0].equals("")) break;
            else if(longest.length()<arr[0].length()) longest = arr[0];
            cnt+=1;
            year+=Integer.valueOf(arr[1]);
        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+ ((double) year/cnt));

    }
}
