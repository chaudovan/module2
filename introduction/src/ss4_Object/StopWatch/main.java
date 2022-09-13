package ss4_Object.StopWatch;
import java.util.Date;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[j] = temp;
                }
            }
        }
        long end =System.currentTimeMillis();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: "+sw.getElapsedTime());
    }
}
