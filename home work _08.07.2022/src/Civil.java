import java.util.Scanner;

public class Civil extends Air {
    private int passengerNumber;
    private boolean businessClass;

    public Civil(int power, int speed, int mass, String mark, int wingspan, int minRunwayLength, int passengerNumber, boolean businessClass) {
        super(power, speed, mass, mark, wingspan, minRunwayLength);
        this.passengerNumber = passengerNumber;
        this.businessClass = businessClass;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println(" Кол-во пассажиров - " + passengerNumber);
        System.out.println(" Наличие бизнес класса");
    }

    public void seat() {
        int n = 50;
        int i;
        System.out.print("Введите количество пассажиров: ");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i <= n) {
            System.out.println("Tранспорт загружен!");
            System.out.println("--------------------");

        } else {
            System.out.println("Вам нужен транспорт побольше!");
            System.out.println("--------------------");

        }
    }
}
