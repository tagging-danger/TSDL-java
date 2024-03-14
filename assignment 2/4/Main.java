

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        car.engine();   // Outputs: Car has good engine
        truck.engine(); // Outputs: Truck has bad engine
    }
}
