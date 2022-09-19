package ss4_object.pt_bac2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a :");
        int a = sc.nextInt();
        System.out.print("Nhập b :");
        int b = sc.nextInt();
        System.out.print("Nhập c :");
        int c = sc.nextInt();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        if(pt.getDiscriminant()>0){
            System.out.print("nghiệm của phương trình : " + pt.getRoot1() + " and " + pt.getRoot2());
        }else if(pt.getDiscriminant()==0){
            System.out.print("Phương trình có nghiệm kép : " + pt.getRoot1());
        }else {
            System.out.print("phương trình vô nghiệm");
        }

    }
}
