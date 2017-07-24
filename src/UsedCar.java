/**
 * Created by Jared on 7/23/17.
 */
public class UsedCar extends Car {
        private double mileage;
        private String used;

        public UsedCar(String make, String model, int year, double price) {
            super(make, model, year, price );
            this.used = used;
            this.mileage = mileage;
        }
public String getUsed() {return used;}
public void setUsed(String used) {this.used = used;}
    public double getMileage() { return mileage;}
    public void setMileage(double mileage) {this.mileage = mileage;}

}
