
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container cont1 = new Container();
        Container cont2 = new Container();
        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+cont1);
            System.out.println("Second: "+cont2);
            
            String input = scan.nextLine();
            if (input.equals("quit")) { break; }
            
            String[] inp = input.split(" ");
            if(inp[0].equals("add")){
                cont1.add(Integer.valueOf(inp[1]));
            } else if(inp[0].equals("remove")){
                cont2.remove(Integer.valueOf(inp[1]));
            } else if(inp[0].equals("move")){
                cont1.move(cont2, Integer.valueOf(inp[1]));
            }
            
            

        }
    }

}
