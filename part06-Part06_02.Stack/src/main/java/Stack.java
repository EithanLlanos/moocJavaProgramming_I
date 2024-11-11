
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
public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    public void add(String value){
        if(!(this.list.contains(value))) this.list.add(value);
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        int leng = this.list.size();
        String val = this.list.get(leng-1);
        this.list.remove(leng-1);
        return val;
    }
}
