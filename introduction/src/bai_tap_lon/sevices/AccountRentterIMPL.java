package bai_tap_lon.sevices;


import bai_tap_lon.model.AccountLessor;
import bai_tap_lon.model.AccountRentter;
import bai_tap_lon.until.ReadAndWrite;
import bai_tap_lon.until.RegexData;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AccountRentterIMPL {
    public static final String REGGEX_CCCD = "[\\d]{12}";
    public static List<AccountRentter> accountRentters = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void add() throws ParseException {
        accountRentters.clear();
        accountRentters = ReadAndWrite.readDataFromFileAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv");
        boolean check;
        String CCCD = "";
        do {
            System.out.println("nhập CCCD :");
            CCCD = bai_tap_lon.until.RegexData.regex(sc.nextLine(), REGGEX_CCCD, "Input sai thong tin Can cuoc cong dan!!!");
            check = false;
            for (AccountRentter accountRentter : accountRentters) {
                if (CCCD.equals(accountRentter.getCCCD())) {
                    System.out.println("CCCD " + CCCD + " đã tồn tại");
                    check = true;
                }
            }
        } while (check);
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
        int choice = 0;
        do {
            System.out.println("mời nhập giới tính :");
            System.out.println("0. nam");
            System.out.println("1. nu");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice != 0 && choice != 1);
        int gioitinh = choice;
        System.out.println("mời nhập diện tích lớn nhất :");
        float maxDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("mời nhập diện tích nhỏ nhất :");
        float mixDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("mời nhập sô tiền lớn nhất :");
        float maxGiaTien = Float.parseFloat(sc.nextLine());
        System.out.println("mời nhập số tièn lớn nhất :");
        float mainGiaTien = Float.parseFloat(sc.nextLine());
        AccountRentter accountRentter = new AccountRentter(CCCD, hoVaTen, ngaySinh, gioitinh, false, maxDienTich, mixDienTich, maxGiaTien, mainGiaTien);
        accountRentters.add(accountRentter);
        ReadAndWrite.writeAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv", accountRentters);
    }

    public static void display() {
        accountRentters.clear();
        accountRentters = ReadAndWrite.readDataFromFileAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv");
        Collections.sort(accountRentters, new Comparator<AccountRentter>() {

            @Override
            public int compare(AccountRentter o1, AccountRentter o2) {
                if (o1.getHoVaTen().equals(o2.getHoVaTen())) {
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
        for (AccountRentter accountRentter : accountRentters) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16s|%-15s|\n", accountRentter.getCCCD(), accountRentter.getHoVaTen(), simpleDateFormat.format(accountRentter.getNgaySinh()), accountRentter.getGioiTinh(), accountRentter.isTrangthai(), accountRentter.getMaxDienTich(), accountRentter.getMinDienTich(), accountRentter.getMaxGiatien(), accountRentter.getMinGiaTien());
        }
    }
    public static void writeFile(){
        ReadAndWrite.writeAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv",accountRentters);
        System.out.println("ghi file thành công");
    }
    public static void delete(){
        accountRentters.clear();
        accountRentters = ReadAndWrite.readDataFromFileAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv");
        System.out.println("nhập CCCD :");
        boolean check;
        String CCCD="";
        CCCD= RegexData.regex(sc.nextLine(),REGGEX_CCCD,"Input sai thong tin Can cuoc cong dan!!!");
        check=false;
        int index=0;
        for (int i=0;i<accountRentters.size();i++) {
            if (CCCD.equals(accountRentters.get(i).getCCCD())) {
                accountRentters.remove(i);
                check=true;
            }
        }
        if(check){
            ReadAndWrite.writeAccountRentter("D:\\codegym\\module2\\introduction\\src\\bai_tap_lon\\data\\accountRentter.csv",accountRentters);
            System.out.println("xóa thành công");
        }else {
            System.out.println("CCCD ko tồn tại");
        }

    }
}
