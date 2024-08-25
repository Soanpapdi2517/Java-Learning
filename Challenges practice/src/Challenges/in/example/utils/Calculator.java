package Challenges.in.example.utils;

import Challenges.in.example.geometry.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to know Area of your Circle And Rectangle");
        Scanner input = new Scanner(System.in);
        double radius;
        int select;
        double len;
        double breadth;
        do {
            System.out.println("To select: \n" +
                    "1. know Area of Circle\n" +
                    "2. Know Area of Rectangle");
            select = input.nextInt();
            if (select == 1) {
                System.out.print("Enter the radius: ");
                radius = input.nextDouble();
                Circle mycircle = new Circle(radius);
                double cirArea = Math.round(Math.PI * Math.pow(mycircle.radius,2));
                System.out.printf("Area of the circle is:%f", cirArea);
                break;
            } else if (select == 2) {
                System.out.print("Enter the Length ");
                len = input.nextInt();
                System.out.print("Enter the Breadth: ");
                breadth = input.nextInt();
                Rectangle myrectangle = new Rectangle(len, breadth);
                double rectArea = (myrectangle.length * myrectangle.breadth);
                System.out.printf("Area of the rectangle is: %f", rectArea);
                break;
            }else {
                System.out.println("Please select limited options!!");
            }
        }while (select != 1 || select != 2);
    }
}
