package test;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr  = {4,3,5,-1,8,10};
        for (int i = 0; i <arr.length ; i++) {
            boolean status = true;
            for (int j = 1; j <arr.length ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    status=false;
                }
            }
            if(status){
                break;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
