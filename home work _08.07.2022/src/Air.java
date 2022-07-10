public class Air extends Transport{
    private int wingspan;
    private  int minRunwayLength;

    public Air(int power, int speed, int mass, String mark, int wingspan, int minRunwayLength) {
        super(power, speed, mass, mark);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("������ �������-"+ wingspan + "�");
        System.out.println("����������� ����� ������-���������� ������ ��� ����� -" + minRunwayLength+"�");
    }
}
