package ss6_Ke_Thua.bai_1;

public class Cylinder extends Circle {
    private double hieght =1;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double hieght) {
        super(radius, color);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getVolume(){
        return getArea()*hieght;
    }
    @Override
    public String toString(){
        String status = super.toString() + " and height = " + getHieght() + " volume = " +getVolume();
        return status;
    }
}
