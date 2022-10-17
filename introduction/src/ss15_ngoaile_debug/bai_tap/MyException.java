package ss15_ngoaile_debug.bai_tap;

import java.util.Scanner;

public class MyException extends Exception{
    public MyException(String s){
        System.out.println(s);
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean check = false;
        do {
            check = false;
            try {
                System.out.println("Nhập cạnh a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh c");
                double c = Double.parseDouble(scanner.nextLine());
                if (a < 0 || b < 0 || c < 0) {
                    throw new MyException("Không được nhập số âm");
                } else if ((a + b) < c || (a + c) < b || (b + c) < a) {
                    throw new MyException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
                }else {
                    System.out.println("canh a: " + a +
                            "\tcanh b :" + b +
                            "\tcanh c :" +c);
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số : ");
                check = true;
            } catch (MyException e) {
                System.out.println("Nhập lại : ");
                check = true;
            }
        } while (check);
    }
}
