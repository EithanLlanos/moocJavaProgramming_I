
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odds = new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int val = Integer.valueOf(scanner.nextLine());
            if(val==-1) break;
            else if(val%2==0) {
                total.addNumber(val);
                even.addNumber(val);
            }
            else {
                total.addNumber(val);
                odds.addNumber(val);
            }
        }
        System.out.println("Sum: "+ total.sum() );
        System.out.println("Sum of even numbers: "+even.sum());
        System.out.println("Sum of odd numbers: "+odds.sum());
    }
}
