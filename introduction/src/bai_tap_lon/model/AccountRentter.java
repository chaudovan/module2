package bai_tap_lon.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountRentter extends Account{
    private float minDienTich;
    private float maxDienTich;
    private float minGiaTien;
    private float maxGiatien;
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public AccountRentter() {
    }

    public AccountRentter(String CCCD,String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangthai, float minDienTich, float maxDienTich, float minGiaTien, float maxGiatien) {
        super(CCCD,hoVaTen, ngaySinh, gioiTinh, trangthai);
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiatien = maxGiatien;
    }
    public AccountRentter(String str) throws ParseException {
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
        this.maxDienTich = Float.parseFloat(strings[5]);
        this.minDienTich = Float.parseFloat(strings[6]);
        this.maxGiatien = Float.parseFloat(strings[7]);
        this.minGiaTien = Float.parseFloat(strings[8]);

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

    public float getMinGiaTien() {
        return minGiaTien;
    }

    public void setMinGiaTien(float minGiaTien) {
        this.minGiaTien = minGiaTien;
    }

    public float getMaxGiatien() {
        return maxGiatien;
    }

    public void setMaxGiatien(float maxGiatien) {
        this.maxGiatien = maxGiatien;
    }

    @Override
    public String toString() {
        return "AccountRentter{" +super.toString()+
                "minDienTich=" + minDienTich +
                ", maxDienTich=" + maxDienTich +
                ", minGiaTien=" + minGiaTien +
                ", maxGiatien=" + maxGiatien +
                '}';
    }

    @Override
    public String getInFo() {
        return super.getData() + "," + this.minDienTich + "," + this.maxDienTich +"," +this.minGiaTien +"," +this.maxGiatien;
    }
}
