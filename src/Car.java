public class Car {
    //instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    //class Car default/no arguments constructor
    public Car()
    {
        make = "Ford";
        model = "Focus";
        year = 2017;
        price = 15000.00;
    }
    //class Car all argument constructor
    public Car (String mk, String ml, int y, double pc)
    {
        make = mk;
        model = ml;
        year = y;
        price = pc;
    }
    //getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice(){
        return price;
    }
    //setters
    public void setMake(String mk) {
        make = mk;
    }
    public void setModel(String ml) {
        model = ml;
    }
    public void setYear(int y) {
        year = y;
    }
    public void setPrice(double pc) {
        price = pc;
    }
    //other methods
    //to make toString work, I have to match Object's toString header
    @Override
    public String toString() {
        return year+ " " + make + " " + model + ", $" + (int)price + ".00";
    }
}
