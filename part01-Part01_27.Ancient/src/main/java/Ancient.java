
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        if(Integer.valueOf(scan.nextLine())<2015){
            System.out.println("Ancient history!");
        }
    }
}
