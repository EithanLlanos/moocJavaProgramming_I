
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = -1;
        int cnt=0;
        int sum = 0;
        while(v!=0){
            System.out.println("Give a number");
            v = Integer.valueOf(scanner.nextLine());
            if (v>0){
                cnt+=1;
                sum +=v;
            }
        }
        if (cnt!=0){
            System.out.println("Average of the numbers: "+((double)sum/cnt));
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
