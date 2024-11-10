/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Fitbyte {
    private int age;
    private int restingHearRate;
    
    public Fitbyte(int age, int restingHearRate){
        this.age = age;
        this.restingHearRate = restingHearRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ( (206.3-(0.711*this.age)) - this.restingHearRate) * percentageOfMaximum + this.restingHearRate;
    }
    
    
}
