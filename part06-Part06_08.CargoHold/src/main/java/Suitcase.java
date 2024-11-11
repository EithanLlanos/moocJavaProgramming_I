
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
public class Suitcase {

    private final ArrayList<Item> list;
    private final int maxW;
    private int actW;
    
    public Suitcase(int maxW){
        this.list = new ArrayList<>();
        this.maxW = maxW;
        this.actW = 0;
    }
    
    public void addItem(Item item){
        if(actW+item.getWeight()>maxW) return;
        this.list.add(item);
        this.actW+=item.getWeight();
    }
    
    public String toString(){
        if(this.list.isEmpty()) return "no items (0 kg)";
        if(this.list.size()==1) return "1 item ("+this.actW+" kg)";
        return this.list.size()+" items (" + this.actW + " kg)";
    }
    
    public void printItems(){
        String txt = "";
        for (Item i : this.list) {
            txt+="\n"+i;
        }
        System.out.println(txt);
    }
    
    public int totalWeight(){ return this.actW;}
    
    public Item heaviestItem(){
        if(this.list.isEmpty()) return null;
        Item heaviest=this.list.get(0);
        for (Item item : this.list) {
            if(heaviest.getWeight()<item.getWeight()) heaviest=item;
            
        }
        return heaviest;
    }
    
    public int getMaxW(){
        return this.maxW;
    }
}
