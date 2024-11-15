/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Container {

    private int contains;
    
    public Container(){
        this.contains=0;
    }
    
    public int getContains(){ return this.contains; }
    
    public String toString(){ return this.contains+"/100"; }
    
    public int add(int val){
        if(val<0) return 0;
        this.contains+=val;
        if (this.contains>100) {
            val = this.contains-100;
            this.contains = 100;
            return val;
        }
        return 0;
    }
    public int remove(int val){ 
        this.contains-=val;
        if (this.contains<0) {
            val = val+this.contains;
            this.contains = 0;
        }
        return val;
    }
    public void move(Container container,int val){
        container.add(this.remove(val));
    }
}
