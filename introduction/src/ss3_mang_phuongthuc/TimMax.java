package ss3_mang_phuongthuc;
import java.util.Scanner;
public class TimMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số hàng cho mảng : ");
        int hang = sc.nextInt();
        System.out.print("nhập số cột cho mảng : ");
        int cot = sc.nextInt();
        int[][] arr = new int[hang][cot];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print("Nhập phần tử arr[" + i + "][" + j + "] :");
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("max : " +  max);
    }
}
