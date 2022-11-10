package bai_tap_lon.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
    private String CCCD;
    private String hoVaTen;
    private Date ngaySinh;
    private int gioiTinh;
    private boolean trangthai;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public Account() {
    }

    public Account(String CCCD,String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangthai) {
        this.CCCD = CCCD;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.trangthai = trangthai;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
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

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    public abstract String getInFo();
    public String getData(){
        String date = df.format(this.ngaySinh);
        return this.CCCD +"," +this.hoVaTen + "," + date + "," + this.gioiTinh + "," +isTrangthai();
    }

    @Override
    public String toString() {
        return "CCCD='" + CCCD  +
                "hovaten" +hoVaTen+
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", trangthai=" + trangthai +
                '}';
    }
}
