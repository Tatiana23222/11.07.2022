import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
Passenger passenger = new Passenger(102, 200,3000,"Audi", 4, 5, "Универсал", 5);
passenger.setPower2();
passenger.printInfo();
passenger.calculate();
Truck truck = new Truck(125,548,3000,"Audi",10,5,100);
truck.setPower2();
truck.printInfo();
truck.raise();
Military military = new Military( 152,125,6000,"Audi",3,158,true,0);
military.setPower2();
military.printInfo();
military.shoot();
military.catapult();
Civil civil = new Civil(1258,125,6000,"Audi",3,158,50,true);
civil.setPower2();
civil.printInfo();
civil.seat();








    }
}
