import java.util.Random;
public class Car1 {
    private String mark = "BMW";
    private int price;
    private int speed;
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void start1() throws CarException {
        Random random = new Random();
        int i = random.nextInt(21);
        System.out.println("Рандомное число от 0 до 20 - " + i);
        if (i % 2 == 1) {
            System.out.println("Автомобиль марки - " + mark + " завёлся");
        } else
            throw new CarException("Для запуска нужно нечетное число!");
    }
}
