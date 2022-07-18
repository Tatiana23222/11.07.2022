import java.util.Random;
public class Car {
    private String mark;
    private int price;
    private int speed;
    private Car car;
    public Car(String mark, int price, int speed) {
        this.mark = mark;
        this.price = price;
        this.speed = speed;
    }
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

    public void start() throws CarException {
        Random random = new Random();
        int i = random.nextInt(21);
        System.out.println("–андомное число от 0 до 20 - " + i);
        if (i % 2 == 1) {
            System.out.println("јвтомобиль марки - " + mark + " завЄлс€");
        } else
            throw new CarException("ƒл€ запуска нужно нечетное число!" );
    }
}



 /*   —оздать собственное исключение
        - —оздать класс Car c пол€ми (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.

        —оздать метод старт в котором пытаетесь завести автомобиль.
         ¬ методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным, т
         о выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт.
          ≈сли все хорошо и исключение не вылетело, то выводить в консоль сообщение что автомобиль с такой-то
          маркой завелс€.
        ¬ main создаете парочку автомобилей и пытаетесь их завести. » обрабатываете исключение которое может вылететь при старте автомобил€*/