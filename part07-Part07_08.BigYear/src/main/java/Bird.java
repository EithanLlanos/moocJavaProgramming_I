/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Bird {
    private final String name;
    private final String latinName;
    private int observation;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation=0;
    }
    
    public String getName(){ return this.name;}
    public String getLatinName(){return this.latinName;}
    public int getObservation(){ return this.observation;}
    public void add(){ this.observation++;}
    public String toString(){ return this.name + " ("+ this.latinName+"): "+this.observation+" observations";}
    
}

