public class Transport {
    private int power;
    private int speed;
    private int mass;
    private String mark;
    double p = 0.74;
    double power2 = p * power;


    public Transport(int power, int speed, int mass, String mark) {
        this.power = power;
        this.speed = speed;
        this.mass = mass;
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPower2() {
        double p = 0.74;
        double power2 = p * power;

        System.out.println(" Мощность - " + power2 + " лошадиных сил");
    }



    public void printInfo() {
            System.out.println("Mаксимальная скорость - " + speed + " км/ч");
            System.out.println("Mасса - " + mass + " кг");
            System.out.println("Марка - " + mark);


        }
    }







