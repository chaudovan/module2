package ss2_loop;
import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp số lượng số nguyên tố cần in");
        number = sc.nextInt();
        int n=2;
        int count = 0;
        while (count<number){
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
                count++;
            }
            n++;
        }
    }
}
