package ss8_cleancode_refactoring.thuc_hanh.bai1;

public class Main {
    public static void main(String[] args) {
        // test phép cộng
        double result = Caculator.caculate(5,4,Caculator.ADDITION);
        System.out.println(result);
        // test phép trừ
        result = Caculator.caculate(5,4,Caculator.SUBTRACTION);
        System.out.println(result);
        // test phép nhân
        result = Caculator.caculate(5,4,Caculator.MULTIPLICATION);
        System.out.println(result);
        //test phép chia
        result = Caculator.caculate(5,4,Caculator.DIVISION);
        System.out.println(result);
        result = Caculator.caculate(5,0,Caculator.DIVISION);
        System.out.println(result);

    }
}
