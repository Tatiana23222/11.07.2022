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
        System.out.println("��� ������ - " + bodyType);
        System.out.println(" ��� ��������� - " + passengerNumber);

    }

    public void calculate() {
        double i;
        System.out.print("������� ����� (�) : ");
        Scanner input = new Scanner(System.in);
        i = input.nextDouble();
        double a = i * 200;
        double c = getFuelUsage();
        double b = a * (c/100);
        System.out.print("�� ����� " + i + " � , ���������� - " + getMark() + " , �������� � ������������ ��������� - " + getSpeed() + " ��/� ������� -" + a+ " �� � ����������� -"+b+"� �������");
        System.out.println();
        System.out.println("---------------------");
    }
}



