package ss6_Ke_Thua.bai_1;

public class Circle {
    private double radius=1;
    private String color="black";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public String toString(){
        String status= "A circle with radius = " + getRadius() +" color = " + getColor() + " area " + getArea();
        return status;
    }
}
