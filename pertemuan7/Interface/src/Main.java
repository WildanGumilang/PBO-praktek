public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 50);
        Vehicle bike = new Bicycle("Poligon");

        car.showFuelLevel();
        bike.showFuelLevel();

        ((Driveable) car).drive();

        ((Driveable) bike).drive();

        ((Refuelable) car).refuel(20);
    }
}
