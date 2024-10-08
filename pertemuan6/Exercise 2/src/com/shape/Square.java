package com.shape;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side); 
    }

    
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}
