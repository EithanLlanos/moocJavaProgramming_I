import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> list = new ArrayList();
        Scanner scann = new Scanner(System.in);

        while(true){
            System.out.print("Title: ");
            String bookName = scann.nextLine();
            
            if (bookName.isEmpty()) break;
            
            System.out.print("\nPages: ");
            int bookPages = Integer.valueOf(scann.nextLine());
            System.out.print("\nPublication year: ");
            int bookYear = Integer.valueOf(scann.nextLine());
            
            list.add(new Book(bookName,bookPages,bookYear));
        }
        System.out.print("\nWhat information will be printed? ");
        if(scann.nextLine().equals("everything")){
            for (Book e: list) {
                System.out.println(e);
            }
        }
        else{
            for(Book e: list){
                System.out.println(e.getTitle());
            }
        }
    }
}
