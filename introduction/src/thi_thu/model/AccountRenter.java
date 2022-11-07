package thi_thu.model;

import java.util.Date;

public class AccountRenter extends Account{
    private float minDienTich;
    private float maxDienTich;
    private double minGiaTien;
    private double maxGiaTien;

    public AccountRenter() {
    }

    public AccountRenter(String CCCD, String hoVaten, Date ngaySinh, int gioiTinh, boolean trangThai, float minDienTich, float maxDienTich, double minGiaTien, double maxGiaTien) {
        super(CCCD, hoVaten, ngaySinh, gioiTinh, trangThai);
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }

    public float getMinDienTich() {
        return minDienTich;
    }

    public void setMinDienTich(float minDienTich) {
        this.minDienTich = minDienTich;
    }

    public float getMaxDienTich() {
        return maxDienTich;
    }

    public void setMaxDienTich(float maxDienTich) {
        this.maxDienTich = maxDienTich;
    }

    public double getMinGiaTien() {
        return minGiaTien;
    }

    public void setMinGiaTien(double minGiaTien) {
        this.minGiaTien = minGiaTien;
    }

    public double getMaxGiaTien() {
        return maxGiaTien;
    }

    public void setMaxGiaTien(double maxGiaTien) {
        this.maxGiaTien = maxGiaTien;
    }
    public String getInFo(){
        return this.getCCCD() + "," + this.getHoVaten()+ "," + this.getNgaySinh()+ "," +this.getGioiTinh()+ "," +this.isTrangThai()+ "," +
                this.getMinDienTich() + "," +this.getMaxDienTich() + "," +this.getMinGiaTien() + "," +this.getMaxGiaTien();
    }
}
