//import jdk.nashorn.api.scripting.ScriptUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Пример: ");
        String str = in.nextLine();
        in.close();

        String[] parts = str.split(" ");
        String numstr1, operation1, numstr2;
        numstr1 = parts[0];
        operation1 = parts[1];
        numstr2 = parts[2];

        int debugnum;

        try {
            debugnum = Integer.parseInt(numstr1);
        }
        catch (NumberFormatException e) {
            System.out.print("Нет первого числа.");
            return;
        }

        try {
            debugnum = Integer.parseInt(numstr2);
        }
        catch (NumberFormatException e) {
            System.out.print("Нет второго числа.");
            return;
        }

        int num1 = Integer.parseInt(numstr1);
        int num2 = Integer.parseInt(numstr2);

        switch (operation1) {
            case  "+":
                int result1 = num1 + num2;
                System.out.println("Решение = " + result1);
                break;
            case "-":
                int result2 = num1 - num2;
                System.out.println("Решение = " + result2);
                break;
            case "*":
                int result3 = num1 * num2;
                System.out.println("Решение = " + result3);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.print ("Взрыв четвертого энергоблока не производим.");
                    return; }
                else { int result4 = num1 / num2;
                    System.out.println("Решение = " + result4);
                    break; }
            default: {
                System.out.print ("Отсутсвие операнда.");
                break;
            }
        }

    }
}
