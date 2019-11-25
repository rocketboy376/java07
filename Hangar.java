public class Hangar {
    // 9. main() method
    public static void main(String[] args) {
    // 10. References to instances of Car and Boat
        Car audi = new Car("Audi A3");
        Boat titanic = new Boat("Titanic");

    // 11. Display result of references
    System.out.println(audi.doStuff());
    System.out.println(titanic.doStuff());
    }   
}