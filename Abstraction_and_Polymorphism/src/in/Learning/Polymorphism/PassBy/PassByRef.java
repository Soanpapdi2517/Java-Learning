package in.Learning.Polymorphism.PassBy;

import java.awt.*;


public class PassByRef {
    public static void main(String[] args) {
        Point first = new Point(21, 12);
        System.out.println("first: " + first);
        move(first);
        System.out.println("First: " + first);
        System.out.println("By this it  confirms that when we change the number in " +
                "its reference it automatically overwrite the parwmeter\n"+
                "For example when we have two cups of  same size and empty " +
                "we fill one with coffee and other  one automatically fills by itself");
    }
    public static void move(Point p){
        p.a++;
        p.b++;
        System.out.println(p);
    }
    public static class Point{
        int a = 10;
        int b = 11;

        @Override
        public String
        toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("a=").append(a);
            sb.append(", b=").append(b);
            sb.append('}');
            return sb.toString();
        }

        public Point(int a, int b) {
            this.a = a;
            this.b = b;

        }
    }
}