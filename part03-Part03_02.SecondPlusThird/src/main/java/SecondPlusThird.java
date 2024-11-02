
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ArrayList <Integer> numbers = new ArrayList<>();
        while (true){
            int number = Integer.valueOf(scan.nextLine());
            if (number ==0){
                break;                
            }
            numbers.add(number);
        }
        System.out.println((numbers.get(1)+numbers.get(2)));
    }
}