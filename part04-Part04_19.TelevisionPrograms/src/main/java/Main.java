import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) break;
            System.out.println();
            
            System.out.print("\nDuration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name,duration));
            
        }
        System.out.print("\nProgram's maximum duration? ");
        int i = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram e : programs){
            if (e.getDuration()<=i)System.out.println(e);
        }
    }
}
