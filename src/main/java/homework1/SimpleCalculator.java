package homework1;

import java.util.Scanner;


public class SimpleCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static double getDouble() {
        System.out.println("Введите число");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа, возможно, вы ввели целое число, попробуйте еще раз");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Попробуйте еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }


    public static double calculator(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = SimpleSum.simpleSum(num1, num2);
                break;
            case '*':
                result = Multiplication.multiplication(num1, num2);
                break;
            default:
                System.out.println("Произошла ошибка, не удалось распознать операцию");
                result = calculator(num1, num2, getOperation());

        }
        return result;
    }

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calculator(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
}
