public abstract class Vehicle {

    // 2. Attributes
    private String brand;
    private int kilometers;

    // 3a. Constructor 1
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // 3b. Constructor 1 and 2
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // 4a. getters
    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    // 4b. setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // 7. abstract method
    public abstract String doStuff();
}