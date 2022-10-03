package ss6_Ke_Thua.bai_3;

public class MoveblePointTest {
    public static void main(String[] args) {
        Point point = new Point(5,7);
        System.out.println(point);

        MoveblePoint moveblePoint = new MoveblePoint(6,7,5,4);
        System.out.println(moveblePoint);
        moveblePoint.move();
        System.out.println("x = " + moveblePoint.getX() + " y = " +moveblePoint.getY());
    }
}
