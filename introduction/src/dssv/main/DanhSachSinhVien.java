package dssv.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> dssv ;

    public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public DanhSachSinhVien() {
        this.dssv = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        this.dssv.add(sv);
    }
    public void inDanhSach(){
        for (SinhVien sinhVien:dssv) {
            System.out.println(sinhVien);
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.dssv.isEmpty();
    }
    public int soLuongSinhVien(){
        return this.dssv.size();
    }
    public void lamRong(){
        this.dssv.removeAll(dssv);
    }
    public boolean kiemTraTonTai(SinhVien sv){
        return this.dssv.contains(sv);
    }
    public boolean xoaSinhVien(SinhVien sv){
        return this.dssv.remove(sv);
    }
    public void timKiemSinhVien(String ten){
        for (SinhVien sinhVien:dssv) {
            if(sinhVien.getHoVaTen().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }
    public void sapXepGiamDan(){
        Collections.sort(this.dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return -1;
                }else if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }
}
