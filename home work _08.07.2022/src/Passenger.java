import java.util.Scanner;

public class Passenger extends Overland {
    private String bodyType;
    private int passengerNumber;

    public Passenger(int power, int speed, int mass, String mark, int numberOfWheels, int fuelUsage, String bodyType, int passengerNumber) {
        super(power, speed, mass, mark, numberOfWheels, fuelUsage);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип кузова - " + bodyType);
        System.out.println(" Кол пасажиров - " + passengerNumber);

    }

    public void calculate() {
        double i;
        System.out.print("Введите время (ч) : ");
        Scanner input = new Scanner(System.in);
        i = input.nextDouble();
        double a = i * 200;
        double c = getFuelUsage();
        double b = a * (c/100);
        System.out.print("За время " + i + " ч , Автомобиль - " + getMark() + " , двигаясь с максимальной скоростью - " + getSpeed() + " км/ч проедет -" + a+ " км и израсходует -"+b+"л топлива");
        System.out.println();
        System.out.println("---------------------");
    }
}



