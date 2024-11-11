
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
public class Package {
    private ArrayList<Gift> list;
    
    public Package(){
        this.list = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        if(!(this.list.contains(gift))) this.list.add(gift);
    }
    
    public int totalWeight(){
        int tWeight = 0;
        for (Gift e : list) {
            tWeight+=e.getWeight();
            
        }
        return tWeight;
    }
}
