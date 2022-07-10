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
        System.out.println(" ������� ������� ����������������� -" + ejectionSystem);
        System.out.println("���������� ����� �� ����� - " + rocket);
    }

    public void shoot() {
        if (rocket == 0) {
            System.out.println("���������� �����������");
        } else {
            System.out.println(" ������ �����");
        }
    }

        public void catapult () {
        boolean i = ejectionSystem;
            if (i) {
                System.out.println("����������������� ������ �������");
                System.out.println("-----------------------");
            } else {
                System.out.println("� ��� ��� ����� �������");
                System.out.println("------------------------");
            }
        }
    }



   /* ��� ������� �������� ������ ����� �������, ��������� ���� ���-��
        ����� �� ����� 0 �� ������� �� ������� � ������ �������, ���� 0 ��
        ����������� �����������.
        � ��� �� ����� �����������������, ������� �������� ���� ������� �������
        ����������������� true, �� ������� ������������������ ������ �������,
        ���� false, �� �� ��� ��� ����� ������� �*/