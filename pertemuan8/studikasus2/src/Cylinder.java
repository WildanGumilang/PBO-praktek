public class Cylinder extends Shape {
    protected double radius;
    protected double tall;
    
    public Cylinder(String shapeName, double radius, double tall) {
        super(shapeName);
        this.radius = radius;
        this.tall = tall;
    }

    @Override
    public double area() {
        return Math.PI*(radius*radius)*tall;
    }

    @Override
    public String toString() {
        return super.toString() + "with radius, tall : " + radius + " " + tall;
    }

    
}
