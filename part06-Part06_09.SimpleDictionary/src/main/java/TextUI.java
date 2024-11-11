
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
public class TextUI {


    private Scanner scan;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scan, SimpleDictionary simpleDict){
        this.scan = scan;
        this.simpleDict = simpleDict;
    }
    
    public void start(){
        while(true){
            
            String txt = this.scan.nextLine();
            if(txt.equals("end"))break; 
            else if(txt.equals("add")){
                this.add();
            }
            else if(txt.equals("search")){
                this.search();
            }
            else System.out.println("Unknown command");
            
        }
        System.out.println("Bye bye!");
        return;
    }
    
    public void add(){
        System.out.print("Word:");
        String txt = this.scan.nextLine();
        System.out.println("Translation: ");
        this.simpleDict.add(txt, this.scan.nextLine());
    }
    public void search(){
        System.out.print("To be translated: ");

        String txt = this.scan.nextLine();
        String translated = this.simpleDict.translate(txt);

        if(!(translated==null)) System.out.println(translated);
        else System.out.println("Word "+ txt + " was not found");
                
    }
}
