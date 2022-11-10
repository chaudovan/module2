package bai_tap_lon.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountLessor extends Account{
    private float dienTich;
    private String diaChi;
    private int soNguoi;
    private float giaTien;
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public AccountLessor() {
    }
    public AccountLessor(String str) throws ParseException {
        String[] strings = str.split(",");
        setCCCD(strings[0]);
        setHoVaTen(strings[1]);
        Date date = simpleDateFormat.parse(strings[2]);
        setNgaySinh(date);
        setGioiTinh(Integer.parseInt(strings[3]));
        if(strings[4]=="false"){
            setTrangthai(false);
        }else {
            setTrangthai(true);
        }
        this.dienTich = Float.parseFloat(strings[5]);
        this.diaChi = strings[6];
        this.soNguoi = Integer.parseInt(strings[7]);
        this.giaTien = Float.parseFloat(strings[8]);
    }
    public AccountLessor(String CCCD,String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangthai, float dienTich, String diaChi, int soNguoi, float giaTien) {
        super(CCCD,hoVaTen, ngaySinh, gioiTinh, trangthai);
        this.dienTich = dienTich;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
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

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "AccountLessor{" +super.toString()+
                "dienTich=" + dienTich +
                ", diaChi='" + diaChi + '\'' +
                ", soNguoi=" + soNguoi +
                ", giaTien=" + giaTien +
                '}';
    }

    @Override
    public String getInFo() {
        return super.getData() + "," + this.dienTich + "," + this.diaChi + "," + this.soNguoi + "," +this.giaTien;
    }
}
