package ss6_Ke_Thua.thuc_hanh_hinh_hoc;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    public String toString(){
        String status = "A Circle with radius= " + getRadius()
                + ",which is a subclass of "
                +super.toString();
        return status;
    }
}
