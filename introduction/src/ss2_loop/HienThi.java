package ss2_loop;
import java.util.Scanner;
public class HienThi {
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        chon = sc.nextInt();
        if(chon==1){
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(chon==2){
            for (int i = 1; i <=5 ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 1; i<=5 ; i++) {
                for (int j = 5; j >=i ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            for (int i=1; i<=5 ; i++) {
                for (int j = 2; j <= 6; j++) {
                    if (j > i) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 1; i<=5 ; i++) {
                for (int j = 5; j >=1 ; j--) {
                    if(j<=i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else if(chon==3){
            for (int i = 1; i <=5 ; i++) {
                for (int j = 0; j <5-i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <2*i-1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(chon==4){
            System.out.println("Đã thoát");
        }else {
            System.out.println("SOS chọn 1-4 thôi ạ");
        }
    }
}
