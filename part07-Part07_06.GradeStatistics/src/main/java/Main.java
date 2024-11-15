
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grade = new Grades();
        UserInterface.start(scanner, grade);
    }
}
