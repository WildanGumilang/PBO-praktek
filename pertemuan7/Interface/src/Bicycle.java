public class Bicycle extends Vehicle implements Driveable {

    public Bicycle(String brand) {
        super(brand, 0);
    }

    @Override
    public void drive() {
        System.out.println(brand + " is being pedaled.");
    }
}
