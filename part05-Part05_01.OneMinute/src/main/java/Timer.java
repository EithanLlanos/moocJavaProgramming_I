/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand Hseconds;
    
    public Timer(){
        
        this.seconds = new ClockHand(60);
        this.Hseconds = new ClockHand(100);
    }
    
    public void  advance(){
        this.Hseconds.advance();
        if(this.Hseconds.value()==0) this.seconds.advance();
    }
    
    public String toString(){
        return (this.seconds+":"+this.Hseconds);
    }
}
