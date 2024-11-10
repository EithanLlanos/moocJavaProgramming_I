
public class MainProgram {

    public static void main(String[] args) {
        Money firstMoneyObject = new Money(5, 5);Money secondMoneyObjecy = new Money(6, 2);
        Money tennerMinusTwoEuros = firstMoneyObject.minus(secondMoneyObjecy);
        System.out.println(tennerMinusTwoEuros);
            }
}
