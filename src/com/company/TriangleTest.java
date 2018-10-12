package com.company;

public class TriangleTest {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        System.out.println("Triangle Area = "+triangle.getArea());
        System.out.println("Triangle Perimeter = "+triangle.getPerimeter());
        System.out.println(triangle.toString());

        Triangle triangle1 = new Triangle("purple", true, 2, 3, 5);
        System.out.println("Triangle Area = "+triangle1.getArea());
        System.out.println("Triangle Perimeter = "+triangle1.getPerimeter());
        System.out.println(triangle1.toString());
    }
}
