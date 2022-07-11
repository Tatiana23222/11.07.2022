import java.util.Scanner;

public class Menu {
    public static void count() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите математическую операцию");
        while (!scanner.hasNext("[+--/*]")) {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз!");
            scanner.next();
        }
        String c = scanner.next();
        System.out.println("Результат:");

        switch (c) {
            case "+":
                CalculatorSum calculatorSum = new CalculatorSum();
                calculatorSum.action(a, b);
                break;
            case "-":
                CalculateDif calculateDif = new CalculateDif();
                calculateDif.action(a, b);
                break;
            case "*":
                CalculateMultiply calculateMultiply = new CalculateMultiply();
                calculateMultiply.action(a, b);
                break;
            case "/":
                CalculateDiv calculateDiv = new CalculateDiv();
                calculateDiv.action(a, b);
                break;
        }
            System.out.println("Желаешь продолжить? (да,нет)");
            String startOver = scan1.nextLine();
            switch (startOver) {
                case "нет":
                    System.out.println("До свидания!");
                    break;
                case "да":
                    Menu.count();
                    break;
                default:
                    System.out.println("Ошибка.Нет такого варианта");
                    break;

        }
    }
}






