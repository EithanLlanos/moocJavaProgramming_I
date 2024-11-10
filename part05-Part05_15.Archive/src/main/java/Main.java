
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scan.nextLine();
            if(id.isEmpty()) break;
            System.out.println("Name? (empty will stop)");
            String name = scan.nextLine();
            if(name.isEmpty()) break;
            Item it = new Item(id,name);
            if(!(list.contains(it))) list.add(it);
        }
        
        System.out.println("==Items==");
        for (Item i : list) {
            System.out.println(i);
        }
    }
}
