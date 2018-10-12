package com.company;

public class Triangle extends Shape{
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    Triangle(){super();}

    Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        return Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)-getSide1())*((getPerimeter()/2)-getSide2())*((getPerimeter()/2)-getSide3()));
    }

    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }

    @Override
    public String toString() {
        return "A triangle side 1= "
                + getSide1()
                +" , side 2 = "
                +getSide2()
                +" and side 3 = "
                +getSide3()
                + ", which is a subclass of "
                + super.toString();
    }
}
