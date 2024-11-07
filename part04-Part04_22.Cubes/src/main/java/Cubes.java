
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
            Scanner scann = new Scanner(System.in);
            
            while(true){
                String var = scann.nextLine();
                if (var.equals("end")) break;
                int toCube = Integer.valueOf(var);
                System.out.println(toCube*toCube*toCube);
            }
    

    }
}
