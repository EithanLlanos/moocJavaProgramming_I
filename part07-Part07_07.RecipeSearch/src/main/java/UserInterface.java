import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eithan
 */
public class UserInterface {
    public static void start(Scanner scan){
        System.out.print("File to read: ");
        ArrayList<Recipe> recipes = readRecipesFromFile(scan.nextLine());
        
        while(true){
            System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
            System.out.print("Enter command:");
            String txt = scan.nextLine();
            if(txt.equals("stop")) return;
            else if(txt.equals("list")) {
                printList(recipes);
            }
            else if(txt.equals("find name")){
                System.out.print("Searched word:");
                findByName(recipes,scan.nextLine());
            }
            else if(txt.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                findByCtime(recipes,Integer.valueOf(scan.nextLine()));
            }
            else if(txt.equals("find ingredient")){
                System.out.println("Ingredient: ");
                findByIngredient(recipes,scan.nextLine());
            }
            
        }
        
    }
    
    public static ArrayList<Recipe> readRecipesFromFile(String path){
        ArrayList<Recipe> recipes = new ArrayList<>();
        try(Scanner file = new Scanner(Paths.get(path))){
            String txt = "";
            while(file.hasNextLine()){
                String inp = file.nextLine();
                System.out.println("["+inp+"]");
                if(!(inp.isEmpty())&& file.hasNextLine()){
                    txt+=inp+",";
                }
                else{
                    String[] val =txt.split(",");
                    Recipe recipe = new Recipe(val[0],Integer.valueOf(val[1]));
                    for (int i = 2; i < val.length; i++) {
                        recipe.addIngredient(val[i]);
                    }
                    recipes.add(recipe);
                    txt="";
                }
            }
            
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
        return recipes;
    }
    
        public static void printList(ArrayList<Recipe> recipes){
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
        public static void findByName(ArrayList<Recipe> recipes,String str){
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                if(recipe.getName().contains(str)) System.out.println(recipe);
            }
        }
        public static void findByCtime(ArrayList<Recipe> recipes,int ctime){
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                if(recipe.getCtime()<=(ctime)) System.out.println(recipe);
            }
        }
        public static void findByIngredient(ArrayList<Recipe> recipes, String ingrd){
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                for (String ingredient : recipe.getIngredients()) {
                    if(ingredient.equals(ingrd)){
                        System.out.println(recipe);
                        break;
                    }
                }
            }
        }
    
}
