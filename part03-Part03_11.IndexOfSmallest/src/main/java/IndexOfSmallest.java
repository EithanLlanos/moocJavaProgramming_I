
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        int small = 0;
        while(true){
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp == 9999) break;
            
            list.add(inp);
            
            if(inp<small || list.size()==1) small = inp;
        }
        
        System.out.println("Smallest number: "+small);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (small == list.get(i)) System.out.println("Found at index: "+i);
        }
        
    }
}
