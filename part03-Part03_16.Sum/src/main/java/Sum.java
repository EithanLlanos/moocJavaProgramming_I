
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(Integer e : list){
            sum+=e;
        }
        return sum;
    }
}
