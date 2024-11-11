
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class JokeManager {
    
    private final ArrayList<String> list;
    
    public JokeManager(){
        this.list = new ArrayList<>();
        
    }
    
    public void addJoke(String joke){
        this.list.add(joke);
    }
    
    public String drawJoke(){
        if(this.list.isEmpty()) return "Jokes are in short supply.";
        
        return ""+this.list.get((int)(Math.random()* this.list.size() ));
    }
    
    public void printJokes(){
        for (String e : list) {
            System.out.println(e);
        }
    }
}
