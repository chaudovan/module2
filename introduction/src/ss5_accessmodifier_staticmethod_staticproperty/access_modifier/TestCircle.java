package ss5_accessmodifier_staticmethod_staticproperty.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cr1 = new Circle(2);
        double radius = cr1.getRadius();
        double area = cr1.getArea();
        System.out.println("radius : " + radius);
        System.out.println("Area : " + area);
    }
}
