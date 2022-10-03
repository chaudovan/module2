package ss13_thuat_toan_tim_kiem.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        ArrayList<Character> newString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            int n=0;
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(n)) {
                    list.add(string.charAt(j));
                    n++;
                }
            }
            if (list.size() > newString.size()) {
                newString.clear();
                newString.addAll(list);
            }
            list.clear();
        }

        for (Character ch: newString) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
