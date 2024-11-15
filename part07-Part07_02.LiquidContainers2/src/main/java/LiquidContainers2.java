
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.println("First: "+cont1);
            System.out.println("Second: "+cont2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] list = input.split(" ");
            if(list[0].equals("add")){
                cont1.add(Integer.valueOf(list[1]));
            } 
            else if(list[0].equals("remove")){
                cont2.remove(Integer.valueOf(list[1]));
            }
            else if(list[0].equals("move")){
                int val = Integer.valueOf(list[1]);
                if(cont1.contains()<val) val = cont1.contains();
                
                cont1.remove(val);
                cont2.add(val);
            }

        }
    }

}
