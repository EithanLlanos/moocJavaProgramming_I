
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int greatest = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            

            list.add(input);
            if(input>greatest || input == list.get(0)) greatest = input;
        }
        
        System.out.println("The greatest number: "+ greatest);

        // implement finding the greatest number in the list here
    }
}
