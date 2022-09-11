package ss3_Mang_PhuongThuc;
import java.util.Scanner;
public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử cho mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("nhập phần tử arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("nhập số X : ");
        int x = sc.nextInt();
        System.out.print("nhập vị trí càn chèn : " );
        int index = sc.nextInt();
        if(index<=1 || index >=arr.length-1){
            System.out.println("không thể chèn");
        }else {
           arr = chen(arr,x,index);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static int[] chen(int[] arr,int x,int k){
        int[] arrNew = new int[arr.length+1];
        for (int i = 0; i <arrNew.length ; i++) {
            if(i<k){
                arrNew[i] = arr[i];
            }else if(i==k){
                arrNew[i] = x;
            }else {
                arrNew[i] = arr[i-1];
            }
        }
        return arrNew;
    }

}
