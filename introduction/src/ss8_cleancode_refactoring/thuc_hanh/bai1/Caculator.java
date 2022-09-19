package ss8_cleancode_refactoring.thuc_hanh.bai1;

public class Caculator {
    public static final char ADDITION ='+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static double caculate(double firstOperand,double secondOperand,char operator){
        switch (operator){
            case ADDITION:
                return firstOperand+secondOperand;
            case SUBTRACTION:
                return firstOperand-secondOperand;
            case MULTIPLICATION:
                return firstOperand*secondOperand;
            case DIVISION:
                if(secondOperand==0){
                    throw new RuntimeException("Can not divide by 0");
                }else{
                    return firstOperand/secondOperand;
                }
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
