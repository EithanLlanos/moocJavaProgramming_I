
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
public class Recipe {
    private final String name;
    private final int ctime;
    private final ArrayList<String> ingredients;
    public Recipe(String name,int ctime){
        this.name = name;
        this.ctime = ctime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    
    public String toString(){
        return this.name+", cooking time: "+this.ctime;
    }
    public String getName(){ return this.name;}
    public int getCtime(){ return this.ctime;}
    public ArrayList<String> getIngredients(){ return this.ingredients; }
}
