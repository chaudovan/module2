package ss7_abstract_interface.bai_tap.bai2;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side,side,color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        String status = "A Square with side = " + getSide() + " , which is a subclass off " +super.toString();
        return status;
    }
    public void howToColor(){
        System.out.println("Color all four sides");
    }
}
