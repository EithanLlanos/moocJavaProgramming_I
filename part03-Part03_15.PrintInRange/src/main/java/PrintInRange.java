
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowLim, int upLim){
        for(Integer element:list){
            if (element>=lowLim && element<=upLim) System.out.println(element);
        }
    }
    
}
