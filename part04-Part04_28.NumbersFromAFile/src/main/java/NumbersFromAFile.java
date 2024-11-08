
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scannFil = new Scanner(Paths.get(file)) ){
            int cnt = 0;
            while(scannFil.hasNextLine()){
                int scanned = Integer.valueOf(scannFil.nextLine());
                if(scanned<=upperBound && scanned>=lowerBound) cnt++;
            }
            System.out.println("Numbers: "+cnt);
            
        } catch (Exception e){
            System.out.println("Error: "+ e);
        }

    }

}
