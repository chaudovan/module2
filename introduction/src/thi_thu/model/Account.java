package thi_thu.model;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
    private String CCCD;
    private String hoVaten;
    private Date ngaySinh;
    private int gioiTinh;
    private boolean trangThai=false;

    public Account() {
    }

    public Account(String CCCD, String hoVaten, Date ngaySinh, int gioiTinh, boolean trangThai) {
        this.CCCD = CCCD;
        this.hoVaten = hoVaten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    public abstract String getInFo();
    public String getIF(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date = df.format(this.ngaySinh);
        return this.CCCD + "," +this.hoVaten + ","  +date+ "," +this.gioiTinh  + "," + isTrangThai() ;
    }

    @Override
    public String toString() {
        return "Account{" +
                "CCCD='" + CCCD + '\'' +
                ", hoVaten='" + hoVaten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", trangThai=" + trangThai +
                '}';
    }


}
