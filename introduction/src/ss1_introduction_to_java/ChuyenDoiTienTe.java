package ss1_introduction_to_java;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        float vnd = 23000;
        float usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền usd của bạn : ");
        usd = sc.nextFloat();
        float tong = usd*vnd;
        System.out.print("Số tiền vnd tương ứng : " + tong );
    }
}
