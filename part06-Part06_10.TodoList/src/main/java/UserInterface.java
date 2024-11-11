
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
    private final TodoList tdList;
    private final Scanner scan;
    
    public UserInterface(TodoList tdList, Scanner scan){
        this.tdList = tdList;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String txt = this.scan.nextLine();
            if(txt.equals("stop")) break;
            else if(txt.equals("add")){
                System.out.print("To add: ");
                this.tdList.add(this.scan.nextLine());
            }
            else if(txt.equals("list")){ this.tdList.print();}
            else if(txt.equals("remove")){ 
                System.out.println("Which one is removed?");
                this.tdList.remove(Integer.valueOf(this.scan.nextLine()));
            }
        }
    }
}
