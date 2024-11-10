/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Item {
    private String id,name;
    
    public Item(String id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){ return this.id;}
    public String getName(){ return this.name;}
    
    @Override
    public boolean equals(Object compared){
        if(!(compared instanceof Item)) return false;
        
        Item comp = (Item) compared;
        
        return this.id.equals(comp.getId()) ;
    }
    
    @Override
    public String toString(){
        return this.id+": "+this.name;
    }
}
