package ss4_object.pt_bac2;

public class QuadraticEquation {
    private int a,b,c;
    public QuadraticEquation(){

    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
    public double getDiscriminant(){
        return (b*b-(4*a*c));
    }
    public double getRoot1(){
        return ((-b + Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
        return ((-b - Math.sqrt(getDiscriminant()))/(2*a));
    }
}
