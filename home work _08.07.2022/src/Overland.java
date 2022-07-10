public class Overland extends Transport {
    private int numberOfWheels;
    private int fuelUsage;

    public Overland(int power, int speed, int mass, String mark, int numberOfWheels, int fuelUsage) {
        super(power, speed, mass, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuelUsage = fuelUsage;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество колес - " + numberOfWheels);
        System.out.println("Расход топлива - " + fuelUsage+ "л/100км");
    }
}
