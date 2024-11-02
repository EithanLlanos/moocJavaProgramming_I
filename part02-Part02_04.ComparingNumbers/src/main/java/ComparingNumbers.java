
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = Integer.valueOf(scanner.nextLine());
        int v2 = Integer.valueOf(scanner.nextLine());
        
        if(v1>v2){
            System.out.println(v1 + " is greater than " + v2);
        } else if(v1<v2){
            System.out.println(v1 + " is smaller than " + v2);
        } else{
            System.out.println(v1 + " is equal to " + v1);
        }
    }
}
