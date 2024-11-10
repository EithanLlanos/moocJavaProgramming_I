
public class Main {

    public static void main(String[] args) {
        
        SimpleDate date = new SimpleDate(30,12,2024);
        System.out.println(date);
        date.advance(31);
        System.out.println(date);
    }
}
