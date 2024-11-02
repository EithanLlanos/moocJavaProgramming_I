
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("How old are you?");
        if(Integer.valueOf(scan.nextLine())<18){
            System.out.println("You are not an adult");
        } else{
            System.out.println("You are an adult");
        }
        
    }
}
