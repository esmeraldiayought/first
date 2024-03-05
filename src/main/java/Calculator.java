import java.util.Scanner;

public class Calculator {

    private double num1;
    private double num2;
    private char operation1;
    // private Object Input;

    public static void Input() {

        Scanner in = new Scanner(System.in);

        System.out.print("Пример: ");
        String str = in.nextLine();
        // in.close();

        String[] parts = str.split(" ");
        String num1, operation1, num2;
        num1 = parts[0];
        operation1 = parts[1];
        num2 = parts[2];

        in.close();
    }

    public double calculate() {

        double result = 0.0;
        switch (operation1) {

            case '+':
                result = num1 + num2;
                // System.out.println("Решение = " + result1);
                break;
            case '-':
                result = num1 - num2;
                // System.out.println("Решение = " + result2);
                break;
            case '*':
                result = num1 * num2;
                // System.out.println("Решение = " + result3);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.print("Взрыв четвертого энергоблока не производим.");
                } else {
                    result = num1 / num2;
                    // System.out.println("Решение = " + result4);
                    break;
                }
            default: {
                System.out.print("Отсутсвие операнда.");
                break;
            }
        }
        return result;
    }

    public void Output(double result) {
        System.out.println("Решение = " + result); // переписать красивенько
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Input;
        double result = calculator.calculate();
        
        calculator.Output(result);
    }
}
