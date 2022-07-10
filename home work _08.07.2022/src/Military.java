public class Military extends Air {
    private boolean ejectionSystem;
    private int rocket;

    public Military(int power, int speed, int mass, String mark, int wingspan, int minRunwayLength, boolean ejectionSystem, int rocket) {
        super(power, speed, mass, mark, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.rocket = rocket;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" Наличие системы катапультирования -" + ejectionSystem);
        System.out.println("Количкство ракет на борту - " + rocket);
    }

    public void shoot() {
        if (rocket == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println(" Ракета пошла");
        }
    }

        public void catapult () {
        boolean i = ejectionSystem;
            if (i) {
                System.out.println("Катапультирование прошло успешно");
                System.out.println("-----------------------");
            } else {
                System.out.println("У Вас нет такой системы");
                System.out.println("------------------------");
            }
        }
    }



   /* Для Военных самолётов делаем метод выстрел, проверяем если кол-во
        ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
        “Боеприпасы отсутствуют”.
        А так же метод катапультирование, который проверит если наличие системы
        катапультирования true, то выводим “Катапультирование прошло успешно”,
        если false, то “У вас нет такой системы ”*/