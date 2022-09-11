package ss3_Mang_PhuongThuc;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phân tử : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("Nhập phân tử arr[" +i+ "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("nhập phần tử cần xóa : ");
        int xoa = sc.nextInt();
        arr = xoaIndex(arr,xoa);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print( +arr[i] + " ");
        }
    }
    public static int[] xoaIndex(int[] arr, int x){
        int[] arrNew = new int[arr.length-1];
        for (int i = 0; i <arrNew.length ; i++) {
            if(arr[i]==x){
                for (int j = i; j <arrNew.length ; j++) {
                    arrNew[j] = arr[j+1];
                }
            }else{
                arrNew[i] = arr[i];
            }
        }
        return arrNew;
    }
}