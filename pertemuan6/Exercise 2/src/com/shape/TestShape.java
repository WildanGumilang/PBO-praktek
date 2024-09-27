package com.shape;

public class TestShape {
    public static void main(String[] args) {
        // Menguji konstruktor default
        Shape shape1 = new Shape();
        Circle circle1 = new Circle();
        Rectangle rectangle1 = new Rectangle();
        Square square1 = new Square(3.0);
        System.out.println("Shape1: " + shape1.toString());
        System.out.println("circle1: " + circle1.toString());
        System.out.println("rectangle1: " + rectangle1.toString());
        System.out.println("square1: " + square1.toString());
        
        // Menguji konstruktor dengan parameter
        Shape shape2 = new Shape("blue", false);
        System.out.println("Shape2: " + shape2.toString());
        
        // Mengubah warna dan status terisi
        shape2.setColor("red");
        shape2.setFilled(true);
        System.out.println("Shape2 (updated): " + shape2.toString());

        // Menampilkan informasi warna dan status filled
        System.out.println("Shape2's color: " + shape2.getColor());
        System.out.println("Shape2 is filled: " + shape2.isFilled());
    }
}
