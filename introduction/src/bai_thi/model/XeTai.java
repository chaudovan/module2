package bai_thi.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XeTai extends PhuongTien{
    private float trongTai;

    public XeTai() {
    }

    public XeTai(String line){
        String[] data = line.split(",");
        this.setMaPhuongTien(data[0]);
        this.setTenPhuongTien(data[1]);
        this.setHangSanXuat(data[2]);
        this.setNamSanXuat(Integer.parseInt(data[3]));
        this.setCongSuat(data[4]);
        this.setDungTich(data[5]);
        this.setLoaiPhuongTien(Integer.parseInt(data[6]));
        this.setTrongTai(Float.parseFloat(data[7]));
    }

    public XeTai(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, String congSuat, String dungTich, int loaiPhuongTien, float trongTai) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTich, loaiPhuongTien);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+"XeTai{" +
                "trongTai=" + trongTai +
                '}';
    }
}
