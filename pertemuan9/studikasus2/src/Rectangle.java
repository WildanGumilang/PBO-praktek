public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public String toString() {
        return super.toString() + "with P, L : " + length + " " + width;
    }
    
    
}
