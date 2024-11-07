
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        while(true){
            System.out.print("First name: ");
            String v1 = scanner.nextLine();
            if(v1.isEmpty()) break;
            
            System.out.println("Last name: ");
            String v2 = scanner.nextLine();
            
            //System.out.println();
            
            System.out.println("Identification number: ");
            String v3 = scanner.nextLine();
        
            infoCollection.add(new PersonalInformation(v1,v2,v3));

        }
        
        for(PersonalInformation e: infoCollection){
            System.out.print("\n"+e.getFirstName()+ " " + e.getLastName());
        }
    }
}
