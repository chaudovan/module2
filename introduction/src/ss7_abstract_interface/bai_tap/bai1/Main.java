package ss7_abstract_interface.bai_tap.bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"Black",false);
        System.out.println(circle);
        Square square = new Square("While",true,5);
        System.out.println(square);
        Rectangle rectangle  = new Rectangle(5,6,"Blue",true);
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;

        for(Shape shape:shapes){
            if(shape instanceof Circle){
                System.out.println("kích thước trước khi tăng : " +shape.getArea());
                Resizeable resizeable = (Circle) shape;
                System.out.print("kich thước sau khi tăng : ");
                resizeable.resize(Math.random()*100);
            }else if(shape instanceof Square){
                System.out.println("kích thước trước khi tăng : " +shape.getArea());
                Square square1 = (Square) shape;
                System.out.print("kich thước sau khi tăng : ");
                square1.resize(Math.random()*100);
            }else {
                System.out.println("kích thước trước khi tăng : " +shape.getArea());
                Rectangle rectangle1 = (Rectangle) shape;
                System.out.print("kich thước sau khi tăng : ");
                rectangle1.resize(Math.random()*100);
            }
        }
    }
}
