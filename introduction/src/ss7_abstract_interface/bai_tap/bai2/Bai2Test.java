package ss7_abstract_interface.bai_tap.bai2;

public class Bai2Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"black",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4,5,"while",true);
        System.out.println(rectangle);

        Square square = new Square("blue",true,5);
        System.out.println(square);

        Shape[] shapes = new Shape[3];
        shapes[0] = square;
        shapes[1] = rectangle;
        shapes[2] = circle;

        for(Shape shape:shapes){
            System.out.println("Diện tích : " + shape.getArea());
            if(shape instanceof Square){
                Square s = (Square) shape;
                s.howToColor();
            }
        }
    }
}
