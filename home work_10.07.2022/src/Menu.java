import java.util.Scanner;

public class Menu {
    public static void count() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("������� �������������� ��������");
        while (!scanner.hasNext("[+--/*]")) {
            System.out.println("�� ��������� ������ ��� ����� ��������. ���������� ��� ���!");
            scanner.next();
        }
        String c = scanner.next();
        System.out.println("���������:");

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
            System.out.println("������� ����������? (��,���)");
            String startOver = scan1.nextLine();
            switch (startOver) {
                case "���":
                    System.out.println("�� ��������!");
                    break;
                case "��":
                    Menu.count();
                    break;
                default:
                    System.out.println("������.��� ������ ��������");
                    break;

        }
    }
}






