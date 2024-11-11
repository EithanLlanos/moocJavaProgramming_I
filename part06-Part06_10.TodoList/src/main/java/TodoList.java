
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
public class TodoList {
    private final ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
        
    }
    
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        int cnt = 1;
        for (String str : this.list) {
            System.out.println(cnt+": "+str);
            cnt++;
        }
    }
    
    public void remove(int number){
        this.list.remove(number-1);
    }
}
