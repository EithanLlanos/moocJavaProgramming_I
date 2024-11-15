
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
        ArrayList<Bird> birds = new ArrayList<>();
        while(true){
            System.out.print("? ");
            String input = scan.nextLine();
            if(input.equals("Quit")) return;
            else if(input.equals("Add")) add(scan,birds);
            else if(input.equals ("Observation")) observation(scan,birds);
            else if(input.equals ("One")) one(scan,birds);
            else if(input.equals ("All")) all(scan,birds);
        }
    }
    
    public static void add(Scanner scan, ArrayList<Bird> birds){
        System.out.print("Name: ");
        String txt = scan.nextLine();
        System.out.print("Name in Latin: ");
        birds.add(new Bird(txt,scan.nextLine()));
    }
    
    public static void observation(Scanner scan, ArrayList<Bird> birds){
        if(birds.isEmpty()) return;
        System.out.print("Bird? ");
        String input = scan.nextLine();
        for (Bird bird : birds) {
            if(input.equals(bird.getName())) {
                bird.add();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public static void one(Scanner scan, ArrayList<Bird> birds){
        if(birds.isEmpty()) return;
        System.out.print("Bird?");
        String input = scan.nextLine();
        for (Bird bird : birds) {
            if(bird.getName().equals(input)) System.out.println(bird);
        }
    }
    
    public static void all(Scanner scan,ArrayList<Bird> birds){
        if(birds.isEmpty()) return;
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
}
