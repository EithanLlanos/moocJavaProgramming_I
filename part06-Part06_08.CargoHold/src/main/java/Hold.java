
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
public class Hold {
    private final ArrayList<Suitcase> list;
    private final int maxHoldW;
    private int actHoldW;
    private int atMaxSuitcaseW;
    public Hold(int maxHoldW){
        this.list = new ArrayList<>();
        this.maxHoldW = maxHoldW;
        this.atMaxSuitcaseW = 0;
        this.actHoldW = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.atMaxSuitcaseW+suitcase.getMaxW()>this.maxHoldW) return;
        
        this.list.add(suitcase);
        this.atMaxSuitcaseW+=suitcase.getMaxW();
        this.actHoldW+=suitcase.totalWeight();
    }
    
    public String toString(){
        if(this.list.isEmpty()) return null;
        
        return this.list.size()+" suitcases ("+this.actHoldW+" kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase : this.list) {
            suitcase.printItems();
        }
    }
}
