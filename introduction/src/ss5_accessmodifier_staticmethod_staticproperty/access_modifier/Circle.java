package ss5_accessmodifier_staticmethod_staticproperty.access_modifier;

public class Circle {
    private double radius =1;
    private String color = "red";

    public double getPI() {
        return PI;
    }

    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return this.PI*radius*radius;
    }
}
