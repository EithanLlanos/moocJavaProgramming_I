/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class Film {
    
    private String filmName;
    private int filmAgeRating;
    
    public Film(String filmName, int filmAgeRating){
        this.filmName = filmName;
        this.filmAgeRating = filmAgeRating;
    }
    
    public int ageRating(){
        return this.filmAgeRating;
    }
    
    public String name(){
        return filmName;
    }
}
