package ss15_ngoaile_debug.thuc_hanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a :");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số b :");
        int b = Integer.parseInt(sc.nextLine());
        calculate(a,b);
    }
    public static void calculate(int a,int b){
        try{
            int tong = a+b;
            int hieu = a-b;
            int nhan = a*b;
            int chia = a/b;
            System.out.println("Tổng : " +tong);
            System.out.println("Hiệu : " +hieu);
            System.out.println("Nhân : " +nhan);
            System.out.println("Chia : " +chia);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
