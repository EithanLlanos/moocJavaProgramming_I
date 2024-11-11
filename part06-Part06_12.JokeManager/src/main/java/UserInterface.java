
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class UserInterface {
    private final JokeManager list;
    private final Scanner scan;
    
    public UserInterface(JokeManager list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            
            String txt = scan.nextLine();
            
            if(txt.equals("1")){
                System.out.println("Write the joke to be added:");
                this.list.addJoke(scan.nextLine());
            } else if(txt.equals("2")){
                System.out.println(this.list.drawJoke());
            } else if(txt.equals("3")){
                System.out.println("Printing the jokes.");
                this.list.printJokes();
            } else if(txt.equals("X")) break;
            else System.out.println("Unkown command");
        }
    }
    
}
