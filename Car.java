public class Car extends Vehicle {
    
    public Car(String brand) {
        super(brand);
    }

    // 8. implementation of the body of the method doStuff()
    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
    }
}