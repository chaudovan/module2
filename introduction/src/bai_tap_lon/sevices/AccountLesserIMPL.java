package bai_tap_lon.sevices;

import bai_tap_lon.model.AccountLessor;
import bai_tap_lon.until.ReadAndWrite;
import bai_tap_lon.until.RegexData;


import java.text.SimpleDateFormat;
import java.util.*;

public class AccountLesserIMPL {
    //private AccountLessor accountLessor = new AccountLessor();
    public static final String REGGEX_CCCD ="[\\d]{12}";
    public static List<AccountLessor> accountLessors = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static void add() throws Exception {
        accountLessors.clear();
        accountLessors = ReadAndWrite.readDataFromFileAccountLessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv");
        boolean check;
        String CCCD="";
        do {
            System.out.println("nhập CCCD :");
            CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
            check=false;
            for (AccountLessor accountLessor : accountLessors) {
                if (CCCD.equals(accountLessor.getCCCD())) {
                    System.out.println("CCCD " + CCCD + " đã tồn tại");
                    check=true;
                }
            }
        }while (check);
        System.out.println("nhập họ và tên: ");
        String hoVaTen = sc.nextLine();
        Date ngaySinh = null;
        System.out.println("Nhập ngày sinh: ");
        while (ngaySinh == null) {
            String dateAsString = sc.nextLine();
            ngaySinh = RegexData.validateDate(dateAsString);
            if (ngaySinh == null) {
                System.out.println("vui lòng nhập đúng định dạng dd/mm/YYYY: ");
            }
        }
        int choice=0;
        do {
            System.out.println("mời nhập giới tính :");
            System.out.println("0. nam");
            System.out.println("1. nu");
            choice = Integer.parseInt(sc.nextLine());
        }while (choice!=0&&choice!=1);
        int gioitinh = choice;
        System.out.println("mời nhập diện tích :");
        float dienTich = Float.parseFloat(sc.nextLine());
        System.out.println("nhập địa chỉ :");
        String diaChi = sc.nextLine();
        System.out.println("nhập số người ở :");
        int soNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("giá tiền :");
        float giaTien = Float.parseFloat(sc.nextLine());
        AccountLessor accountLessor = new AccountLessor(CCCD,hoVaTen,ngaySinh,gioitinh,false,dienTich,diaChi,soNguoi,giaTien);
        accountLessors.add(accountLessor);
        ReadAndWrite.writeAccountlessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv",accountLessors);
    }
    public static void writeFile(){
        ReadAndWrite.writeAccountlessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv",accountLessors);
    }
    public static void display(){
        accountLessors.clear();
        accountLessors = ReadAndWrite.readDataFromFileAccountLessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv");
        Collections.sort(accountLessors, new Comparator<AccountLessor>() {
            @Override
                public int compare(AccountLessor o1, AccountLessor o2) {
                    if(o1.getHoVaTen().equals(o2.getHoVaTen())){
                        return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                    }
                    return o1.getHoVaTen().compareTo(o2.getHoVaTen());
            }
        });
        System.out.println("Danh sách người cho thuê:\n");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà", "Địa chỉ", "Số người tối đa", "Giá tiền");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        for(AccountLessor accountLessor:accountLessors){
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16s|%-15s|\n", accountLessor.getCCCD(), accountLessor.getHoVaTen(), simpleDateFormat.format(accountLessor.getNgaySinh()), accountLessor.getGioiTinh(), accountLessor.isTrangthai(), accountLessor.getDienTich(), accountLessor.getDiaChi(), accountLessor.getSoNguoi(), accountLessor.getGiaTien());
        }
    }
    public static void timkiem(){
        accountLessors.clear();
        accountLessors = ReadAndWrite.readDataFromFileAccountLessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv");
        System.out.println("nhập CCCD :");
        boolean check;
        String CCCD="";
        CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
        while (!accountLessors.contains(CCCD)){
            System.out.println("CCCD này chưa tồn tại");
            System.out.println("mời nhập lại :");
            CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
        }
        
    }
    public static void delete(){
        accountLessors.clear();
        accountLessors = ReadAndWrite.readDataFromFileAccountLessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv");
        System.out.println("nhập CCCD :");
        boolean check;
        String CCCD="";
        CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
        check=false;
        int index=0;
        for (int i=0;i<accountLessors.size();i++) {
            if (CCCD.equals(accountLessors.get(i).getCCCD())) {
                accountLessors.remove(i);
                check=true;
            }
        }
        if(check){

            for(AccountLessor accountLessor:accountLessors){
                System.out.println(accountLessor.getInFo());
            }
            ReadAndWrite.writeAccountlessor("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountLessor.csv",accountLessors);
            System.out.println("xóa thành công");
        }else {
            System.out.println("CCCD ko tồn tại");
        }

    }
}
