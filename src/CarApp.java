import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args){
        ArrayList<Car> stock = new ArrayList<Car>();
        stock.add(new Car("Ford", "Focus", 2017, 15000.00));
        stock.add(new Car("Chevy", "Cavalier", 2017, 25000.00));
        stock.add(new Car("Cadillac", "Escalade", 2017, 75000.00));
        stock.add(new UsedCar("Ford", "Focus", 2008, 10000.00, "used", 75000));
        stock.add(new UsedCar("Chevy", "Cavalier", 2004, 8000.00, "used", 175000));
        stock.add(new UsedCar("Cadillac", "Escalade", 2010, 45000.00, "used", 47000));
        for (Car c : stock) {
            System.out.println(c);
        }


    }
}
