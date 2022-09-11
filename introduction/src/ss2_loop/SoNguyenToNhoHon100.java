package ss2_loop;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        int n=2;
        while (n<100){
            int i=2;
            boolean check = true;
            while (i<n){
                if(n%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
