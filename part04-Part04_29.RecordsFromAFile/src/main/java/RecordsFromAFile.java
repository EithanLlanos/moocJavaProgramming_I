
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        
        try(Scanner scannFil = new Scanner(Paths.get(scanner.nextLine()))){
            while(scannFil.hasNextLine()){
                String[] line = scannFil.nextLine().split(",");
                if(Integer.valueOf(line[1])==1){ System.out.println(line[0]+", age: "+line[1] +" year");}
                else { System.out.println(line[0]+", age: "+line[1] +" years");}
            }
        } catch (Exception e){
                System.out.println("Error: "+e);
                }

    }
}
