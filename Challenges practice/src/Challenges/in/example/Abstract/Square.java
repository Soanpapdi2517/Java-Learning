package Challenges.in.example.Abstract;

public class Square extends Shape_83{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected double calculateArea() {
        return Math.pow(side,2);
    }
}
