package thi_thu.model;

import dssv.main.SinhVien;
import javafx.css.StyleableStringProperty;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Menu{
    public static final String REGGEX_CCCD ="[\\d]{12}";
    private static final String REGEX_DATE = "^\\d{2}/\\d{2}/\\d{4}$";
    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static Scanner sc = new Scanner(System.in);
    public static AccountLessor list = new AccountLessor();
    public static List<AccountLessor> list_accountLessor = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        display();
    }

    public static void display()throws Exception{
        int choice =0;
        do{
            System.out.println("Menu-----");
            System.out.println("1. Chức năng đăng ký người thuê/cho thuê nhà\n" +
                    "2. Hiển thị thông tin người thuê/cho thuê nhà\n" +
                    "3. Tìm kiếm người cho thuê phù hợp theo CCCD của người thuê\n" +
                    "4. Hiển thị và xoá những người thuê/cho thuê nhà thành công\n" +
                    "5. Lưu lại dữ liệu người thuê/cho thuê vào file\n" +
                    "6. Import dữ liệu người thuê/cho thuê vào chương trình\n" +
                    "7. Thoát\n"
            );
            System.out.println("mời chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addNewAcountLessor();
                    display();
                    break;
                case 2:
                    displayAccount();
                    display();
                    break;
            }
        }while (choice<1 ||choice>7);
    }
    public static void addNewAcountLessor() throws Exception{
        list_accountLessor.clear();
        list_accountLessor = ReadAndWrite.readDataFromFile("src\\thi_thu\\model\\accountlessor");
        boolean check;
        String CCCD="";
        do {
            System.out.println("nhập CCCD :");
            CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
            check=false;
            for (AccountLessor accountLessor : list_accountLessor) {
                if (CCCD.equals(accountLessor.getCCCD())) {
                    System.out.println("CCCD " + CCCD + " đã tồn tại");
                    System.out.println(accountLessor.toString());
                    check=true;
                }
            }
        }while (check);
        System.out.println("nhập họ và tên");
        String hoVaten = sc.nextLine();
        Date birthday = null;
        System.out.println("Nhập ngày sinh: ");
        while (birthday == null) {
            String dateAsString = sc.nextLine();
            try {
                birthday = RegexData.validateDate(dateAsString);
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }

            if (birthday == null) {
                System.out.println("vui lòng nhập đúng định dạng dd/mm/YYYY: ");
            }
        }
        int gioiTinh =0;
        do {
            System.out.println("nhập giới tính:");
            gioiTinh = Integer.parseInt(sc.nextLine());
        }while (gioiTinh<-1 || gioiTinh>0);
        String gioiTinh1 = "";
        switch (gioiTinh){
            case -1:
                gioiTinh1 = "nam";
                break;
            case 2:
                gioiTinh1 = "nữ";
                break;
        }
        System.out.println("nhập diện tích :");
        float dienTich = Float.parseFloat(sc.nextLine());
        System.out.println("nhập dịa chỉ :");
        String diaChi = sc.nextLine();
        System.out.println("nhập số người tối đa :");
        int soNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("nhập giá tiền :");
        double giaTien =Double.parseDouble(sc.nextLine());
        AccountLessor accountLessor = new AccountLessor(CCCD,hoVaten,birthday,gioiTinh,false,dienTich,diaChi,soNguoi,giaTien);
        list_accountLessor.add(accountLessor);
        ReadAndWrite.write("src\\thi_thu\\model\\accountlessor",list_accountLessor);
    }
    public static void displayAccount(){
        list_accountLessor.clear();
        list_accountLessor = ReadAndWrite.readDataFromFile("src\\thi_thu\\model\\accountlessor");
        sapXep();
        for(AccountLessor accountLessor:list_accountLessor){
            System.out.println(accountLessor.getInFo());
        }
    }
    public static void sapXep(){
        Collections.sort(list_accountLessor, new Comparator<AccountLessor>() {
            @Override
            public int compare(AccountLessor o1, AccountLessor o2) {
                if(o1.getHoVaten().equals(o2.getHoVaten())){
                    return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                return o1.getHoVaten().compareTo(o2.getHoVaten());
            }
        });
    }
//    public static void sapXep(){
//        co
//    }
}
