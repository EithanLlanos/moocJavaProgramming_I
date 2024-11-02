
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] log = new String[2];
        System.out.println("Enter username: ");
        log[0] = scanner.nextLine();
        System.out.println("Enter password: ");
        log[1] = scanner.nextLine();
        String [] correctLog1 = {"alex","sunshine"}; 
        String [] correctLog2 = {"emma","haskell"}; 
        if( ((log[0].equals(correctLog1[0])) && (log[1].equals(correctLog1[1]))) ||  ((log[0].equals(correctLog2[0])) && (log[1].equals(correctLog2[1]))) ) System.out.println("You have successfully logged in!");
        else System.out.println("Incorrect username or password!");
    }
}
