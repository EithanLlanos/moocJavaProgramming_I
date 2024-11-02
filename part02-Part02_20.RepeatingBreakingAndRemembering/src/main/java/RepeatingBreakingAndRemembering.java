
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int var = 0;
        int sum = 0;
        int cnt = 0;
        int even = 0;
        int odd = 0;
        while(true){
            var = Integer.valueOf(scanner.nextLine());
            if(var==-1){
                break;
            } else if(var%2==0){
                even+=1;
            } else{
                odd+=1;
            }
            sum += var;
            cnt+=1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: "+ cnt);
        System.out.println("Average: "+ ((float)sum/cnt));
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);

    }
}
