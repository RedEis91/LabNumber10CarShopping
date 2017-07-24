import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        int contin = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> stock = new ArrayList<Car>();
        stock.add(new Car("Ford", "Focus", 2017, 15000.00));
        stock.add(new Car("Chevy", "Cavalier", 2017, 25000.00));
        stock.add(new Car("Cadillac", "Escalade", 2017, 75000.00));
        stock.add(new UsedCar("Ford", "Focus", 2008, 10000.00, "used", 75000));
        stock.add(new UsedCar("Chevy", "Cavalier", 2004, 8000.00, "used", 175000));
        stock.add(new UsedCar("Cadillac", "Escalade", 2010, 45000.00, "used", 47000));


        int selection = getSelection(scan, stock);
        if (selection > 0 && selection < (stock.size() + 1)) {
//            contin = selection;

            System.out.println(stock.get(selection-1));
            scan.nextLine();
            System.out.println("Would you like to buy this car?");
            String buy = scan.nextLine();
            if (buy.contains("y") || buy.contains("Y")) {

                stock.remove(selection - 1);
                System.out.println("Excellent! I'm making so much money today mwahahahaha...ahem.");
                System.out.println();
                getSelection(scan, stock);
            }
        }
        System.out.println("Have a great day!");
    }

    public static int getSelection(Scanner scan, ArrayList<Car> stock) {
        int i = 1;
        for (Car c : stock) {
            System.out.println(i + ": " + c);
            i++;
        }
        System.out.println((i) + ". Quit ");
        System.out.println("Which car would you like?: ");
        return scan.nextInt();
    }
}
