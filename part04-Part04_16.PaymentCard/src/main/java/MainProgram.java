
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattCard);
        paulsCard.addMoney(20);
        
        
        mattCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattCard);

    }
}
