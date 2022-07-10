import java.util.Scanner;

public class Truck extends Overland {
    private int payload;

    public Truck(int power, int speed, int mass, String mark, int numberOfWheels, int fuelUsage, int payload) {
        super(power, speed, mass, mark, numberOfWheels, fuelUsage);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность - " + payload+ "т");
    }

    public void raise() {
        int n = 100;
        int i;
        System.out.print("Введите массу груза в т: ");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i <= n) {
            System.out.println("Грузовик загружен");
            System.out.println("--------------------");

        } else {
            System.out.println("Вам нужен грузовик побольше!");
            System.out.println("--------------------");

        }

    }
}


