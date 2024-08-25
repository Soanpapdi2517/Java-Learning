package Challenges.in.example.Abstract;

public class TestShapeClass {
    public static void main(String[] args) {
        Circle cir = new Circle(7);
        Square sq = new Square(5);
        System.out.printf("Area of entered radius is %4.2f",cir.calculateArea());
        System.out.println(cir.getRadius());
        cir.setRadius(8);
        System.out.println(cir.getRadius());
        System.out.println(cir.calculateArea());
        System.out.println("---------");
        System.out.println(sq.calculateArea());
        System.out.println(sq.getSide());
        sq.setSide(6);
        System.out.println(sq.getSide());
        System.out.println(sq.calculateArea());
    }
}
