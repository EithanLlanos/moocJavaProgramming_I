
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);
    }
    
    public static void divisibleByThreeInRange(int v1,int v2){
        for (int i = v1; i <= v2; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

}
