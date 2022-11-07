package thi_thu.model;

import dssv.main.SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class AccountLessor extends Account implements Comparable<AccountLessor>{
    private ArrayList<AccountLessor> lessorArrayList;
    private SimpleDateFormat df =new SimpleDateFormat("dd/MM/yyyy");
    private float dienTich ;
    private String diaChi;
    private int soNguoi;
    private double giatien;

    public AccountLessor() {
    }

    public AccountLessor(String CCCD, String hoVaten, Date ngaySinh, int gioiTinh, boolean trangThai, float dienTich, String diaChi, int soNguoi, double giatien) {
        super(CCCD, hoVaten, ngaySinh, gioiTinh, trangThai);
        this.dienTich = dienTich;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giatien = giatien;
    }
    public AccountLessor(String str){
        String[] strings= str.split(",");
        this.setCCCD(strings[0]);
        this.setHoVaten(strings[1]);
        Date date = null;
        try {
            date = df.parse(strings[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.setNgaySinh(date);
        this.setGioiTinh(Integer.parseInt(strings[3]));
        if(strings[4]=="false"){
            this.setTrangThai(false);
        }else {
            this.setTrangThai(true);
        }
        this.dienTich = Float.parseFloat(strings[5]);
        this.diaChi = strings[6];
        this.soNguoi =Integer.parseInt(strings[7]);
        this.giatien = Double.parseDouble(strings[8]);
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    public String getInFo(){
        return this.getIF() + "," +
                this.getDienTich() + "," +this.getDiaChi() + "," +this.getSoNguoi() + "," +this.getGiatien();
    }
//    public void sapXep(){
//        Collections.sort(this.lessorArrayList, new Comparator<Account>() {
//            @Override
//            public int compare(Account o1, Account o2) {
//                if(o1.getHoVaten().)
//                return 0;
//            }
//
////            @Override
////            public int compare(SinhVien sv1, SinhVien sv2) {
////                if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
////                    return -1;
////                } else if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
////                    return 1;
////                } else {
////                    return 0;
////                }
////            }
//        });
//    }

    public void sapXepGiamDan(){
        Collections.sort(lessorArrayList, new Comparator<AccountLessor>() {
            @Override
            public int compare(AccountLessor o1, AccountLessor o2) {
                if(o1.getHoVaten().equals(o2.getHoVaten())){
                    o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                return o1.getHoVaten().compareTo(o2.getHoVaten());
            }

//            @Override
//            public int compare(SinhVien sv1, SinhVien sv2) {
//                if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
//                    return -1;
//                }else if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
//                    return 1;
//                }else {
//                    return 0;
//                }
//            }
        });
    }
    @Override
    public int compareTo(AccountLessor o) {
        if(this.getHoVaten().equals(o.getHoVaten())){
            return this.getNgaySinh().compareTo(o.getNgaySinh());
        }
        return this.getHoVaten().compareTo(o.getHoVaten());
    }
}
