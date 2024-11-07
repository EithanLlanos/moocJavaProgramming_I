/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class team {
    private String name;
    private int wins;
    private int losses;
    public team(String name){
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }
    public String getName(){ return this.name;}
    public int getWins(){ return this.wins;}
    public void setWins(int val){ this.wins=val; }
    public int getLosses(){ return this.losses;}
    public void setLosses(int val){ this.losses=val; }
    
    
}
