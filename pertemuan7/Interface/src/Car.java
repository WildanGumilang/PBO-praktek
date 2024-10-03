public class Car extends Vehicle implements Refuelable, Driveable {

    public Car(String brand, int fuel) {
        super(brand, fuel);
    }

    @Override
    public void drive() {
        if (fuel > 0) {
            fuel -= 10;
            System.out.println(brand + " is driving.");
        } else {
            System.out.println(brand + " has no fuel to drive.");
        }
    }

    @Override
    public void refuel(int liters) {
        fuel += liters;
        System.out.println(brand + " is refueled by " + liters + " liters.");
    }
}
