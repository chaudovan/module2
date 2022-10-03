package dssv.main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon =0;
        do{
            System.out.println("Menu-------");
            System.out.println(
                            "1. Thêm sinh viên vào danh sách \n" +
                            "2. In danh sách sinh viên ra màn hình\n" +
                            "3. Kiểm tra danh sách có rỗng hay không \n" +
                            "4. Lấy ra số lượng sinh viên trong danh sách\n" +
                            "5. Làm rỗng danh sách sinh viên\n" +
                            "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không(theo mã sinh viên)\n" +
                            "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n" +
                            "8. Tìm tất cả sinh viên dựa trên tên được nhập từ bàn phím\n" +
                            "9. Xuất ra danh sách sinh viên có điểm trung bình từ cao đến thấp\n" +
                            "0. Thoát"
            );
            System.out.println("vui lòng chọn chực năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                System.out.println("Nhập mã sinh viên : ");
                String maSinhVien = sc.nextLine();
                System.out.println("nhập họ và tên : ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập năm sinh : ");
                int namSinh = sc.nextInt();
                System.out.println("nhập điểm trung bình : ");
                double diemTrungBinh = sc.nextDouble();
                SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);
            }else if(luaChon==2){
                dssv.inDanhSach();
            }else if(luaChon==3){
                System.out.println("Danh sách rỗng : " + dssv.kiemTraDanhSachRong());
            }else if(luaChon==4){
                System.out.println("Số lượng sinh viên hiện tại : " + dssv.soLuongSinhVien());
            }else if(luaChon==5){
                dssv.lamRong();
            }else if(luaChon==6){
                System.out.println("nhập mã sinh viên ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("kiem tra sinh vien có tồn tại không : " + dssv.kiemTraTonTai(sv));
            }else if(luaChon==7){
                System.out.println("nhập mã sinh viên muốn xóa : ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println(dssv.xoaSinhVien(sv));
                if(dssv.xoaSinhVien(sv)){
                    System.out.println("Đã xóa sinh viên có mã : " + maSinhVien);
                }else{
                    System.out.println("không có mã sinh viên này trong danh sách");
                }
            }else if(luaChon==8){
                System.out.println("nhập tên cần tiềm : ");
                String ten = sc.nextLine();
                dssv.timKiemSinhVien(ten);
            }else if(luaChon==9){
                dssv.sapXepGiamDan();
                dssv.inDanhSach();
            }
        }while (luaChon!=0);
    }
}
