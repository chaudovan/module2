package ss4_object.fan;

public class main {
    public static void main(String[] args) {
        Fan fan3 = new Fan();
        Fan fan1 = new Fan(3,true,10,"Yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}
