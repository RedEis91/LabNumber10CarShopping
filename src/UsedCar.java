public class UsedCar extends Car {
        private double mileage;
        private String used;

        public UsedCar( String mk, String ml, int y, double pc, String u, double m) {
            super( mk, ml, y, pc);
            this.used = u;
            this.mileage = m;
        }
    public String getUsed() {return used;}
    public void setUsed(String used) {this.used = used;}
    public double getMileage() { return mileage;}
    public void setMileage(double mileage) {this.mileage = mileage;}

    //other methods
    //to make toString work, I have to match Object's toString header
    @Override
    public String toString() {
        return super.toString() + "\n" + " (" + used + ") " + mileage + " miles";
    }
}
