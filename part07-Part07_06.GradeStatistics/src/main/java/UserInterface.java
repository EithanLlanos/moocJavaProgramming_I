
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
    public static void start (Scanner  scan, Grades grades){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int val = Integer.valueOf(scan.nextLine());
            if(val==-1){
                System.out.println(grades);
                break;
            } 
            else{ 
                grades.add(val);
            }
        }
    }    
}
