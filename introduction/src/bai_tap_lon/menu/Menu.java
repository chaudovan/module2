package bai_tap_lon.menu;

import bai_tap_lon.sevices.AccountLesserIMPL;
import bai_tap_lon.sevices.AccountRentterIMPL;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        displayMenu();
    }
    public static AccountLesserIMPL accountLesserIMPLS = new AccountLesserIMPL();
    public static AccountRentterIMPL accountRentterIMPLS = new AccountRentterIMPL();
    public static Scanner sc = new Scanner(System.in);
    public static void displayMenu() throws Exception {
        System.out.println("Menu--------");
        System.out.println("1. Chức năng đăng ký người thuê/cho thuê nhà");
        System.out.println("2. Hiển thị thông tin người thuê/cho thuê nhà");
        System.out.println("3. Tìm kiếm người cho thuê phù hợp theo CCCD của người thuê");
        System.out.println("4. Hiển thị và xoá những người thuê/cho thuê nhà thành công");
        System.out.println("5. Lưu lại dữ liệu người thuê/cho thuê vào file");
        System.out.println("6. Import dữ liệu người thuê/cho thuê vào chương trình");
        System.out.println("7. Thoát");
        int choice=0;
        do {
            try {
                System.out.println("Mời chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1:
                    displayDangKy();
                    displayMenu();
                    break;
                case 2:
                    hienThi();
                    displayMenu();
                    break;
                case 3:
                    timKiem();
                    displayMenu();
                    break;
                case 4:
                    xoa();
                    displayMenu();
                    break;
                case 5:
                    ghiFile();
                    displayMenu();
                    break;
                case 6:
                    hienThi();
                    displayMenu();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("bạn chỉ có thể chọn 1-7");
            }
        }while (choice<1 ||choice>7);

    }
    public static void displayDangKy() throws Exception {
        System.out.println("Menu Đăng ky");
        System.out.println("1.Dăng ký người cho thuê");
        System.out.println("2.Dăng ký người thuê");
        System.out.println("3.Về menu chính");
        int choice=0;
        do {
            try {
                System.out.println("Mời chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1:
                    accountLesserIMPLS.add();
                    displayDangKy();
                    break;
                case 2:
                    accountRentterIMPLS.add();
                    displayDangKy();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("vui lòng chọn 1 hoặc 2 hoăc 3");
            }
        }while (choice<1 && choice>3);
    }
    public static void hienThi() throws Exception {
        System.out.println("Menu hiển thị");
        System.out.println("1.Hiển thị danh sách người cho thuê");
        System.out.println("2.Hiển thị danh sách người thuê");
        System.out.println("3.Về menu chính");
        int choice=0;
        do {
            try {
                System.out.println("Mời chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1:
                    accountLesserIMPLS.display();
                    hienThi();
                    break;
                case 2:
                    accountRentterIMPLS.display();
                    hienThi();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("vui lòng chọn 1 hoặc 2");
            }
        }while (choice<1&&choice>3);
    }
    public static void timKiem(){
        accountLesserIMPLS.timkiem();
    }
    public static void xoa() throws Exception {
        accountLesserIMPLS.delete();
        displayMenu();
    }
    public static void ghiFile() throws Exception {
        System.out.println("Menu ghi file");
        System.out.println("1.Ghi file accountLessor");
        System.out.println("2.Ghi file accountRentter");
        System.out.println("3.Về menu chính");
        int choice=0;
        do {
            try {
                System.out.println("Mời chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1:
                    accountLesserIMPLS.writeFile();
                    ghiFile();
                    break;
                case 2:
                    accountRentterIMPLS.writeFile();
                    ghiFile();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("vui lòng chọn 1 hoặc 2");
            }
        }while (choice<1 && choice>3);
    }
}
