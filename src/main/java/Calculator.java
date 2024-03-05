import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;
    private String operation1;
    // private Object Input;

    public void Input() throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.print("Пример: ");
        String str = in.nextLine();
        // in.close();

        in.close();

        String[] parts = str.split(" ");
        String numstr1 = parts[0];
        String numstr2 = parts[2];
        operation1 = parts[1];

        try {
            num1 = Double.parseDouble(numstr1);
            num2 = Double.parseDouble(numstr2);
        } catch (NumberFormatException e) {
            // System.out.print("Не число.");
            throw new Exception("Не число");
        }

    }

    public double plus() {
        return num1 + num2;
    }

    public double minus() {
        return num1 - num2;
    }

    public double proizv() {
        return num1 * num2;
    }

    public double delen() {
        if (num2 == 0) {
            System.out.print("Взрыв четвертого энергоблока не производим.");
            return 1;
        } else {
            return num1 / num2;
        }
    }

    public void Output() {

        switch (operation1) {
            case "+":
                System.out.println("Решение = " + plus());
                break;
            case "-":
                System.out.println("Решение = " + minus());
                break;
            case "*":
                System.out.println("Решение = " + proizv());
                break;
            case "/":
                System.out.println("Решение = " + delen());
                break;
            default:
                System.out.println("Неверный операнд.");
                break;
        }
    }

}
