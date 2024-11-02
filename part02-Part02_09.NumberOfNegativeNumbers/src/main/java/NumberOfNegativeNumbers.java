
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        int cnt=0;
        while(v!=0){
            System.out.println("Give a number:");
            v = Integer.valueOf(scanner.nextLine());
            if(v<0){
                cnt+=1;
            }
        }
        System.out.println("Number of negative numbers: "+ cnt);
    }
}
