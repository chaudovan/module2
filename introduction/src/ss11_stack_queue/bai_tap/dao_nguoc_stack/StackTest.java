package ss11_stack_queue.bai_tap.dao_nguoc_stack;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        stackOfInteger();
        System.out.println();
        stackOfString();
    }
    public static void stackOfInteger(){
        MyStack<Integer> inter = new MyStack();
        int arrInterger[] ={1,2,3,4,5,6};
        System.out.println("stack trước khi đảo");
        for (int i = 0; i <arrInterger.length ; i++) {
            inter.push(arrInterger[i]);
            System.out.print(arrInterger[i] + " ");
        }
        System.out.println();
        System.out.println("stack sau khi đảo");
        for (int i = 0; i <arrInterger.length ; i++) {
            System.out.print(inter.pop()+ " ");
        }

    }
    public static void stackOfString(){
        MyStack<String> stringMyStack = new MyStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào một chuổi : ");
        String chuoi = sc.nextLine();
        for (int i = 0; i <chuoi.length() ; i++) {
            stringMyStack.push(chuoi.charAt(i) + "");
        }
        System.out.println("chuổi sau khi đảo ngược :");
        for (int i = 0; i <chuoi.length(); i++) {
            System.out.print(stringMyStack.pop());
        }
    }
}
