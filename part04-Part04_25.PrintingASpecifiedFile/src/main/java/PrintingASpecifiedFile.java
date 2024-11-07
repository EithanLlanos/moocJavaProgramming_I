
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scannSys = new Scanner(System.in);
        System.out.println("Which file should have its content printed");
        try(Scanner scannFil = new Scanner(Paths.get(scannSys.nextLine()))){
            while(scannFil.hasNextLine()){
                System.out.println(scannFil.nextLine());
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
