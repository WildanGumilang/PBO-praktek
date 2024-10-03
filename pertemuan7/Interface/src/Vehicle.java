public abstract class Vehicle {
    protected String brand;
    protected int fuel;

    public Vehicle(String brand, int fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }

    public void showFuelLevel() {
        System.out.println(brand + " has " + fuel + " liters of fuel.");
    }
}
