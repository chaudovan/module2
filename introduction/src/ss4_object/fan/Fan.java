package ss4_object.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 1;
    private final int FAST = 1;
    private int speed = 1;
    private boolean status  =false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        String a ="";
        if(this.status){
            a += "fan is on \n Speed is : " +this.speed + "\n";
        }else{
            a +="fan is off \n";
        }
        a += "Color : " + this.color +"\n";
        a += "Radius : " + this.radius +"\n";
        return a;
    }
}
