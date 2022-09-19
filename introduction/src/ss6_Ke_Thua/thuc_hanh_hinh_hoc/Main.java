package ss6_Ke_Thua.thuc_hanh_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("while",false);
        System.out.println(shape);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5,7);
        System.out.println(rectangle);

        rectangle = new Rectangle("black",true,4,6);
        System.out.println(rectangle);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle("red",true,5);
        System.out.println(circle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);

        square = new Square( "yellow", true,5);
        System.out.println(square);
    }
}
