//import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        try {
            Calculator primer = new Calculator();
            primer.Input();

            // double result = primer.calculate();

            primer.Output();
        } catch (Exception e) {
            System.out.println("Где-то ошибка" + e);
        }

    }

}
