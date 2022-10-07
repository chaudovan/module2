package ss14_thuat_toan_sap_xep.thuc_hanh.noi_bot;

public class BubbleSort {
    static int[] arr = {3,1,2,4,6,8,9};
    public static void bubbleSort(int[] list){
        for (int i = 0; i <list.length ; i++) {
            for (int j = list.length-1; j >i ; j--) {
                if(list[j]<list[j-1]){
                    int temp =list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
