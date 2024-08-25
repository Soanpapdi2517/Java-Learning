package Challenges.in.example.Abstract;

public class Circle extends Shape_83 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
